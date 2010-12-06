/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: BaseLabelProvider.java,v 1.1.2.2 2010/12/06 18:08:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.labeling;

import java.net.URL;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.osgi.framework.Bundle;

import com.google.inject.Inject;

/**
 * Provides labels for BaseCST objects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class BaseLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public BaseLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	protected void appendClass(StringBuffer s, Object object) {
		s.append("<");
		s.append(object != null ? object.getClass().getSimpleName() : "null");
		s.append(">");
	}

	protected void appendMultiplicity(StringBuffer s, TypedMultiplicityElement ele) {
//		String multiplicity = ele.getMultiplicity();
//		if (multiplicity != null) {
//			s.append("[");
//			s.append(multiplicity);
//			s.append("]");
//		}
//		else {
			int lower = ele.getLower().intValue();
			int upper = ele.getUpper().intValue();
			if ((lower != 1) || (upper != 1)) {
				s.append("[");
				if (upper < 0) {
					if (lower == 1) {
						s.append("+");
					}
					else {
						if (lower != 0) {
							s.append(lower);
							s.append("..");
						}
						s.append("*");
					}
				}
				else if ((lower == 0) && (upper == 1)) {
					s.append("?");
				}
				else {
					s.append(lower);
					if (lower != upper) {
						s.append("..");
						s.append(upper);
					}
				}
				s.append("]");
			}
//		}
	}

	protected void appendName(StringBuffer s, NamedElement element) {
		if (element != null) {
			if (element.eIsProxy()) {
				EcoreUtil.resolve(element, element);
			}
			appendString(s, element.getName());
		}	
	}

	protected void appendName(StringBuffer s, NamedElementCS csElement) {
		if (csElement != null) {
			if (csElement.eIsProxy()) {
				EcoreUtil.resolve(csElement, csElement);
			}
			appendString(s, csElement.getName());
		}	
	}

	protected void appendOptionalName(StringBuffer s, NamedElementCS csElement) {
		if (csElement != null) {
			appendOptionalString(s, csElement.getName());
		}	
	}

	protected void appendOptionalString(StringBuffer s, String string) {
		if (string != null) {
			s.append(string);
		}	
	}

	protected void appendParameters(StringBuffer s, List<Parameter> parameters) {
		s.append("(");
		String prefix = "";
		for (Parameter csParameter : parameters) {
			s.append(prefix);
			appendType(s, csParameter.getType());
			appendMultiplicity(s, csParameter);
			prefix = ", ";
		}
		s.append(")");
	}

	protected void appendString(StringBuffer s, String string) {
		if (string != null) {
			s.append(string);
		}	
		else {
			s.append("<null>");
		}	
	}

	protected void appendString(StringBuffer s, String string, int countLimit) {
		if (string == null) {
			s.append("<null>");
		}	
		else if (string.length() > countLimit){
			s.append(string.substring(0, countLimit-3));
			s.append("...");
		}	
		else {
			s.append(string);
		}	
	}

	protected void appendSuperTypes(StringBuffer s, List<org.eclipse.ocl.examples.pivot.Class> superTypes) {
		if (!superTypes.isEmpty()) {
			String prefix = " -> ";
			for (org.eclipse.ocl.examples.pivot.Class superType : superTypes) {
				s.append(prefix);
				appendType(s, superType);
				prefix = ", ";
			}
		}
	}

	protected void appendType(StringBuffer s, TypeRefCS type) {
		Element pivot = type.getPivot();
		if (pivot instanceof MonikeredElement) {
			appendString(s, ((MonikeredElement)pivot).getMoniker());
		}
		else {
			appendString(s, "null");
		}
/*		if (type instanceof PrimitiveTypeRefCS) {
			appendName(s, (PrimitiveTypeRefCS)type);
		}
//		else if (type instanceof CollectionTypeRefCS) {
//			appendName(s, (CollectionTypeRefCS)type);
//			appendTemplateBinding(s, ((CollectionTypeRefCS)type).getOwnedTemplateBinding());
//		}
		else if (type instanceof QualifiedTypeRefCS) {
			appendType(s, ((QualifiedTypeRefCS)type).getElement());
		}
		else if (type instanceof TypedTypeRefCS) {
			appendType(s, ((TypedTypeRefCS)type).getType());
			appendTemplateBinding(s, ((TypedTypeRefCS)type).getOwnedTemplateBinding());
		}
		else if (type instanceof WildcardTypeRefCS) {
			s.append("?");
		} */
	}

	protected void appendTemplateParameterSubstitution(StringBuffer s, TemplateParameterSubstitutionCS csTemplateParameterSubstitution) {
		TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution) csTemplateParameterSubstitution.getPivot();
		appendName(s, (NamedElement) templateParameterSubstitution.getFormal().getParameteredElement()
	);
		s.append(" => ");
		appendType(s, (TypeRefCS) csTemplateParameterSubstitution.getOwnedActualParameter());
	}

	protected void appendTemplateBinding(StringBuffer s, TemplateBindingCS templateBinding) {
		if (templateBinding != null) {
			Collection<TemplateParameterSubstitutionCS> templateParameterSubstitutions = templateBinding.getOwnedParameterSubstitution();
			appendTemplateParameterSubstitutions(s, templateParameterSubstitutions);
		}
	}

	protected void appendTemplateParameterSubstitutions(StringBuffer s, Collection<TemplateParameterSubstitutionCS> templateParameterSubstitutions) {
		s.append("<");
		String prefix = "";
		for (TemplateParameterSubstitutionCS templateParameterSubstitution : templateParameterSubstitutions) {
			s.append(prefix);
			appendTemplateParameterSubstitution(s, templateParameterSubstitution);
			prefix = ", ";
		}
		s.append(">");
	}

	protected void appendTemplateSignature(StringBuffer s, TemplateableElement templateableElement) {
		if (templateableElement != null) {
			TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
			if (templateSignature != null) {
				s.append("<");
				Collection<TemplateParameter> templateParameters = templateSignature.getParameters();
				if (!templateParameters.isEmpty()) {
					String prefix = "";
					for (TemplateParameter templateParameter : templateParameters) {
						s.append(prefix);
						appendName(s, (NamedElement) templateParameter.getParameteredElement());
						prefix = ", ";
					}
				}
				s.append(">");
			}
		}
	}

	protected void appendType(StringBuffer s, Type type) {
		appendName(s, type);
	}
	
	@Override
	protected Image convertToImage(Object imageDescription) {
		if (imageDescription instanceof String) {
			String imagePath = (String)imageDescription;
			if (imagePath.startsWith("/")) {	
				int index = imagePath.indexOf('/', 1);
				if (index > 1) {
					String bundlePath = imagePath.substring(1, index);
					Bundle bundle = Platform.getBundle(bundlePath);
					if (bundle != null) {
						String imageFile = imagePath.substring(index+1);
						Path path = new Path(imageFile);
						URL imgUrl = FileLocator.find(bundle, path, null);
						if (imgUrl != null) {
							return super.convertToImage(ImageDescriptor.createFromURL(imgUrl));
						}
					}
				}
			}				
		}
		return super.convertToImage(imageDescription);
	}
	 
	@Override
	protected Object doGetText(Object element) {
		Object object = super.doGetText(element);
		if (object instanceof String) {
			String text = (String)object;
			int index = text.indexOf('\n');
			if (index >= 0) {
				text = text.substring(0, index);
			}
			object = text.trim();
		}
		return object;
	}

	protected String text(Element ele) {
		return "<" + ele.getClass().getSimpleName() + ">";
	}

	protected String image(Annotation ele) {
		return "/org.eclipse.emf.ecore.edit/icons/full/obj16/EAnnotation.gif";
	}

	public String text(Annotation ele) {
		StringBuffer s = new StringBuffer();
		s.append("\"");
		appendString(s, ele.getName(), 40);			
		s.append("\"");
		return s.toString();
	}

	protected String image(org.eclipse.ocl.examples.pivot.Class ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Class.gif";
	}

	protected String text(org.eclipse.ocl.examples.pivot.Class ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		appendTemplateSignature(s, ele);
		appendSuperTypes(s, ele.getSuperClasses());
		return s.toString();
	}

	protected String image(Comment ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Comment.gif";
	}

	public String text(Comment ele) {
		StringBuffer s = new StringBuffer();
		s.append("\"");
		appendString(s, ele.getBody(), 40);			
		s.append("\"");
		return s.toString();
	}

	protected String text(DataType ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
/*		List<TemplateParameterCS> typeParameters = ElementUtil.getTemplateParameters(ele);
		if (!typeParameters.isEmpty()) {
			s.append("<");
			String prefix = "";
			for (TemplateParameterCS typeParameter : typeParameters) {
				s.append(prefix);
				appendTemplateParameter(s, typeParameter);
				prefix = ", ";
			}
			s.append(">");
		} */ // FIXME
		String instance = ele.getInstanceClassName();
		if (instance != null) {
			s.append(" [");
			s.append(instance);
			s.append("]");
		}
		return s.toString();
	}

	protected String text(org.eclipse.ocl.examples.pivot.Enumeration ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
/*		List<TemplateParameterCS> typeParameters = ElementUtil.getTemplateParameters(ele);
		if (!typeParameters.isEmpty()) {
			s.append("<");
			String prefix = "";
			for (TemplateParameterCS typeParameter : typeParameters) {
				s.append(prefix);
				appendTemplateParameter(s, typeParameter);
				prefix = ", ";
			}
			s.append(">");
		} */ // FIXME
		String instance = ele.getInstanceClassName();
		if (instance != null) {
			s.append(" [");
			s.append(instance);
			s.append("]");
		}
		return s.toString();
	}

	protected String image(Detail ele) {
		return "/org.eclipse.emf.ecore.edit/icons/full/obj16/EStringToStringMapEntry.gif";
	}

	public String text(Detail ele) {
		StringBuffer s = new StringBuffer();
		s.append("\"");
		appendString(s, ele.getName());			
		s.append("\" : ");
		appendString(s, ele.getValues().get(0), 40);
		return s.toString();
	}

	protected String image(EnumerationLiteral ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/EnumerationLiteral.gif";
	}

	protected String text(EnumerationLiteral ele) {
		return ele.getName();
	}

	protected String image(ImportCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/PackageImport.gif";
	}

	protected String text(ImportCS ele) {
		StringBuffer s = new StringBuffer();
		appendOptionalName(s, ele);
		s.append(" : ");
//		appendString(s, ele.getUri());
		return s.toString();
	}
	
	protected Object image(ModelElementCS ele) {
		return doGetImage(ele.getPivot());
	}
	
	protected Object text(ModelElementCS ele) {
		return doGetText(ele.getPivot());
	}

	protected String image(Operation ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Operation.gif";
	}

	protected String text(Operation ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		appendTemplateSignature(s, ele);
		appendParameters(s, ele.getOwnedParameters());
		s.append(" : ");
		appendType(s, ele.getType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String image(org.eclipse.ocl.examples.pivot.Package ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Package.gif";
	}

	protected String text(org.eclipse.ocl.examples.pivot.Package ele) {
		return ele.getName();
	}

	protected String image(Parameter ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Parameter_in.gif";
	}

	protected String text(Parameter ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		s.append(" : ");
		appendType(s, ele.getType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String image(PrimitiveTypeRefCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/PrimitiveType.gif";
	}

	protected String image(Property ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Property.gif";
	}

	protected String text(Property ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		s.append(" : ");
		appendType(s, ele.getType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String image(TupleTypeCS ele) {
		return "/org.eclipse.ocl.edit/icons/full/obj16/TupleType.gif";
	}

	protected String text(Type ele) {
		StringBuffer s = new StringBuffer();
		appendType(s, ele);
		return s.toString();
	}

	protected String image(TemplateParameter ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/TemplateParameter.gif";
	}

	protected String text(TypeRefCS ele) {
		StringBuffer s = new StringBuffer();
		appendType(s, ele);
		return s.toString();
	}
}
