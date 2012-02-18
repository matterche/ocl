/**
 * <copyright>
 *
 * Copyright (c) 2005,2012 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 237205
 *   Patrick Könemann - Bug 294200 (history)
 *   E.D.Willink - rework of LPG OCL Console for Xtext
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.console;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.evaluation.EvaluationHaltedException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueImpl;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.EnvironmentFactory;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitorImpl;
import org.eclipse.ocl.examples.pivot.evaluation.PivotEvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.helper.OCLHelper;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.console.actions.CloseAction;
import org.eclipse.ocl.examples.xtext.console.actions.LoadExpressionAction;
import org.eclipse.ocl.examples.xtext.console.actions.SaveExpressionAction;
import org.eclipse.ocl.examples.xtext.console.messages.ConsoleMessages;
import org.eclipse.ocl.examples.xtext.console.xtfo.EmbeddedXtextEditor;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.model.BaseDocument;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLPlugin;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.actions.ClearOutputAction;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

/**
 * The page implementing the Interactive OCL console.
 */
public class OCLConsolePage extends Page
{
	/**
	 * CancelableEvaluationVisitor refines the EvaluationVisitor to poll the monitor foer cancelation at a variety of significant
	 * evaluation events, such as feature vists and {@link #getValueFactory()}.
	 */
    protected static class CancelableEvaluationVisitor extends EvaluationVisitorImpl
    {
		private final IProgressMonitor monitor;
		
		protected CancelableEvaluationVisitor(IProgressMonitor monitor, Environment env, EvaluationEnvironment evalEnv, DomainModelManager modelManager) {
			super(env, evalEnv, modelManager);
			this.monitor = monitor;
		}
		
		@Override
		public EvaluationVisitor createNestedEvaluator() {
			EnvironmentFactory factory = environment.getFactory();
	    	EvaluationEnvironment nestedEvalEnv = factory.createEvaluationEnvironment(evaluationEnvironment);
			return new CancelableEvaluationVisitor(monitor, environment, nestedEvalEnv, modelManager);
		}

		@Override
		protected EvaluationVisitor getUndecoratedVisitor() {
			getValueFactory();
			return super.getUndecoratedVisitor();
		}

		@Override
		public ValueFactory getValueFactory() {
			if (monitor.isCanceled()) {
				setCanceled(true);
			}
			return super.getValueFactory();
		}
	}

    protected static class ExceptionValue extends InvalidValueImpl
	{
		private final String message;
    	private final Exception exception;
    	
		protected ExceptionValue(ValueFactory valueFactory, String message, Exception exception) {
			super(valueFactory);
			this.message = message;
			this.exception = exception;
		}
		
		public Exception getException() {
			return exception;
		}
    	
		public String getMessage() {
			return message;
		}

		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			for (Throwable t = exception; t != null; t = t.getCause()) {
//				s.append(" : "); //$NON-NLS-1$
				s.append(t.getMessage());
				if (t.getCause() != null) {
					s.append("\n"); //$NON-NLS-1$
				}
			}
			return s.toString();
		}
	}
	
	private class EvaluationRunnable implements IRunnableWithProgress
	{
		private final XtextResource resource;
		private final String expression;
		private Value value = null;
		
		public EvaluationRunnable(XtextResource resource, String expression) {
			this.resource = resource;
			this.expression = expression;
		}

		public Value getValue() {
			return value;
		}

		public void run(final IProgressMonitor monitor) {
			monitor.beginTask(NLS.bind(ConsoleMessages.Progress_Title, expression), 10);
			monitor.subTask(ConsoleMessages.Progress_Synchronising);
			monitor.worked(1);
//			CS2PivotResourceAdapter csAdapter = CS2PivotResourceAdapter.getAdapter((BaseCSResource)resource, metaModelManager);
		    MetaModelManager metaModelManager = getMetaModelManager(contextObject);
			ValueFactory valueFactory = metaModelManager.getValueFactory();
//			monitor.subTask(ConsoleMessages.Progress_CST);
//			try {
//				csAdapter.refreshPivotMappings();
//			} catch (Exception e) {
//				value = new ExceptionValue(valueFactory, ConsoleMessages.Result_MappingFailure, e);
//				return;
//			}
//			monitor.worked(2);
//			monitor.subTask(ConsoleMessages.Progress_AST);
			ExpressionInOcl expressionInOcl;
			try {
				PivotUtil.checkResourceErrors(null, resource);
				expressionInOcl = PivotUtil.getExpressionInOcl(resource);
			} catch (ParserException e) {
				value = new ExceptionValue(valueFactory, ConsoleMessages.Result_ParsingFailure, e);
				return;
			}
//			monitor.worked(2);
			monitor.subTask(ConsoleMessages.Progress_Extent);
			PivotEnvironmentFactory envFactory = new PivotEnvironmentFactory(null, metaModelManager);
			PivotEnvironment environment = envFactory.createEnvironment();
			PivotEvaluationEnvironment evaluationEnvironment = envFactory.createEvaluationEnvironment();
			Value contextValue = valueFactory.valueOf(contextObject);
			evaluationEnvironment.add(expressionInOcl.getContextVariable(), contextValue);
//			if (modelManager == null) {
				// let the evaluation environment create one
				modelManager = evaluationEnvironment.createModelManager(contextObject);
//			}
			monitor.worked(2);
			monitor.subTask(ConsoleMessages.Progress_Evaluating);
			try {
//				metaModelManager.setMonitor(monitor);
				EvaluationVisitor evaluationVisitor = new CancelableEvaluationVisitor(monitor, environment, evaluationEnvironment, modelManager);
		        value = evaluationVisitor.visitExpressionInOcl(expressionInOcl);
			} catch (EvaluationHaltedException e) {
				value = new ExceptionValue(valueFactory, ConsoleMessages.Result_EvaluationTerminated, null);
			} catch (InvalidEvaluationException e) {
				value = new ExceptionValue(valueFactory, ConsoleMessages.Result_EvaluationFailure, e);
			} finally {
//				metaModelManager.setMonitor(null);
			}
			monitor.worked(4);
		}
	}
	
	/**
	 * A key listener that listens for the Enter key to evaluate the OCL
	 * expression.
	 */
	private class InputKeyListener implements KeyListener {
		private boolean evaluationSuccess = false;		
		private List<String> history = new ArrayList<String>();
		private int currentHistoryPointer = 0;
		
		public void keyPressed(KeyEvent e) {
			switch (e.keyCode) {
			case SWT.CR :
			    if ((e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {
					String text = getEditorDocument().get();
					evaluationSuccess = evaluate(text.trim());
				}		
				break;
			case SWT.PAGE_UP :
				if ((e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {					
					// history
					if (currentHistoryPointer == 0 && history.size() > 0) {
						if (history.size() > 0 && history.get(0).length() == 0) {
							history.remove(0);
						}
						history.add(0, getEditorDocument().get().trim());
						currentHistoryPointer = 1;
						setTextFromHistory();
					} else if (currentHistoryPointer < history.size() - 1) {
						currentHistoryPointer++;
						setTextFromHistory();
					}
				}			
				break;
			case SWT.PAGE_DOWN :
				if ((e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {					
					// history
					if (currentHistoryPointer > 0) {
						currentHistoryPointer--;
						setTextFromHistory();
					}
				}		
				break;
			}
		}

		public void keyReleased(KeyEvent e) {
			switch (e.keyCode) {
			case SWT.CR :
				if ((e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {
					if (evaluationSuccess) {
						getEditorDocument().set(""); //$NON-NLS-1$
						// history
						if (history.size() > 0 && history.get(0).trim().length() == 0) {
							history.remove(0);
						}
						if (history.size() == 0 || !history.get(0).equals(lastOCLExpression.trim())) {
							history.add(0, lastOCLExpression.trim());
						}
						currentHistoryPointer = 0;
					}					
					evaluationSuccess = false;
				}				
				break;
//			case ' ':
//			    if ((e.stateMask & SWT.CTRL) == SWT.CTRL) {
//			        input.getContentAssistant().showPossibleCompletions();
//			    }
			}
		}

		protected void setTextFromHistory() {
			String newText = history.get(currentHistoryPointer);
			getEditorDocument().set(newText);
			input.setSelectedRange(newText.length(), 0);
		}
	}
    
	private final OCLConsole console;
	private Composite page;
	private ModelingLevel modelingLevel = ModelingLevel.M2;

	private ITextViewer output;
	private ColorManager colorManager;

	private SourceViewer input;
	private EmbeddedXtextEditor editor;
	private String lastOCLExpression;
	
	private ISelectionService selectionService;
	private ISelectionListener selectionListener;
	private EObject contextObject;
	private EClassifier contextClassifier;
	
//	private final CancelableMetaModelManager metaModelManager;
	private  MetaModelManager nullMetaModelManager = null;
	private DomainModelManager modelManager = null;
	
//	private Map<TargetMetamodel, IAction> metamodelActions =
//	    new java.util.HashMap<TargetMetamodel, IAction>();
	
//	private static final AdapterFactory reflectiveAdapterFactory =
//		new ReflectiveItemProviderAdapterFactory();

//	private static final AdapterFactory defaultAdapterFactory =
//		new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

/*	public IItemLabelProvider tupleTypeLabelProvider = new IItemLabelProvider() {
	
		public Object getImage(Object object) {
			return null;
		}
	
		public String getText(Object object) {
		    @SuppressWarnings("unchecked")
            TupleValue tuple = (TupleValue) object;
			TupleType tupleType = tuple.getTupleType();
			
			StringBuilder result = new StringBuilder();
			result.append("Tuple{");//$NON-NLS-1$
			
			for (Iterator<?> iter = tupleType.oclProperties().iterator();
					iter.hasNext();) {
				
				Object next = iter.next();
				
				result.append(oclFactory.getName(next));
				result.append(" = "); //$NON-NLS-1$
				result.append(OCLConsolePage.this.toString(tuple.getValue(next)));
				
				if (iter.hasNext()) {
					result.append(", "); //$NON-NLS-1$
				}
			}
			
			result.append('}');
			
			return result.toString();
		}}; */
	
	/**
	 * Initializes me.
	 * @param oclConsole 
	 */
	OCLConsolePage(OCLConsole console) {
		super();
//		this.metaModelManager = new CancelableMetaModelManager();
		this.console = console;
	}

	/**
     * Adds actions for the available target metamodels to the action bars.
     * 
     * @param metamodelMenu the console's drop-down action bar menu
     * @param metamodelAction the console's drop-down tool bar button
     *
    private void addMetamodelActions(IMenuManager metamodelMenu,
            DropDownAction metamodelAction) {
        IAction ecore = new EcoreMetamodelAction();
		ecore.setChecked(true);
		ImageDescriptor img = getImage(EcoreFactory.eINSTANCE.getEPackage());
		if (img != null) {
		    ecore.setImageDescriptor(img);
		}
		
		metamodelMenu.add(ecore);
		metamodelAction.addAction(ecore);
        metamodelActions.put(TargetMetamodel.Ecore, ecore);
        
        Bundle umlBundle = Platform.getBundle("org.eclipse.uml2.uml"); //$NON-NLS-1$
        if ((umlBundle != null) && isAvailable(umlBundle)) {
    		IAction uml = new UMLMetamodelAction();
            img = getImage(UMLFactory.eINSTANCE.createModel());
            if (img != null) {
                uml.setImageDescriptor(img);
            }
            
    		metamodelMenu.add(uml);
            metamodelAction.addAction(uml);
            metamodelActions.put(TargetMetamodel.UML, uml);
        }
    } */
	
	/**
	 * Appends the specified text to the output viewer.
	 * 
	 * @param text the text to append
	 * @param color the color to print the text with
	 * @param bold whether to print the text bold
	 */
	private void append(String text, Color color, boolean bold) {
		
		IDocument doc = getDocument();
		try {
			int offset = doc.getLength();
			int length = text.length();
			
			text = text + '\n';
			
			if (offset > 0) {
				doc.replace(offset, 0, text);
			} else {
				doc.set(text);
			}
			
			StyleRange style = new StyleRange();
			style.start = offset;
			style.length = length;
			style.foreground = color;
			
			if (bold) {
				style.fontStyle = SWT.BOLD;
			}
			
			output.getTextWidget().setStyleRange(style);
		} catch (BadLocationException e) {
			IStatus status = new Status(
				IStatus.ERROR,
				XtextConsolePlugin.getPluginId(),
				1,
				ConsoleMessages.Output_Exception,
				e);
			
			XtextConsolePlugin.getInstance().getLog().log(status);
		}
	}
	
	@Override
    public void createControl(Composite parent) {
		// force left-to-right text direction in the console, because it
		//    works with OCL text and the OCL language is based on English
		page = new SashForm(parent, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);
		
		output = new TextViewer(page, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		output.getTextWidget().setLayoutData(new GridData(GridData.FILL_BOTH));
		output.getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		output.setEditable(false);
		output.setDocument(new Document());

		colorManager = new ColorManager();
//		document.setOCLFactory(oclFactory);
//		document.setModelingLevel(modelingLevel);
		
		createEditor(page);
		input = editor.getViewer();
		input.getTextWidget().addKeyListener(new InputKeyListener());
		input.getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		
		selectionListener = new ISelectionListener() {
            public void selectionChanged(IWorkbenchPart part, final ISelection selection) {
//				System.out.println("selectionChanged: ");
            	if (part instanceof IConsoleView) {
            		IConsole console = ((IConsoleView)part).getConsole();
                	if (console instanceof OCLConsole) {
                		return;
                	}
            	}
            	if (part instanceof ContentOutline) {
            		ContentOutline contentOutline = (ContentOutline)part;
            		IPage currentPage = contentOutline.getCurrentPage();
                	if (currentPage instanceof OutlinePage) {
                		OutlinePage outlinePage = (OutlinePage)currentPage;
                		IXtextDocument xtextDocument = outlinePage.getXtextDocument();
                		Element pivotElement = xtextDocument.readOnly(new IUnitOfWork<Element, XtextResource>()
                		{
							public Element exec(XtextResource state) throws Exception {
								if (selection instanceof IStructuredSelection) {
									IStructuredSelection structuredSelection = (IStructuredSelection) selection;
									if (structuredSelection.size() == 1) {
										Object selectedObject = structuredSelection.getFirstElement();
										if (selectedObject instanceof EObjectNode) {
											EObjectNode eObjectNode = (EObjectNode)selectedObject;
											URI uri = eObjectNode.getEObjectURI();
											EObject csObject = state.getEObject(uri.fragment());
											if (csObject instanceof Pivotable) {
												Element pivotObject = ((Pivotable)csObject).getPivot();
												if (pivotObject != null) {
									                return pivotObject;													
												}
											}
										}
									}
								}		
								return null;
							}
						});
                		if (pivotElement != null) {
                            OCLConsolePage.this.selectionChanged(new StructuredSelection(pivotElement));
                            return;
                		}
                	}
            	}
                OCLConsolePage.this.selectionChanged(selection);
            }};
		selectionService = getSite().getWorkbenchWindow().getSelectionService();
		selectionService.addPostSelectionListener(selectionListener);
		
		// get current selection
//		ISelection selection = selectionService.getSelection();			// Doesn't have a value preceding console start
		ISelection selection = getActiveSelection();
		selectionChanged(selection);
		
		((SashForm) page).setWeights(new int[] {2, 1});
		
		ClearOutputAction clear = new ClearOutputAction(output);
		CloseAction close = new CloseAction();
		SaveExpressionAction saveExpression = new SaveExpressionAction(this);
		LoadExpressionAction loadExpression = new LoadExpressionAction(this);
		
		IMenuManager menu = getSite().getActionBars().getMenuManager();
		menu.add(loadExpression);
		menu.add(saveExpression);
		menu.add(clear);
		menu.add(close);
	    
//		IMenuManager metamodelMenu = new MenuManager(
//		    OCLInterpreterMessages.console_metamodelMenu,
//		    "org.eclipse.ocl.examples.xtext.console.metamodel"); //$NON-NLS-1$
//		menu.add(metamodelMenu);
//		DropDownAction metamodelAction = new DropDownAction();
//		metamodelAction.setToolTipText(OCLInterpreterMessages.console_metamodelTip);
//		addMetamodelActions(metamodelMenu, metamodelAction);
		
//		IMenuManager levelMenu = new MenuManager(OCLInterpreterMessages.console_modelingLevel);
//		menu.add(levelMenu);
//        DropDownAction levelAction = new DropDownAction();
//        levelAction.setToolTipText(OCLInterpreterMessages.console_modelingLevelTip);
//		IAction m2 = new ModelingLevelAction(ModelingLevel.M2);
//		m2.setChecked(true);
//		levelMenu.add(m2);
//		levelAction.addAction(m2);
//		IAction m1 = new ModelingLevelAction(ModelingLevel.M1);
//		levelMenu.add(m1);
//		levelAction.addAction(m1);

//		ActionContributionItem metamodelItem = new ActionContributionItem(
//		    metamodelAction);
//		metamodelItem.setMode(ActionContributionItem.MODE_FORCE_TEXT);
		
		IToolBarManager toolbar = getSite().getActionBars().getToolBarManager();
//        toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, metamodelItem);
//        toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, levelAction);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, loadExpression);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, saveExpression);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, clear);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, close);
	}

	private int convertHeightInCharsToPixels(int i) {
		// Create a GC to calculate font's dimensions
	    GC gc = new GC(Display.getDefault());
	    gc.setFont(editor.getViewer().getTextWidget().getFont());

	    // Determine string's dimensions
	    FontMetrics fontMetrics = gc.getFontMetrics();

	    int ret = (fontMetrics.getHeight() + fontMetrics.getAscent() + fontMetrics.getDescent() + fontMetrics.getLeading()) * i;
	    
	    // Dispose that gc
	    gc.dispose();
		
	    return ret;
	}

    private void createEditor(Composite s1) {
		
		Composite client = s1; //new Composite(s1, SWT.NULL);
		Injector injector = XtextConsolePlugin.getInstance().getInjector(EssentialOCLPlugin.LANGUAGE_ID);
		Composite editorComposite = client; //new Composite(client, SWT.NULL);
		editor = new EmbeddedXtextEditor(editorComposite, injector, /*SWT.BORDER |*/ SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
//		MetaModelManagerResourceSetAdapter.getAdapter(editor.getResourceSet(), metaModelManager);

/*		editor.getViewer().getTextWidget().addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String text = editor.getViewer().getTextWidget().getText();
				System.out.println("modifyText: " + text);
//				if (!text.equals(getEditedEObject().getAsString())) {
//					getEditor().setDirty(true);
//					getEditor().firePropertyChange(IEditorPart.PROP_DIRTY);
//				} else {
//					getEditor().setDirty(false);
//					getEditor().firePropertyChange(IEditorPart.PROP_DIRTY);
//				} 
			}
		}); */
/*		editor.getDocument().addModelListener(new IXtextModelListener() {
			public void modelChanged(XtextResource resource) {
				System.out.println("modelChanged: " + resource);
//				reconcileChangedModel();
			}
		}); */
		
		editor.getViewer().getTextWidget().addVerifyKeyListener(new VerifyKeyListener() {
			public void verifyKey(VerifyEvent e) {
//				System.out.println("verifyKey: " + e.keyCode);
				if (e.keyCode == SWT.KEYPAD_CR || e.keyCode == SWT.CR) {
					if ((e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {					
						e.doit = false;
					}
				}
			}
		});
		
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint= convertHeightInCharsToPixels(1);
		editorComposite.setLayoutData(data);
	}
	
	/**
	 * Extends the inherited method to dispose of additional colour resources.
	 */
	@Override
    public void dispose() {
	    colorManager.dispose();
	    selectionService.removePostSelectionListener(selectionListener);
	    
		super.dispose();
	}
	
	/**
	 * Prints an error message to the output viewer, in red text.
	 * 
	 * @param message the error message to print
	 */
	private void error(String message) {
		append(message, colorManager.getColor(ColorManager.OUTPUT_ERROR), false);
		scrollText();
	}
	
	/**
	 * Evaluates an OCL expression using the OCL Interpreter's {@link OCLHelper}
	 * API.
	 * 
	 * @param expression an OCL expression
	 * 
	 * @return <code>true</code> on successful evaluation; <code>false</code>
	 *    if the expression failed to parse or evaluate
	 */
	boolean evaluate(final String expression) {        
//		if (contextObject == null) {
//			error(OCLInterpreterMessages.console_noContext);
//			return false;
//		} 
		if ((expression == null) || (expression.trim().length() <= 0)) {
			error(ConsoleMessages.Result_NoExpression);
			return false;
		} 
//		editorDocument.getResource();
		// create an OCL helper to do our parsing and evaluating
//      ocl = oclFactory.createOCL(modelingLevel);
//      OCLHelper helper = ocl.createOCLHelper();
		boolean result = true;			
		try {
				// set our helper's context classifier to parse against it
//	        ConstraintKind kind = modelingLevel.setContext(helper, context, oclFactory);
				
			IDocument doc = getDocument();
			Color defaultColor = colorManager.getColor(ColorManager.DEFAULT);
            Color resultsColor = colorManager.getColor(ColorManager.OUTPUT_RESULTS);
            Color errorColor = colorManager.getColor(ColorManager.OUTPUT_ERROR);
				
            if (doc.getLength() > 0) {
				// separate previous output by a blank line
				append("", defaultColor, false); //$NON-NLS-1$
			}
			
			append(ConsoleMessages.Heading_Evaluating, defaultColor, true);
			append(expression, defaultColor, false);
			append(ConsoleMessages.Heading_Results, defaultColor, true);
            
            switch (modelingLevel) {
                case M2:
        			final BaseDocument editorDocument = getEditorDocument();
        			Value value = null;
        			try {
        				value = editorDocument.readOnly(new IUnitOfWork<Value, XtextResource>() {
 
						public Value exec(XtextResource state) throws Exception {
							IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
							EvaluationRunnable runnable = new EvaluationRunnable(state, expression);
							progressService.busyCursorWhile(runnable);
			       			return runnable.getValue();
						}});
           			}
        			catch (Exception e) {
        				append(e.getMessage(), errorColor, false);
        			}
        			if (value instanceof ExceptionValue) {
        				append(((ExceptionValue)value).getMessage(), errorColor, true);
        				append(String.valueOf(value), errorColor, false);
        			}
        			else if ((value != null) && (value.isCollectionValue() != null)) {
        				for (Value elementValue : value.isCollectionValue()) {
        					append(String.valueOf(elementValue), resultsColor, false);
        				}
        			}
        			else if (value != null) {
        				append(String.valueOf(value), resultsColor, false);
        			}
        			else {
        				append(String.valueOf(value), errorColor, false);
        			}
                	scrollText();
                    break;
                case M1:
//                    helper.createConstraint(kind, expression);
                    
                    // just report a successful parse
                	append(ConsoleMessages.Result_Parsed, resultsColor, false);
                	scrollText();
                    break;
            }
            
			// store the successfully parsed expression
			lastOCLExpression = expression;
		} catch (Exception e) {
			result = false;
			error((e.getLocalizedMessage() == null) ? e.getClass().getName()
					: e.getLocalizedMessage());
		}
		
		return result;
	}

	protected ISelection getActiveSelection() {
		try {
			IPageSite site = getSite();
			if (site == null) {
				return null;
			}
			IWorkbenchWindow workbenchWindow = site.getWorkbenchWindow();
			if (workbenchWindow == null) {
				return null;
			}
			IWorkbenchPage activePage = workbenchWindow.getActivePage();
			if (activePage == null) {
				return null;
			}
			IEditorPart activeEditor = activePage.getActiveEditor();
			if (activeEditor == null) {
				return null;
			}
			IEditorSite editorSite = activeEditor.getEditorSite();
			if (editorSite == null) {
				return null;
			}
			ISelectionProvider selectionProvider = editorSite.getSelectionProvider();
			if (selectionProvider == null) {
				return null;
			}
			return selectionProvider.getSelection();
		}
		catch (Exception e) {
			return  null;
		}
	}
    
	@Override
    public Control getControl() {
		return page;
	}
	
	/**
	 * Obtains the document in the output viewer.
	 * 
	 * @return the output document
	 */
	private IDocument getDocument() {
		return output.getDocument();
	}

	public IXtextDocument getDocument(URI trimFragment) {
		return getEditorDocument();
	}
	
	public BaseDocument getEditorDocument() {
		return (BaseDocument) editor.getDocument();
	}
    
    /**
     * Gets the editor image for the specified element.
     * 
     * @param element a model element
     * 
     * @return the corresponding image
     *
    private ImageDescriptor getImage(EObject element) {
        ImageDescriptor result = null;
        
        IItemLabelProvider provider = (IItemLabelProvider) new ComposedAdapterFactory(
            ComposedAdapterFactory.Descriptor.Registry.INSTANCE).adapt(
                element, IItemLabelProvider.class);
        if (provider != null) {
            Object image = provider.getImage(element);
            if (image != null) {
                result = ExtendedImageRegistry.INSTANCE.getImageDescriptor(image);
            }
        }
        
        return result;
    } */
	
	public String getLastOCLExpression() {
		return lastOCLExpression;
	}

	public MetaModelManager getMetaModelManager(EObject contextObject) {
		MetaModelManager metaModelManager = ElementUtil.findMetaModelManager(contextObject);
		if (metaModelManager != null) {
			return metaModelManager;
		}
		if (nullMetaModelManager == null) {
			nullMetaModelManager = new MetaModelManager();
		}
		return nullMetaModelManager;
	}
	
	/**
	 * Prints the specified <code>object</code> to the output viewer.  The
	 * object is converted to a string using the best matching EMF label
	 * provider adapter if it is an {@link EObject}; otherwise, just use
	 * {@link String#valueOf(java.lang.Object)} on it.  If the
	 * <code>object</code> is a collection or an array, then we print each
	 * element on a separate line.
	 * 
	 * @param object the object or collection to print
	 * @param color the color to print the <code>object</code> with
	 * @param bold whether to display it in bold text
	 *
	private void print(Value value, Color color, boolean bold) {
		CollectionValue collectionValue = value.isCollectionValue();
		if (collectionValue != null) {
			for (Value elementValue : collectionValue) {
				append(String.valueOf(elementValue), color, bold);
			}
		}
		else {
			append(String.valueOf(value), color, bold);
		}
/*		Collection<?> toPrint;
		
		if (object == null) {
			toPrint = Collections.EMPTY_SET;
		} else if (object instanceof Collection) {
			toPrint = (Collection<?>) object;
		} else if (object.getClass().isArray()) {
			toPrint = Arrays.asList((Object[]) object);
		} else {
			toPrint = Collections.singleton(object);
		}
		
		for (Iterator<?> iter = toPrint.iterator(); iter.hasNext();) {
			append(toString(iter.next()), color, bold);
		} * /
//		append(String.valueOf(object), color, bold);
		
		scrollText();
	} */

	protected void refreshSelection(final Object selected) {
		final BaseDocument editorDocument = getEditorDocument();
		editorDocument.modify(new IUnitOfWork<Object, XtextResource>()
		{
			public Value exec(XtextResource resource) throws Exception {
				Object selectedObject = selected;
			    if (selectedObject instanceof IOutlineNode) {
		    	    if (selectedObject instanceof EObjectNode) {
		                EObjectNode selectedObjectNode = (EObjectNode) selectedObject;
		                URI eObjectURI = selectedObjectNode.getEObjectURI();
		        		contextObject = null; // FIXME metaModelManager.loadResource(eObjectURI, null, null);
		        		contextClassifier = selectedObjectNode.getEClass();
		    	    }
		    	    else if (selectedObject instanceof EStructuralFeatureNode) {
		            	contextObject = null;
		    	    	contextClassifier = ((EStructuralFeatureNode) selectedObject).getEStructuralFeature().getEContainingClass();
		    	    }
		    	    else {
		            	contextObject = null;
		    	    	contextClassifier = null;
		    	    }
			    }
			    else {
			    	if (selectedObject instanceof IAdaptable) {
			    		selectedObject = ((IAdaptable) selectedObject).getAdapter(EObject.class);
		            }
		            if (selectedObject instanceof EObject) {
		            	contextObject = (EObject) selectedObject;
		            	contextClassifier = contextObject.eClass();
		            }
		            else {
		            	contextObject = null;
		            	contextClassifier = null;
		            }
			    }	        
			    MetaModelManager metaModelManager = getMetaModelManager(contextObject);
				if (contextObject != null) {
					CS2PivotResourceAdapter.getAdapter(resource, metaModelManager);
				}
				MetaModelManagerResourceSetAdapter.getAdapter(editor.getResourceSet(), metaModelManager);
		        editorDocument.setContext((EssentialOCLCSResource) resource, contextClassifier, null);
		        console.setSelection(contextClassifier, contextObject);
		        return null;
			}
		});
	}
	
	/**
	 * Ensures that the last text printed to the output viewer is shown.
	 */
	private void scrollText() {
		output.revealRange(getDocument().getLength(), 0);
	}
	
	private void selectionChanged(ISelection sel) {
		Object selectedObject = null;
	    if (sel instanceof IStructuredSelection) {
            IStructuredSelection ssel = (IStructuredSelection) sel;
            
            if (!ssel.isEmpty()) {
                selectedObject = ssel.getFirstElement();
            }
	    }
        refreshSelection(selectedObject);
	}

	@Override
    public void setFocus() {
		input.getTextWidget().setFocus();
	}
	
	/**
	 * Programmatically sets my target metamodel.
	 * 
	 * @param metamodel the target metamodel
	 *
	public void setTargetMetamodel(TargetMetamodel metamodel) {
	    IAction action = metamodelActions.get(metamodel);

	    if (action != null) {
	        // deselect the old one
	        metamodelActions.get(oclFactory.getTargetMetamodel()).setChecked(false);
	        
    	    action.run();
    	    action.setChecked(true);
	    }
	} */
	
	/**
	 * Converts a single object to a string, according to the rules described
	 * for the {@link #print(Object, Color, boolean)} method.
	 * 
	 * @param object the object to print (not a collection type)
	 * @return the string form of the <code>object</code>
	 * 
	 * @see #print(Object, Color, boolean)
	 *
	String toString(Object object) {
		if (ocl.isInvalid(object)) {
			return "OclInvalid"; //$NON-NLS-1$
		} else if (object instanceof String) {
			return "'" + object + "'";  //$NON-NLS-1$//$NON-NLS-2$
		} else if (object instanceof TupleValue) {
			return tupleTypeLabelProvider.getText(object);
		} else if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			
			IItemLabelProvider labeler =
				(IItemLabelProvider) defaultAdapterFactory.adapt(
					eObject,
					IItemLabelProvider.class);
			
			if (labeler == null) {
				labeler = (IItemLabelProvider) reflectiveAdapterFactory.adapt(
					eObject,
					IItemLabelProvider.class);
			}
			
			if (labeler != null) {
				return labeler.getText(object);
			}
		}
		
		return String.valueOf(object);
	} */
}
