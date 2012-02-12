/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrettyPrintNameVisitor.java,v 1.5 2011/05/22 21:06:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

/**
 * The PrettyPrintNameVisitor supports pretty printing of a name-like description.
 * PrettyPrintOptions may be used to configure the printing.
 */
public class PrettyPrintNameVisitor extends AbstractExtendingVisitor<Object,PrettyPrintOptions>
{	
	public static Namespace getNamespace(EObject element) {
		for (EObject eObject = element; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof Type) {
				return (Namespace) eObject;
			}
			if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
				return (Namespace) eObject;
			}
		}
		return null;
	}

	public static String prettyPrint(Visitable element) {
		return prettyPrint(element, PrettyPrintTypeVisitor.createOptions(null));
	}

	public static String prettyPrint(Visitable element, Namespace namespace) {
		return prettyPrint(element, PrettyPrintTypeVisitor.createOptions(namespace));
	}

	public static String prettyPrint(Visitable element, PrettyPrintOptions options) {
		PrettyPrintNameVisitor visitor = new PrettyPrintNameVisitor(options);
		try {
			visitor.safeVisit(element);
			return visitor.toString();
		}
		catch (Exception e) {
			e.printStackTrace();
			return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
		}
	}

	public static class Printer
	{
		public Printer() {}
		
		public String prettyPrint(Visitable element, Namespace scope) {
			return prettyPrint(element, PrettyPrintTypeVisitor.createOptions(scope));
		}
		public String prettyPrintAsTextile(Visitable element, Namespace scope) {
			PrettyPrintOptions options = PrettyPrintTypeVisitor.createOptions(scope);
			options.setUseParentheses(false);
			return prettyPrint(element, options);
		}
		public String prettyPrint(Visitable element, PrettyPrintOptions options) {
			PrettyPrintNameVisitor visitor = new PrettyPrintNameVisitor(options);
			try {
				visitor.safeVisit(element);
				String string = visitor.toString(options.getIndentStep(), options.getLinelength());
//				System.out.println("Name-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
				return string;
			}
			catch (Exception e) {
				e.printStackTrace();
				return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
			}
		}
	}
	
	protected final PrettyPrintTypeVisitor delegate;
	protected final MetaModelManager metaModelManager;
	
	/**
	 * Initializes me.
	 */
	public PrettyPrintNameVisitor(PrettyPrintOptions options) {
		super(options);
		delegate = new PrettyPrintTypeVisitor(options);
		Namespace scope = options.getScope();
		Resource resource = scope != null ? scope.eResource() : null;
		ResourceSet resourceSet = resource !=  null ? resource.getResourceSet() : null;
		metaModelManager = MetaModelManager.getAdapter(resourceSet);
	}

	@Override
	public String toString() {
		return delegate.toString();
	}
	
	public String toString(String indent, int lineLength) {
		return delegate.toString(indent, lineLength);
	}

	@Override
	public Object visitClass(Class object) {
		TemplateParameter owningTemplateParameter = object.getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter.accept(this);
		}
		return super.visitClass(object);
	}

	@Override
	public String visitNamedElement(NamedElement object) {
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object, context.getReservedNames());
		return null;
	}

	@Override
	public Object visitOperation(Operation object) {
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object);
		delegate.appendTemplateParameters(object);
		delegate.appendTemplateBindings(object);
		delegate.appendParameters(object, true);
		Type type = object.getType();
		if (type != null) {
			delegate.append(" : ");
			delegate.appendTypedMultiplicity(object);
		}
		return null;
	}

	@Override
	public Object visitTemplateParameter(TemplateParameter object) {
//		delegate.appendParent(context.getScope(), object.getSignature(), "::");
		delegate.appendName((NamedElement) object.getParameteredElement());
		return null;
	}

	@Override
	public Object visitTupleType(TupleType object) {
		boolean useParentheses = context.getUseParentheses();
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object);
		List<Property> tupleParts = object.getOwnedAttribute();
		if (!tupleParts.isEmpty()) {
			delegate.append(useParentheses ? "(" : "<");
			String prefix = ""; //$NON-NLS-1$
			for (Property tuplePart : tupleParts) {
				delegate.append(prefix);
				delegate.appendElement(tuplePart);
				prefix = ",";
			}
			delegate.append(useParentheses ? ")" : ">");
		}
		return null;
	}

	@Override
	public Object visitType(Type object) {
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object);
		delegate.appendTemplateParameters(object);
		delegate.appendTemplateBindings(object);
		return null;
	}

	@Override
	public Object visitTypedElement(TypedElement object) {
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object);
		delegate.append(" : ");
		delegate.appendElement(object.getType());
		return null;
	}

	@Override
	public Object visitTypedMultiplicityElement(TypedMultiplicityElement object) {
		delegate.appendParent(context.getScope(), object, "::");
		delegate.appendName(object);
		delegate.append(" : ");
		delegate.appendTypedMultiplicity(object);
		return null;
	}

	public String visiting(Visitable visitable) {
		delegate.visiting(visitable);
		return null;
	}
}
