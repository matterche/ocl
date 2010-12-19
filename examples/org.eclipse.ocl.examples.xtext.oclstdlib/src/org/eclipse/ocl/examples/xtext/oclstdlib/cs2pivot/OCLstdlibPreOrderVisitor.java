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
 * $Id: OCLstdlibPreOrderVisitor.java,v 1.1.2.2 2010/12/19 15:57:40 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.BagType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePreOrderVisitor.OperationContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuations;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLPreOrderVisitor;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibClassCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibRootPackageCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.util.AbstractExtendingDelegatingOCLstdlibCSVisitor;

public class OCLstdlibPreOrderVisitor
	extends AbstractExtendingDelegatingOCLstdlibCSVisitor<Continuation<?>, CS2PivotConversion, EssentialOCLPreOrderVisitor>
{
	private static final Logger logger = Logger.getLogger(OCLstdlibPreOrderVisitor.class);
	
	protected static class IterationContinuation extends OperationContinuation<LibIterationCS>
	{
		public IterationContinuation(CS2PivotConversion context, LibIterationCS csElement) {
			super(context, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			Iteration pivotIteration = context.refreshNamedElement(Iteration.class, PivotPackage.Literals.ITERATION, csElement);
			context.refreshTemplateSignature(csElement, pivotIteration);
			List<ParameterCS> csIterators = csElement.getOwnedIterator();
			List<Parameter> newPivotIterators = new ArrayList<Parameter>();
			for (ParameterCS csIterator : csIterators) {
				Parameter pivotIterator = context.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, csIterator);
				newPivotIterators.add(pivotIterator);
			}
			context.refreshList(pivotIteration.getOwnedIterators(), newPivotIterators);
			List<ParameterCS> csAccumulators = csElement.getOwnedAccumulator();
			List<Parameter> newPivotAccumulators = new ArrayList<Parameter>();
			for (ParameterCS csAccumulator : csAccumulators) {
				Parameter pivotIterator = context.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, csAccumulator);
				newPivotAccumulators.add(pivotIterator);
			}
			context.refreshList(pivotIteration.getOwnedAccumulators(), newPivotAccumulators);
			List<ParameterCS> csParameters = csElement.getOwnedParameter();
			List<Parameter> newPivotParameters = new ArrayList<Parameter>();
			for (ParameterCS csParameter : csParameters) {
				Parameter pivotParameter = context.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, csParameter);
				newPivotParameters.add(pivotParameter);
			}
			context.refreshList(pivotIteration.getOwnedParameters(), newPivotParameters);
			context.getOperationsHaveTemplateParametersInterDependency().setSatisfied(this);
			return null;
		}
	}

	protected static class RootPackagePrecedenceContinuation extends SingleContinuation<LibRootPackageCS>
	{
		private RootPackagePrecedenceContinuation(CS2PivotConversion context, LibRootPackageCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			org.eclipse.ocl.examples.pivot.Package pivotElement = context.refreshNamedElement(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, csElement);
			context.refreshPivotList(Precedence.class, pivotElement.getOwnedPrecedences(), csElement.getOwnedPrecedence());
			return null;
		}
	}

	public OCLstdlibPreOrderVisitor(CS2PivotConversion context) {
		super(new EssentialOCLPreOrderVisitor(context), context);
	}

	@Override
	public Continuation<?> visitLibClassCS(LibClassCS csLibClass) {
		String metaTypeName = csLibClass.getMetaTypeName();
		if ((metaTypeName == null) || "Class".equals(metaTypeName)) {
			context.refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, csLibClass);
		}
		else if ("AnyType".equals(metaTypeName)) {
			context.refreshNamedElement(AnyType.class, PivotPackage.Literals.ANY_TYPE, csLibClass);
		}
		else if ("BagType".equals(metaTypeName)) {
			CollectionType type = context.refreshNamedElement(BagType.class, PivotPackage.Literals.BAG_TYPE, csLibClass);
			type.setElementType(type);			// FIXME
		}
		else if ("CollectionType".equals(metaTypeName)) {
			CollectionType type = context.refreshNamedElement(CollectionType.class, PivotPackage.Literals.COLLECTION_TYPE, csLibClass);
			type.setElementType(type);			// FIXME
		}
		else if ("InvalidType".equals(metaTypeName)) {
			context.refreshNamedElement(InvalidType.class, PivotPackage.Literals.INVALID_TYPE, csLibClass);
		}
		else if ("OrderedSetType".equals(metaTypeName)) {
			CollectionType type = context.refreshNamedElement(OrderedSetType.class, PivotPackage.Literals.ORDERED_SET_TYPE, csLibClass);
			type.setElementType(type);			// FIXME
		}
		else if ("PrimitiveType".equals(metaTypeName)) {
			context.refreshNamedElement(PrimitiveType.class, PivotPackage.Literals.PRIMITIVE_TYPE, csLibClass);
		}
		else if ("SequenceType".equals(metaTypeName)) {
			CollectionType type = context.refreshNamedElement(SequenceType.class, PivotPackage.Literals.SEQUENCE_TYPE, csLibClass);
			type.setElementType(type);			// FIXME
		}
		else if ("SetType".equals(metaTypeName)) {
			CollectionType type = context.refreshNamedElement(SetType.class, PivotPackage.Literals.SET_TYPE, csLibClass);
			type.setElementType(type);			// FIXME
		}
		else if ("TupleType".equals(metaTypeName)) {
			context.refreshNamedElement(TupleType.class, PivotPackage.Literals.TUPLE_TYPE, csLibClass);
		}
		else if ("VoidType".equals(metaTypeName)) {
			context.refreshNamedElement(VoidType.class, PivotPackage.Literals.VOID_TYPE, csLibClass);
		}
		else {
			logger.warn("Unsupported metaTypeName '" + metaTypeName + "'");
			context.refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class,
			PivotPackage.Literals.CLASS, csLibClass);
		}
		return super.visitLibClassCS(csLibClass);
	}

	@Override
	public Continuation<?> visitLibIterationCS(LibIterationCS csIteration) {
		return new IterationContinuation(context, csIteration);
	}

	@Override
	public Continuation<?> visitLibRootPackageCS(LibRootPackageCS csLibRootPackage) {
		Continuation<?> superContinuation = visitRootPackageCS(csLibRootPackage);
		Continuation<?> localContinuation =  new RootPackagePrecedenceContinuation(context, csLibRootPackage);
		return Continuations.combine(superContinuation, localContinuation);
	}

	@Override
	public Continuation<?> visitPrecedenceCS(PrecedenceCS csPrecedence) {
		Precedence pivotPrecedence = context.refreshNamedElement(Precedence.class,
			PivotPackage.Literals.PRECEDENCE, csPrecedence);
		pivotPrecedence.setAssociativity(csPrecedence.isRightAssociative() ? AssociativityKind.RIGHT : AssociativityKind.LEFT);
		return null;
	}
}