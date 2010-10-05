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
 * $Id: EssentialOCLCS2MonikerSwitch.java,v 1.1.2.2 2010/10/05 17:52:13 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TuplePartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.util.EssentialOCLCSTSwitch;

public class EssentialOCLCS2MonikerSwitch extends EssentialOCLCSTSwitch<Object> implements PivotConstants, CS2Moniker.Switch
{	
	private static final class Factory extends CS2Moniker.Factory
	{
		private Factory() {
			BaseCS2MonikerSwitch.FACTORY.getClass();
			CS2Moniker.addFactory(this);
//			roleNames.put(EssentialOCLCSTPackage.Literals.CALL_EXP__SOURCE, "src");
//			roleNames.put(EssentialOCLCSTPackage.Literals.CONSTRAINT__SPECIFICATION, "spec");
			roleNames.put(EssentialOCLCSTPackage.Literals.CONTEXT_CS__OWNED_EXPRESSION, "expr");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__CONDITION, "cond");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__THEN_EXPRESSION, "then");
			roleNames.put(EssentialOCLCSTPackage.Literals.IF_EXP_CS__ELSE_EXPRESSION, "else");
			roleNames.put(EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN, "in");
			roleNames.put(EssentialOCLCSTPackage.Literals.LET_EXP_CS__VARIABLE, "var");
//			roleNames.put(EssentialOCLCSTPackage.Literals.LOOP_EXP__BODY, "body");
//			roleNames.put(EssentialOCLCSTPackage.Literals.LOOP_EXP__ITERATOR, "it");
			roleNames.put(EssentialOCLCSTPackage.Literals.INFIX_EXP_CS__OWNED_EXPRESSION, "exp");
			roleNames.put(EssentialOCLCSTPackage.Literals.INFIX_EXP_CS__OWNED_OPERATOR, "op");
			roleNames.put(EssentialOCLCSTPackage.Literals.PREFIX_EXP_CS__OWNED_EXPRESSION, "expr");
			roleNames.put(EssentialOCLCSTPackage.Literals.PREFIX_EXP_CS__OWNED_OPERATOR, "op");
		}
		
		@Override
		public CS2Moniker.Switch create(CS2Moniker moniker) {
			return new EssentialOCLCS2MonikerSwitch(moniker);
		}

		public EPackage getEPackage() {
			return EssentialOCLCSTPackage.eINSTANCE;
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	protected final CS2Moniker moniker;
	protected final BaseCS2MonikerSwitch baseSwitch;
	
	public EssentialOCLCS2MonikerSwitch(CS2Moniker moniker) {
		this.moniker = moniker;			
		baseSwitch = (BaseCS2MonikerSwitch) moniker.getSwitch(BaseCS2MonikerSwitch.FACTORY);
	}

	@Override
	public Object caseCollectionLiteralPartCS(CollectionLiteralPartCS object) {
		moniker.appendParent(object, "@");
		moniker.appendIndex(object);
		return true;
	}

	@Override
	public Object caseCollectionTypeCS(CollectionTypeCS object) {
		moniker.appendName(object);
		moniker.append('(');
		TypeRefCS type = object.getOwnedType();
		if (type != null) {
			moniker.appendElement(type);
		}
		moniker.append(')');
		return true;
	}

	@Override
	public Object caseContextCS(ContextCS object) {
		moniker.appendName(object);
		return true;
	}

	@Override
	public Object caseExpCS(ExpCS object) {
		moniker.appendRole(object);
		return true;
	}

	@Override
	public Object caseLetVariableCS(LetVariableCS object) {
		moniker.appendParent(object, SCOPE_SEPARATOR);
		moniker.append("var_");
		moniker.append(object.getName());
		return true;
	}

	@Override
	public Object caseTupleTypeCS(TupleTypeCS object) {
		moniker.appendName(object);
		List<TuplePartCS> parts = new ArrayList<TuplePartCS>(object.getOwnedParts());
		Collections.sort(parts, new Comparator<TuplePartCS>()
		{
			public int compare(TuplePartCS o1, TuplePartCS o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		moniker.append('(');
		String prefix = "";
		for (TuplePartCS part : parts) {
			moniker.append(prefix);
			moniker.appendName(part);
			moniker.append(':');
			TypeRefCS type = part.getOwnedType();
			if (type != null) {
				moniker.appendElement(type);
			}
			prefix = ",";
		}
		moniker.append(')');
		return true;
	}

	@Override
	public Object defaultCase(EObject object) {
		return baseSwitch.doSwitch(object);
	}

	public Object doInPackageSwitch(EObject theEObject) {
		int classifierID = theEObject.eClass().getClassifierID();
		return doSwitch(classifierID, theEObject);
	}

	@Override
	public Object doSwitch(EObject theEObject) {
		EClass eClass = theEObject.eClass();
		return doSwitch(eClass, theEObject);
	}

	@Override
	public String toString() {
		return moniker.toString();
	}	
}
