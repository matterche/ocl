/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SpecificationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot.AbstractUnresolvedProxyMessageProvider;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.ConstructorPartCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.ContextCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.ExpSpecificationCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.InvocationExpCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.LetExpCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.NavigationOperatorCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.TupleLiteralExpCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;

public class EssentialOCLScoping
{	
	public static void init() {
		Map<EClassifier, Attribution> registry = Attribution.REGISTRY;
		registry.put(EssentialOCLCSTPackage.Literals.CONSTRUCTOR_PART_CS, ConstructorPartCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.CONTEXT_CS, ContextCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.EXP_SPECIFICATION_CS, ExpSpecificationCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.INVOCATION_EXP_CS, InvocationExpCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.LET_EXP_CS, LetExpCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.NAVIGATION_OPERATOR_CS, NavigationOperatorCSAttribution.INSTANCE);
		registry.put(EssentialOCLCSTPackage.Literals.TUPLE_LITERAL_EXP_CS, TupleLiteralExpCSAttribution.INSTANCE);
		CS2Pivot.addUnresolvedProxyMessageProvider(new PathElementCSUnresolvedProxyMessageProvider());			
	}
	
	private static final class PathElementCSUnresolvedProxyMessageProvider extends AbstractUnresolvedProxyMessageProvider
	{		
		private PathElementCSUnresolvedProxyMessageProvider() {
			super(BaseCSTPackage.Literals.PATH_ELEMENT_CS__ELEMENT);
		}
		
		@Override
		public String getMessage(EObject eObject, String linkText) {
			PathElementCS csPathElement = (PathElementCS) eObject;
			PathNameCS pathName = csPathElement.getPathName();
			List<PathElementCS> path = pathName.getPath();
			int index = path.indexOf(csPathElement);
			for (int i = 0; i < index; i++) {
				PathElementCS csElement = path.get(i);
				Element element = csElement.basicGetElement();
				if ((element == null) || element.eIsProxy()) {
					return null;		// Suppress nested unresolved message
				}
			}
			ElementCS csContext = pathName.getContext();
			if (csContext == null) {
				csContext = (ElementCS) pathName.eContainer();
			}
			String messageTemplate;
			String argumentText = null;
			ExpCS navigationArgument = null;
			if ((index + 1) < path.size()) {
				messageTemplate = OCLMessages.UnresolvedNamespace_ERROR_;
			}
			else if (csContext instanceof InvocationExpCS) {
				InvocationExpCS csNavigatingExp = (InvocationExpCS)csContext;
				navigationArgument = csNavigatingExp;
				argumentText = getOperationArguments(csNavigatingExp);
				messageTemplate = OCLMessages.UnresolvedOperationCall_ERROR_;
			}
			else if (csContext instanceof TypeNameExpCS) {
				messageTemplate = OCLMessages.UnresolvedType_ERROR_;
			}
			else if (csContext instanceof TypedTypeRefCS) {
				messageTemplate = OCLMessages.UnresolvedType_ERROR_;
			}
			else if (csContext instanceof ExpCS) {
				navigationArgument = (ExpCS)csContext;
				messageTemplate = OCLMessages.UnresolvedProperty_ERROR_;
			}
			else if (csContext instanceof ModelElementRefCS) {
				messageTemplate = "Unresolved ModelElement ''{0}''";
			}
			else {
				messageTemplate = "Unresolved ''{1}'' ''{0}''";
			}
			TypedElement source = null;
			ExpCS csSource = navigationArgument;
			while (csSource != null) {
				OperatorCS csOperator = csSource.getParent();
				if ((csOperator != null) && (csOperator.getSource() != csSource)) {
					csSource = csOperator.getSource();
					break;
				}
				EObject eContainer = csSource.eContainer();
				if (eContainer instanceof NavigatingArgCS) {
					csSource = ((NavigatingArgCS)eContainer).getNavigatingExp();
				}
				else if (eContainer instanceof InfixExpCS) {
					csSource = (InfixExpCS)eContainer;
				}
				else if (eContainer instanceof PrefixExpCS) {
					csSource = (PrefixExpCS)eContainer;
				}
				else if (eContainer instanceof NestedExpCS) {
					csSource = (NestedExpCS)eContainer;
				}
				else if (eContainer instanceof SpecificationCS) {
					ExpressionInOcl expression = PivotUtil.getPivot(ExpressionInOcl.class, (SpecificationCS)eContainer);
					source = expression!= null ? expression.getContextVariable() : null;
					break;
				}
				else {
					break;
				}
			}
			if (source == null) {
				if ((csSource != null) && (csSource != navigationArgument)) {
					source = PivotUtil.getPivot(OclExpression.class, csSource);
				}
			}
			String typeText = PivotConstants.UNKNOWN_TYPE_TEXT;
			if (source != null) {
				Type sourceType = source.getType();
				if (sourceType != null) {
					OperatorCS csParent = navigationArgument != null ? navigationArgument.getParent() : null;
					if (!(sourceType instanceof CollectionType) && (csParent instanceof NavigationOperatorCS) && PivotConstants.COLLECTION_NAVIGATION_OPERATOR.equals(((NavigationOperatorCS)csParent).getName())) {
						typeText = "Set(" + sourceType.toString() + ")";
					}
					else {
						typeText = sourceType.toString();
					}
				}
			}
			if (argumentText == null) {
				return CS2Pivot.getMessageBinder().bind(csContext, messageTemplate, linkText, typeText);
			}
			else {
				return CS2Pivot.getMessageBinder().bind(csContext, messageTemplate, linkText, typeText, argumentText);
			}
		}
		
		public String getOperationArguments(InvocationExpCS csNavigatingExp) {
			List<NavigatingArgCS> arguments = csNavigatingExp.getArgument();
			StringBuilder s = new StringBuilder();
			for (NavigatingArgCS csArgument : arguments) {
				TypedElement pivot = PivotUtil.getPivot(TypedElement.class, csArgument);
				if ((pivot != null) && !pivot.eIsProxy()) {
					if (s.length() > 0) {
						s.append(", ");
					}
					Type type = pivot.getType();
					if (pivot instanceof TypedMultiplicityElement) {
						TypedMultiplicityElement typedMultiplicityElement = (TypedMultiplicityElement)pivot;
						if (typedMultiplicityElement.isOrdered()) {
							if (typedMultiplicityElement.isUnique()) {
								s.append("OrderedSet(");
							}
							else {
								s.append("Sequence(");
							}
						}
						else {
							if (typedMultiplicityElement.isUnique()) {
								s.append("Set(");
							}
							else {
								s.append("Bag(");
							}
						}
						s.append(String.valueOf(type));
						s.append(")");
						BigInteger lower = typedMultiplicityElement.getLower();
						BigInteger upper = typedMultiplicityElement.getUpper();
						PivotUtil.appendMultiplicity(s, lower.intValue(), upper.intValue());
					}
					else {
						s.append(String.valueOf(type));
					}
				}
				else {
					s.append(csArgument.toString());
				}
			}
			return s.toString();
		}
	}		
}
