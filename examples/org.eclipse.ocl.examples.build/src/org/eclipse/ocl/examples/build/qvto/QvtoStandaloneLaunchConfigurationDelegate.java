/*******************************************************************************
 * Copyright (c) 2007,2012 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     E.D.Willink - revision to support Standalone usage
 *******************************************************************************/
package org.eclipse.ocl.examples.build.qvto;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.m2m.internal.qvt.oml.ast.env.ModelExtentContents;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.common.io.eclipse.EclipseFile;
import org.eclipse.m2m.internal.qvt.oml.common.launch.TargetUriData;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfException;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.internal.qvt.oml.emf.util.Logger;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.m2m.internal.qvt.oml.emf.util.WorkspaceUtils;
import org.eclipse.m2m.internal.qvt.oml.library.Context;
import org.eclipse.m2m.internal.qvt.oml.runtime.generator.TraceSerializer;
import org.eclipse.m2m.internal.qvt.oml.runtime.generator.TransformationRunner;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.Messages;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchConfigurationDelegateBase;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtValidator;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation;
import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.osgi.util.NLS;

/**
 * This class contains substantial copies of QvtLaunchConfigurationDelegateBase code with tiny adjustments to allow
 * usage in a non-Eclipse environment.
 */
@SuppressWarnings("restriction")
public class QvtoStandaloneLaunchConfigurationDelegate extends QvtLaunchConfigurationDelegateBase
{
    public static void doLaunch(QvtTransformation transformation, List<ModelContent> inObjs, Map<String, Object> configProps,
    		List<ModelExtentContents> outExtents, List<EObject> outMainParams, List<Trace> outTraces, List<String> outConsole) throws MdaException {

        IStatus status = QvtValidator.validateTransformation(transformation, inObjs, null);                    
        if (status.getSeverity() > IStatus.WARNING) {
        	throw new MdaException(status);
        }      	
    	
        Context context = QvtLaunchUtil.createContext(configProps);

		final StringWriter consoleLogger = new StringWriter();
		context.setLog(new WriterLog(consoleLogger));
    	
        TransformationRunner.In in = new TransformationRunner.In(inObjs.toArray(new ModelContent[inObjs.size()]), context);
        TransformationRunner.Out out = transformation.run(in);

        outExtents.addAll(out.getExtents());

        for (Object outValue : out.getOutParamValues()) {
        	if (outValue instanceof EObject) {
        		outMainParams.add((EObject) outValue);
        	}
        	else {
        		outMainParams.add(null);
        	}
        }
        
        if (out.getTrace() != null) {
        	outTraces.add(out.getTrace());
        }
        outConsole.add(consoleLogger.getBuffer().toString());
    }
        
    public static List<URI> doLaunch(final QvtTransformation transformation, final List<ModelContent> inObjs,
    		List<TargetUriData> targetData, final String traceFileName, IContext context) throws Exception {
    	
        TransformationRunner.In in = new TransformationRunner.In(inObjs.toArray(new ModelContent[inObjs.size()]), context);
        TransformationRunner.Out out = transformation.run(in);
        
        ResourceSet resSet = null;
        for (ModelContent inModel : inObjs) {
			resSet = inModel.getResourceSet();
			if(resSet != null) {
				break;
			}
		}        
        if(resSet == null) {
        	resSet = EmfUtil.getOutputResourceSet();
        }
        
        Iterator<ModelExtentContents> itrExtent = out.getExtents().iterator();
        for (TargetUriData outUriData : targetData) {
        	if (!itrExtent.hasNext()) {
        		throw new MdaException("Imcomplete transformation results"); //$NON-NLS-1$
        	}
        	saveTransformationResult(itrExtent.next(), outUriData, resSet);
        }

        List<URI> result = new ArrayList<URI>(out.getOutParamValues().size());
        for (Object outValue : out.getOutParamValues()) {
        	if (outValue instanceof EObject) {
        		result.add(EcoreUtil.getURI((EObject) outValue));
        	}
        	else {
        		result.add(null);
        	}
        }
        
        if(traceFileName != null && out.getTrace() != null) {
        	URI traceUri = EmfUtil.makeUri(traceFileName);
            IFile traceFile = traceUri != null ? WorkspaceUtils.getWorkspaceFile(traceUri) : null;
            if(traceFile != null) {
            	TraceSerializer traceSerializer = new TraceSerializer(out.getTrace());
            	traceSerializer.saveTraceModel(new EclipseFile(traceFile));
            	traceSerializer.markUnboundObjects(traceFile);
            }
        }        
        
        return result;
    }
    
    @SuppressWarnings("unchecked")
	private static void saveTransformationResult(ModelExtentContents extent, TargetUriData targetData, ResourceSet resSet) throws MdaException {    	
    	URI outUri = toUri(targetData.getUriString());
    	
        switch(targetData.getTargetType()) {
        	case NEW_MODEL: {
        		try {
            		URI modelUri = outUri.trimFragment();
           	    	Resource outExtent = resSet.getResource(modelUri, false);
           	    	if(outExtent == null) {
           	    		outExtent = EmfUtil.createResource(modelUri, resSet);       	    	
               			resSet.getResources().add(outExtent);
               			outExtent.getContents().addAll(extent.getAllRootElements());
           	    	} else {
           	    		Set<EObject> essentialRootElements = getEssentialRootElements(extent.getAllRootElements());

           	    		if (essentialRootElements.isEmpty()) {
           	    			outExtent.getContents().clear();
           	    		}
           	    		else if (outExtent.getContents().isEmpty()) {
               	    		outExtent.getContents().addAll(essentialRootElements);
           	    		}
           	    		else {
           	    			Set<EObject> resolvedRootElements = getResolvedContent(essentialRootElements, outExtent.getContents().get(0));
           	    			
               	    		outExtent.getContents().retainAll(resolvedRootElements);
               	    		resolvedRootElements.removeAll(outExtent.getContents());
               	    		outExtent.getContents().addAll(resolvedRootElements);
           	    		}
           	    	}
           	    	
        			EmfUtil.saveModel(outExtent, modelUri, EmfUtil.DEFAULT_SAVE_OPTIONS);
        		}
        		catch(EmfException e) {
        			throw new MdaException(e);
        		}
        		break;
        	}
        	
        	case EXISTING_CONTAINER: {
        		ModelContent loadModel = EmfUtil.loadModel(outUri, resSet);
	        	EObject container = (loadModel != null && !loadModel.getContent().isEmpty() ? loadModel.getContent().get(0) : null);
	            if(container == null) {
	                throw new MdaException("No object at " + outUri); //$NON-NLS-1$
	            }
	            
		        EStructuralFeature feature = container.eClass().getEStructuralFeature(targetData.getFeature());
		        if (feature == null) {
	                throw new MdaException("Reference " + targetData.getFeature() + " not found in " + container); //$NON-NLS-1$ //$NON-NLS-2$
		        }

		        if (targetData.isClearContents() && FeatureMapUtil.isMany(container, feature)) {
		        	List<EObject> value = (List<EObject>) container.eGet(feature);
		        	if (value != null) {
		        		value.clear();
		        	}
		        }
		        
        		for (EObject out : extent.getAllRootElements()) {
			        if (FeatureMapUtil.isMany(container, feature)) {
			        	List<EObject> value = (List<EObject>) container.eGet(feature);
			        	try {
			        		value.add(out);
			        	}
			        	catch (RuntimeException ex) {
			        		throw new MdaException(NLS.bind(Messages.QvtLaunchConfigurationDelegateBase_FeatureSetFailure,
			        				EmfUtil.getFullName(out.eClass()), targetData.getFeature()));
			        	}
			        }
			        else {
			        	container.eSet(feature, out);
			        }
        		}
        		
		        try {
		        	saveResource(container);
		        }
		        catch(IOException e) {
		        	throw new MdaException(e.getMessage(), e);
		        }
		        
		        break;
        	}
        	
        	case INPLACE: {
       			throw new MdaException("Inplace run configuration type is not supported"); //$NON-NLS-1$
        	}
        }
        
//        org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils.refresh(outUri);
    }

	private static Set<EObject> getResolvedContent(Collection<EObject> content, EObject metamodel) {
		Set<EObject> resolvedObjs = new LinkedHashSet<EObject>(content.size());
		for (EObject obj : content) {
			EObject resolved = null;
			try {
				resolved = EmfUtil.resolveSource(obj, metamodel);
			}
			catch (Exception ex) {				
			}
			resolvedObjs.add(resolved != null ? resolved : obj);
		}
		return resolvedObjs;
	}
    
    private static Set<EObject> getEssentialRootElements(List<EObject> allRootElements) {
    	Set<EObject> roots = new LinkedHashSet<EObject>();
    	for (EObject e : allRootElements) {
    		EObject nextRoot = e;
    		while (nextRoot.eContainer() instanceof EObject && nextRoot.eContainer().eResource() == e.eResource()) {
    			nextRoot = nextRoot.eContainer();
    		}
    		roots.add(nextRoot);
    	}
		return roots;
	}

	private static void saveResource(EObject obj) throws IOException {
    	Resource resource = obj.eResource();
    	if(resource == null) {
    		Logger.getLogger().warning("Object has no resource: " + obj); //$NON-NLS-1$
    		return;
    	}

		resource.save(EmfUtil.DEFAULT_SAVE_OPTIONS);
	}

    private static URI toUri(String uriString) throws MdaException {
        URI uri = URI.createURI(uriString);  
        if(uri == null) {
            throw new MdaException(NLS.bind(Messages.QvtValidator_InvalidUri, uriString));
        }
        
        return uri;
    }

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		
	}    
}
