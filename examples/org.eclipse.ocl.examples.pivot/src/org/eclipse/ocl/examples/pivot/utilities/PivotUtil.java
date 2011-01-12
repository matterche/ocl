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
 * $Id: PivotUtil.java,v 1.1.2.9 2011/01/12 10:29:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.common.utils.ClassUtils;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.util.Pivotable;

public class PivotUtil
{	
	private static final Logger logger = Logger.getLogger(PivotUtil.class);

	/**
	 * 'Highest' precedence first
	 */
	public static class PrecedenceComparator implements Comparator<Precedence>
	{
		public static final PrecedenceComparator INSTANCE = new PrecedenceComparator();

		public int compare(Precedence o1, Precedence o2) {
			if (o1 == null) {
				return o2 != null ? -1 : 0;
			}
			if (o2 == null) {
				return 1;
			}
			return o2.getOrder().compareTo(o1.getOrder()); // NB least positive
															// is highest
															// precedence
		}
	}

	/**
	 * In TemplateSignature order.
	 */
	public static class TemplateParameterSubstitutionComparator
		implements Comparator<TemplateParameterSubstitution>
	{
		public static Comparator<? super TemplateParameterSubstitution> INSTANCE =
			new TemplateParameterSubstitutionComparator();

		public int compare(TemplateParameterSubstitution o1, TemplateParameterSubstitution o2) {
			TemplateParameter f1 = o1.getFormal();
			TemplateParameter f2 = o2.getFormal();
			int i1 = f1.getSignature().getParameters().indexOf(f1);
			int i2 = f2.getSignature().getParameters().indexOf(f2);
			return i1 - i2;
		}
	}


	public static boolean conformsTo(EStructuralFeature eStructuralFeature, EClassifier contentType) {
		if (eStructuralFeature == null) {			// Wildcard match all
			return true;
		}
		EClassifier targetType = eStructuralFeature.getEType();
		if (targetType == contentType) {
			return true;
		}
		if (!(targetType instanceof EClass)) {
			return false;
		}
		if (!(contentType instanceof EClass)) {
			return false;
		}
		return ((EClass) targetType).isSuperTypeOf((EClass) contentType);
	}

	public static <T> T getAdapter(Class<T> adapterClass, List<Adapter> eAdapters) {
		return getAdapter(adapterClass, eAdapters, adapterClass);
	}

	public static <T> T getAdapter(Class<T> adapterClass, Notifier notifier) {
		return getAdapter(adapterClass, notifier, adapterClass);
	}

	public static <T> T getAdapter(Class<T> adapterClass, Notifier notifier, Object adapterType) {
		return getAdapter(adapterClass, notifier.eAdapters(), adapterType);
	}

	public static <T> T getAdapter(Class<T> adapterClass, List<Adapter> eAdapters, Object adapterType) {
		Adapter adapter = EcoreUtil.getAdapter(eAdapters, adapterType);
		if (adapter == null) {
			return null;
		}
		if (!adapterClass.isAssignableFrom(adapter.getClass())) {
			logger.error("Expected " + adapterClass.getName() +
				" rather than " + adapter.getClass().getName());
		}
		@SuppressWarnings("unchecked")
		T castAdapter = (T) adapter;
		return castAdapter;
	}

	public static List<TemplateParameter> getAllTemplateParameters(Collection<TemplateBinding> templateBindings) {
		List<TemplateParameter> list = null;
		for (TemplateBinding templateBinding : templateBindings) {	// FIXME Establish ordering
			TemplateSignature templateSignature = templateBinding.getSignature();
			if (templateSignature != null) {
				List<TemplateParameter> templateParameters = templateSignature.getParameters();
				if (templateParameters.size() > 0) {
					if (list == null) {
						list = new ArrayList<TemplateParameter>();
					}
					list.addAll(templateParameters);
				}
			}
		}
		return list != null ? list : Collections.<TemplateParameter>emptyList();
	}

	public static List<TemplateParameter> getAllTemplateParameters(TemplateableElement templateableElement) {
		List<TemplateParameter> list = null;
		for (EObject eObject = templateableElement; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof TemplateableElement) {
				TemplateSignature ownedTemplateSignature = ((TemplateableElement)eObject).getOwnedTemplateSignature();
				if (ownedTemplateSignature != null) {
					List<TemplateParameter> templateParameters = ownedTemplateSignature.getParameters();
					if (templateParameters.size() > 0) {
						if (list == null) {
							list = new ArrayList<TemplateParameter>();
						}
						list.addAll(templateParameters);
					}
				}
			}
		}
		return list;
	}

	public static Map<TemplateParameter, ParameterableElement> getAllTemplateParameterSubstitutions(TemplateableElement templateableElement) {
		Map<TemplateParameter, ParameterableElement> map = new HashMap<TemplateParameter, ParameterableElement>();
		for (TemplateBinding templateBinding : templateableElement.getTemplateBindings()) {
			for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitutions()) {
				map.put(templateParameterSubstitution.getFormal(), templateParameterSubstitution.getActual());
			}
		}
		if (templateableElement instanceof org.eclipse.ocl.examples.pivot.Class) {
			getAllSuperTemplateParameterSubstitutions(map, (org.eclipse.ocl.examples.pivot.Class) templateableElement);
		}
		return map;
	}

	private static void getAllSuperTemplateParameterSubstitutions(Map<TemplateParameter, ParameterableElement> map,
			org.eclipse.ocl.examples.pivot.Class type) {
		for (org.eclipse.ocl.examples.pivot.Class superType : type.getSuperClasses()) {
			for (TemplateBinding templateBinding : superType.getTemplateBindings()) {
				for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitutions()) {
					map.put(templateParameterSubstitution.getFormal(), templateParameterSubstitution.getActual());
				}
			}
			getAllSuperTemplateParameterSubstitutions(map, superType);
		}		
	}

	public static <T extends NamedElement> T getNamedElement(Collection<T> elements, String name) {
		if (elements == null)
			return null;
		for (T element : elements)
			if (ClassUtils.equals(name, element.getName()))
				return element;
		return null;				
	}

	public static org.eclipse.ocl.examples.pivot.Package getPackage(EObject object) {
		for (EObject eObject = object; eObject != null; eObject = eObject.eContainer()) {
			if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
				return (org.eclipse.ocl.examples.pivot.Package)eObject;
			}
		}
		return null;
	}

	public static <T extends Element> T getPivot(Class<T> pivotClass, Pivotable pivotableElement) {
		Element pivotElement = pivotableElement.getPivot();
		if (pivotElement == null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			logger.error("Pivot '" + pivotElement.getClass().getName() + "' element is not a '" + pivotClass.getName() + "'"); //$NON-NLS-1$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	public static String getResourceErrorsString(Resource resource, String prefix) {
		List<Resource.Diagnostic> errors = resource.getErrors();
		if (errors.size() <= 0) {
			return null;
		}
		StringBuffer s = new StringBuffer();
		s.append(prefix);
		for (Resource.Diagnostic conversionError : errors) {
			s.append("\n");
			s.append(conversionError.getMessage());
		}
		return s.toString();
	}

	public static List<TemplateParameter> getTemplateParameters(TemplateableElement templateableElement) {
		if (templateableElement != null) {
			TemplateSignature ownedTemplateSignature = templateableElement.getOwnedTemplateSignature();
			if (ownedTemplateSignature != null) {
				return ownedTemplateSignature.getParameters();
			}
		}
		return Collections.emptyList();
	}

	public static List<ParameterableElement> getTemplateParameterables(TemplateableElement templateableElement) {
		if (templateableElement == null) {
			return Collections.emptyList();
		}
		TemplateSignature ownedTemplateSignature = templateableElement.getOwnedTemplateSignature();
		if (ownedTemplateSignature == null) {
			return Collections.emptyList();
		}
		List<TemplateParameter> templateParameters = ownedTemplateSignature.getParameters();
		if (templateParameters.size() == 0) {
			return Collections.emptyList();
		}
		if (templateParameters.size() == 1) {
			return Collections.singletonList(templateParameters.get(0).getParameteredElement());
		}
		List<ParameterableElement> results = new ArrayList<ParameterableElement>(templateParameters.size());
		for (TemplateParameter templateParameter : templateParameters) {
			results.add(templateParameter.getParameteredElement());
		}
		return results;
	}

	public static List<Type> getTypeTemplateParameterables(TemplateableElement templateableElement) {
		if (templateableElement == null) {
			return Collections.emptyList();
		}
		TemplateSignature ownedTemplateSignature = templateableElement.getOwnedTemplateSignature();
		if (ownedTemplateSignature == null) {
			return Collections.emptyList();
		}
		List<TemplateParameter> templateParameters = ownedTemplateSignature.getParameters();
		if (templateParameters.size() == 0) {
			return Collections.emptyList();
		}
		if (templateParameters.size() == 1) {
			return Collections.singletonList((Type)templateParameters.get(0).getParameteredElement());
		}
		List<Type> results = new ArrayList<Type>(templateParameters.size());
		for (TemplateParameter templateParameter : templateParameters) {
			results.add((Type) templateParameter.getParameteredElement());
		}
		return results;
	}

//	public static org.eclipse.ocl.examples.pivot.Class getTemplateableClass(org.eclipse.ocl.examples.pivot.Class object) {
//		TemplateBinding templateBinding = object.getTemplateBindings().get(0);
//		TemplateSignature templateSignature = templateBinding.getSignature();
//		TemplateableElement unspecializedClass = templateSignature.getTemplate();
//		return (org.eclipse.ocl.examples.pivot.Class)unspecializedClass;
//	}

	public static <T extends TemplateableElement> T getUnspecializedTemplateableElement(T templateableElement) {
		List<TemplateBinding> templateBindings = templateableElement.getTemplateBindings();
		if (templateBindings.size() <= 0) {
			return templateableElement;			
		}
		TemplateBinding templateBinding = templateBindings.get(templateBindings.size()-1);		// FIXME ordering so that most derived is last
		TemplateSignature templateSignature = templateBinding.getSignature();
		@SuppressWarnings("unchecked")
		T unspecializedTemplateableElement = (T) templateSignature.getTemplate();
		return unspecializedTemplateableElement;
	}

	public static <T extends MonikeredElement> List<T> sortByMoniker(List<T> list) {
		Collections.sort(list, new Comparator<MonikeredElement>()
		{
			public int compare(MonikeredElement o1, MonikeredElement o2) {
				return o1.getMoniker().compareTo(o2.getMoniker());
			}
		});
		return list;
	}
}
