/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: Pivot2CSConversion.java,v 1.7 2011/03/01 08:47:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.pivot2cs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTFactory;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DetailCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityBoundsCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MultiplicityStringCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CS.Factory;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class Pivot2CSConversion extends AbstractConversion implements PivotConstants
{	
	private static final Logger logger = Logger.getLogger(Pivot2CSConversion.class);

	protected final Pivot2CS converter;
	protected final MetaModelManager metaModelManager;
	protected final BaseDeclarationVisitor defaultDeclarationVisitor;
	protected final BaseReferenceVisitor defaultReferenceVisitor;
	
	private org.eclipse.ocl.examples.pivot.Class scope = null;

	private final Map<EClass, BaseDeclarationVisitor> declarationVisitorMap = new HashMap<EClass, BaseDeclarationVisitor>();
	private final Map<EClass, BaseReferenceVisitor> referenceVisitorMap = new HashMap<EClass, BaseReferenceVisitor>();
	private Set<org.eclipse.ocl.examples.pivot.Package> importedPackages = null;
	
	public Pivot2CSConversion(Pivot2CS converter) {
		this.converter = converter;
		this.metaModelManager = converter.getMetaModelManager();
		this.defaultDeclarationVisitor = converter.createDefaultDeclarationVisitor(this);
		this.defaultReferenceVisitor = converter.createDefaultReferenceVisitor(this);
	}

	protected void addBooleanQualifier(List<String> qualifiers, DetailCS csDetail, String csString) {
		if ((csDetail.getValue().size() == 1) && Boolean.valueOf(csDetail.getValue().get(0))) {
			qualifiers.add(csString);
		}
		else {
			qualifiers.add("!" + csString);
		}
	}

	protected void createImports(Resource csResource, Set<Package> importedPackages) {
		AliasAnalysis.dispose(csResource);			// Force reanalysis
		URI csURI = csResource.getURI();
		RootCS documentCS = (RootCS) csResource.getContents().get(0);
		List<ImportCS> imports = new ArrayList<ImportCS>();
		for (org.eclipse.ocl.examples.pivot.Package importedPackage : importedPackages) {
//			ModelElementCS csElement = createMap.get(importedPackage);
//			if ((csElement != null) && (csElement.eResource() == xtextResource)) {
//				continue;		// Don't import defined packages
//			}
			ImportCS importCS = BaseCSTFactory.eINSTANCE.createImportCS();
			AliasAnalysis aliasAnalysis = AliasAnalysis.getAdapter(csResource);
			String alias = aliasAnalysis.getAlias(importedPackage);
			importCS.setName(alias);
			importCS.setNamespace(importedPackage);
			importCS.setPivot(importedPackage);
			EObject eObject = importedPackage.getETarget();
			URI fullURI = EcoreUtil.getURI(eObject != null ? eObject : importedPackage);
			URI deresolvedURI = fullURI.deresolve(csURI, true, true, false);
			importCS.setUri(deresolvedURI.toString());
			imports.add(importCS);
		}
		Collections.sort(imports, new Comparator<ImportCS>()
		{
			public int compare(ImportCS o1, ImportCS o2) {
				Namespace ns1 = o1.getNamespace();
				Namespace ns2 = o2.getNamespace();
				int d1 = PivotUtil.getContainmentDepth(ns1);
				int d2 = PivotUtil.getContainmentDepth(ns2);
				if (d1 != d2) {
					return d1 - d2;
				}
				String n1 = o1.getName();
				String n2 = o2.getName();
				return n1.compareTo(n2);
			}
		});
		documentCS.getOwnedImport().addAll(imports);
	}

	public BaseDeclarationVisitor getDeclarationVisitor(EClass eClass) {
		BaseDeclarationVisitor declarationVisitor = declarationVisitorMap.get(eClass);
		if ((declarationVisitor == null) && !declarationVisitorMap.containsKey(eClass)) {
			Factory factory = converter.getFactory(eClass);
			if (factory != null) {
				declarationVisitor = factory.createDeclarationVisitor(this);
				if (declarationVisitor == null) {
					logger.error("No Visitor created for " + eClass.getName());
				}
			}
			else {
				declarationVisitor = defaultDeclarationVisitor;
			}
			declarationVisitorMap.put(eClass, declarationVisitor);
		}
		return declarationVisitor;
	}
	
	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public BaseReferenceVisitor getReferenceVisitor(EClass eClass) {
		BaseReferenceVisitor referenceVisitor = referenceVisitorMap.get(eClass);
		if ((referenceVisitor == null) && !referenceVisitorMap.containsKey(eClass)) {
			Factory factory = converter.getFactory(eClass);
			if (factory != null) {
				referenceVisitor = factory.createReferenceVisitor(this);
				if (referenceVisitor == null) {
					logger.error("No Visitor created for " + eClass.getName());
				}
			}
			else {
				referenceVisitor = defaultReferenceVisitor;
			}
			referenceVisitorMap.put(eClass, referenceVisitor);
		}
		return referenceVisitor;
	}

	public org.eclipse.ocl.examples.pivot.Class getScope() {
		return scope;
	}

	protected List<TemplateBindingCS> getTemplateBindings(ElementCS csElement) {
		List<TemplateBindingCS> csTemplateBindings;
//		EObject container = csElement.eContainer();
//		if (container instanceof ElementCS) {			
//			csTemplateBindings = getTemplateBindings((ElementCS) container);
//		}
//		else {
			csTemplateBindings = new ArrayList<TemplateBindingCS>();
//		}
		if (csElement instanceof TypedTypeRefCS) {
			TypedTypeRefCS csTemplateableElement = (TypedTypeRefCS)csElement;
			TemplateBindingCS csTemplateBinding = csTemplateableElement.getOwnedTemplateBinding();
			if (csTemplateBinding != null) {
				csTemplateBindings.add(csTemplateBinding);
			}
		}
		return csTemplateBindings;
	}

	public void importPackage(org.eclipse.ocl.examples.pivot.Package importPackage) {
		assert importPackage != null;
		org.eclipse.ocl.examples.pivot.Package primaryPackage = metaModelManager.getPrimaryPackage(importPackage);
		importedPackages.add(primaryPackage);
	}

	protected <T extends ClassifierCS> T refreshClassifier(Class<T> csClass, EClass csEClass, Type object) {
		T csElement = refreshNamedElement(csClass, csEClass, object);
		refreshList(csElement.getOwnedConstraint(), visitDeclarations(ConstraintCS.class, object.getOwnedRule(), null));
		TemplateSignature ownedTemplateSignature = object.getOwnedTemplateSignature();
		if (ownedTemplateSignature != null) {
			csElement.setOwnedTemplateSignature(visitDeclaration(TemplateSignatureCS.class, ownedTemplateSignature));
		}
		if (object.eIsSet(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME)) {
			csElement.setInstanceClassName(object.getInstanceClassName());
		}
		else {
			csElement.eUnset(BaseCSTPackage.Literals.CLASSIFIER_CS__INSTANCE_CLASS_NAME);
		}
		return csElement;
	}

	public <T extends ModelElementCS> T refreshElement(Class<T> csClass, EClass csEClass, Element object) {
		assert csClass == csEClass.getInstanceClass();
		EFactory eFactoryInstance = csEClass.getEPackage().getEFactoryInstance();
		ModelElementCS csElement = (ModelElementCS) eFactoryInstance.create(csEClass);
		if (!csClass.isAssignableFrom(csElement.getClass())) {
			throw new ClassCastException();
		}
		csElement.setPivot(object);
		@SuppressWarnings("unchecked")
		T castElement = (T) csElement;
		return castElement;
	}

	public <T extends NamedElementCS> T refreshNamedElement(Class<T> csClass, EClass csEClass, NamedElement object) {
		T csElement = refreshElement(csClass, csEClass, object);
		String name = object.getName();
		csElement.setName(name);
		refreshList(csElement.getOwnedAnnotation(), visitDeclarations(AnnotationCS.class, object.getOwnedAnnotation(), null));
		return csElement;
	}

	public void refreshPathName(PathNameCS csPathName, Element object, EObject scope) {
		ElementUtil.setPathName(csPathName, object, scope);
	}

	public void refreshQualifiers(List<String> qualifiers, String string, boolean polarity) {
		for (String qualifier : qualifiers) {
			if (qualifier.equals(string)) {
				if (!polarity) {
					qualifiers.remove(qualifier);
				}
				return;		
			}
		}
		if (polarity) {
			qualifiers.add(string);
		}
	}

	public void refreshQualifiers(List<String> qualifiers, String trueString, String falseString, Boolean polarity) {
		boolean isFalse = false;
		boolean isTrue = false;
		for (String qualifier : qualifiers) {
			if (qualifier.equals(trueString)) {
				if (isTrue || (polarity != Boolean.TRUE)) {
					qualifiers.remove(qualifier);
				}
				isTrue = true;
			}
			if (qualifier.equals(falseString)) {
				if (isTrue || (polarity != Boolean.FALSE)) {
					qualifiers.remove(qualifier);
				}
				isFalse = true;
			}
		}
		if (polarity == Boolean.TRUE) {
			if (!isTrue) {
				qualifiers.add(trueString);
			}
		}
		else if (polarity == Boolean.FALSE) {
			if (!isFalse) {
				qualifiers.add(falseString);
			}
		}
	}

	public <T extends StructuralFeatureCS> T refreshStructuralFeature(Class<T> csClass, EClass csEClass, Property object) {
		T csElement = refreshTypedMultiplicityElement(csClass, csEClass, object);
		refreshQualifiers(csElement.getQualifier(), "derived", object.isDerived());
		refreshQualifiers(csElement.getQualifier(), "readonly", object.isReadOnly());
		refreshQualifiers(csElement.getQualifier(), "static", object.isStatic());
		refreshQualifiers(csElement.getQualifier(), "transient", object.isTransient());
		refreshQualifiers(csElement.getQualifier(), "unsettable", object.isUnsettable());
		refreshQualifiers(csElement.getQualifier(), "volatile", object.isVolatile());
		if (object.eIsSet(PivotPackage.Literals.PROPERTY__DEFAULT)) {
			csElement.setDefault(object.getDefault());
		}
		else {
			csElement.eUnset(BaseCSTPackage.Literals.STRUCTURAL_FEATURE_CS__DEFAULT);
		}
		return csElement;
	}
	
	public <T extends TypedElementCS> T refreshTypedElement(Class<T> csClass, EClass csEClass, TypedElement object) {
		T csElement = refreshNamedElement(csClass, csEClass, object);
		Type type = object.getType();
		if (type != null) {
			TypedRefCS typeRef = visitReference(TypedRefCS.class, type);
			csElement.setOwnedType(typeRef);
		}
		refreshList(csElement.getOwnedConstraint(), visitDeclarations(ConstraintCS.class, object.getOwnedRule(), null));
		return csElement;
	}

	public <T extends TypedElementCS> T refreshTypedMultiplicityElement(Class<T> csClass, EClass csEClass, TypedMultiplicityElement object) {
		T csElement = refreshTypedElement(csClass, csEClass, object);
		TypedRefCS csTypeRef = csElement.getOwnedType();
		if (csTypeRef != null) {
			int lower = object.getLower().intValue();
			int upper = object.getUpper().intValue();
			if ((lower == 1) && (upper == 1)) {
				csTypeRef.setMultiplicity(null);
			}
			else {
				String stringValue = null;
				if (lower == 0) {
					if (upper == 1) {
						stringValue = "?";
					}
					else if (upper == -1) {
						stringValue = "*";				
					}
		//			else if (upper == -2) {
		//				stringValue = "0..?";				
		//			}
				}
				else if (lower == 1) {
					if (upper == -1) {
						stringValue = "+";				
					}
				}
				if (stringValue != null) {
					MultiplicityStringCS csMultiplicity = BaseCSTFactory.eINSTANCE.createMultiplicityStringCS();
					csMultiplicity.setStringBounds(stringValue);
					csTypeRef.setMultiplicity(csMultiplicity);
				}
				else {
					MultiplicityBoundsCS csMultiplicity = BaseCSTFactory.eINSTANCE.createMultiplicityBoundsCS();
					if (lower != 1) {
						csMultiplicity.setLowerBound(lower);
					}
					if (upper != 1) {
						csMultiplicity.setUpperBound(upper);
					}
					csTypeRef.setMultiplicity(csMultiplicity);
				}
			}
		}
		// FIXME Obsolete
		List<String> qualifiers = csElement.getQualifier();
		refreshQualifiers(qualifiers, "ordered", "!ordered", object.isOrdered() ? Boolean.TRUE : null);
		refreshQualifiers(qualifiers, "unique", "!unique", object.isUnique() ? null : Boolean.FALSE);
		return csElement;
	}

	public org.eclipse.ocl.examples.pivot.Class setScope(org.eclipse.ocl.examples.pivot.Class object) {
		org.eclipse.ocl.examples.pivot.Class savedScope = scope;
		this.scope = object;
		return savedScope;
	}

	/**
	 * Sequence the update passes to make the pivot match the CS.
	 * @param csResources 
	 */
	public void update(Collection<? extends Resource> csResources) {
		Map<Resource, Set<org.eclipse.ocl.examples.pivot.Package>> imports = new HashMap<Resource, Set<org.eclipse.ocl.examples.pivot.Package>>();
		//
		//	Perform the pre-order traversal to create the CS for each declaration. A
		//	separate reference pass is not needed since references are to the pivot model.
		//
		for (Resource csResource : csResources) {
			importedPackages = new HashSet<org.eclipse.ocl.examples.pivot.Package>();
			Resource pivotResource = converter.getPivotResource(csResource);
			List<PackageCS> list = visitDeclarations(PackageCS.class, pivotResource.getContents(), null);
			refreshList(csResource.getContents(), list);
			imports.put(csResource, importedPackages);
		}
		for (Resource csResource : csResources) {
			createImports(csResource, imports.get(csResource));
		}
	}

	public <T extends ElementCS> T visitDeclaration(Class<T> csClass, EObject eObject) {
		BaseDeclarationVisitor declarationVisitor = getDeclarationVisitor(eObject.eClass());
		if ((declarationVisitor == null) || !(eObject instanceof Visitable)) {
			logger.warn("Unsupported declaration " + eObject.eClass().getName());
			return null;
		}
		ElementCS csElement = ((Visitable)eObject).accept(declarationVisitor);
		@SuppressWarnings("unchecked")
		T castElement = (T) csElement;
		return castElement;
	}

	public <T extends ElementCS, V extends EObject> List<T> visitDeclarations(Class<T> csClass, List<V> eObjects, Pivot2CS.Predicate<V> predicate) {
		List<T> csElements = new ArrayList<T>();
		for (V eObject : eObjects) {
			if ((predicate == null) || predicate.filter(eObject)) {
				T csElement = visitDeclaration(csClass, eObject);
				if (csElement != null) {
					csElements.add(csElement);
				}
				else {
					assert csElement != null;
				}
			}
		}
		return csElements;
	}

	public <T extends ElementCS> T visitReference(Class<T> csClass, EObject eObject) {
		BaseReferenceVisitor referenceVisitor = getReferenceVisitor(eObject.eClass());
		if ((referenceVisitor == null) || !(eObject instanceof Visitable)) {
			logger.warn("Unsupported reference " + eObject.eClass().getName());
			return null;
		}
		ElementCS csElement = ((Visitable)eObject).accept(referenceVisitor);
		if (csElement == null) {
			return null;
		}
		if (!csClass.isAssignableFrom(csElement.getClass())) {
			logger.error("CS " + csElement.getClass().getName() + "' element is not a '" + csClass.getName() + "'"); //$NON-NLS-1$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) csElement;
		return castElement;
	}

	public <T extends ElementCS, V extends EObject> List<T> visitReferences(Class<T> csClass, List<? extends V> eObjects, Pivot2CS.Predicate<V> predicate) {
		List<T> csElements = new ArrayList<T>();
		for (V eObject : eObjects) {
			if ((predicate == null) || predicate.filter(eObject)) {
				T csElement = visitReference(csClass, eObject);
				if (csElement != null) {
					csElements.add(csElement);
				}
				else {
					assert csElement != null;
				}
			}
		}
		return csElements;
	}
}
