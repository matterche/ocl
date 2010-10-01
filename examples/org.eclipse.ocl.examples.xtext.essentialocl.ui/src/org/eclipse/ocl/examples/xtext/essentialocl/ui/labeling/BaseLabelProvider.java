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
 * $Id: BaseLabelProvider.java,v 1.1.2.1 2010/10/01 15:04:04 ewillink Exp $
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
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationLiteralCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PrimitiveTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
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

	protected void appendMultiplicity(StringBuffer s, TypedElementCS ele) {
		String multiplicity = ele.getMultiplicity();
		if (multiplicity != null) {
			s.append("[");
			s.append(multiplicity);
			s.append("]");
		}
		else {
			int lower = ele.getLower();
			int upper = ele.getUpper();
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
		}
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

	protected void appendParameters(StringBuffer s, List<ParameterCS> parameters) {
		s.append("(");
		String prefix = "";
		for (ParameterCS csParameter : parameters) {
			s.append(prefix);
			appendType(s, csParameter.getOwnedType());
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

	protected void appendSuperTypes(StringBuffer s, List<TypedRefCS> superTypes) {
		if (!superTypes.isEmpty()) {
			String prefix = " -> ";
			for (TypedRefCS superType : superTypes) {
				s.append(prefix);
				appendType(s, superType);
				prefix = ", ";
			}
		}
	}

	protected void appendType(StringBuffer s, TypeRefCS type) {
		appendString(s, ((Type)type.getPivot()).getMoniker());
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

	protected void appendTemplateSignature(StringBuffer s, TemplateableElementCS templateableElement) {
		if (templateableElement != null) {
			TemplateSignatureCS templateSignature = templateableElement.getOwnedTemplateSignature();
			if (templateSignature != null) {
				s.append("<");
				Collection<TemplateParameterCS> templateParameters = templateSignature.getOwnedTemplateParameter();
				if (!templateParameters.isEmpty()) {
					String prefix = "";
					for (TemplateParameterCS templateParameter : templateParameters) {
						s.append(prefix);
						appendName(s, templateParameter);
						prefix = ", ";
					}
				}
				s.append(">");
			}
		}
	}

	protected void appendType(StringBuffer s, TypeCS type) {
		if (type instanceof NamedElementCS) {
			appendName(s, (NamedElementCS)type);
		}
		else if (type != null) {
			appendClass(s, type);
		}	
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

	protected String text(ElementCS ele) {
		return "<" + ele.getClass().getSimpleName() + ">";
	}

	protected String image(AnnotationElementCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Comment.gif";
	}

	protected String text(ClassCS ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		appendTemplateSignature(s, ele);
		appendSuperTypes(s, ele.getOwnedSuperType());
		return s.toString();
	}

	protected String image(ClassifierCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Class.gif";
	}

	protected String text(ClassifierCS ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		appendTemplateSignature(s, ele);
		return s.toString();
	}

	protected String text(DataTypeCS ele) {
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

	protected String text(EnumerationCS ele) {
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

	protected String image(EnumerationLiteralCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/EnumerationLiteral.gif";
	}

	protected String text(EnumerationLiteralCS ele) {
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

	protected String image(OperationCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Operation.gif";
	}

	protected String text(OperationCS ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		appendTemplateSignature(s, ele);
		appendParameters(s, ele.getOwnedParameter());
		s.append(" : ");
		appendType(s, ele.getOwnedType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String image(PackageCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Package.gif";
	}

	protected String text(PackageCS ele) {
		return ele.getName();
	}

	protected String image(ParameterCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Parameter_in.gif";
	}

	protected String text(ParameterCS ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		s.append(" : ");
		appendType(s, ele.getOwnedType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String image(PrimitiveTypeRefCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/PrimitiveType.gif";
	}

	protected String image(RootPackageCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Model.gif";
	}

	protected String image(StructuralFeatureCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/Property.gif";
	}

	protected String text(StructuralFeatureCS ele) {
		StringBuffer s = new StringBuffer();
		appendName(s, ele);
		s.append(" : ");
		appendType(s, ele.getOwnedType());
		appendMultiplicity(s, ele);
		return s.toString();
	}

	protected String text(TypeCS ele) {
		StringBuffer s = new StringBuffer();
		appendType(s, ele);
		return s.toString();
	}

	protected String image(TypeParameterCS ele) {
		return "/org.eclipse.uml2.uml.edit/icons/full/obj16/TemplateParameter.gif";
	}

	protected String text(TypeRefCS ele) {
		StringBuffer s = new StringBuffer();
		appendType(s, ele);
		return s.toString();
	}
}
