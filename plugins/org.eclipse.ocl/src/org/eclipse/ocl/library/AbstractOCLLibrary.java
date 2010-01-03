/**
 * <copyright>
 *
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 252600
 *
 * </copyright>
 *
 * $Id: AbstractOCLLibrary.java,v 1.1.2.1 2010/01/03 22:53:47 ewillink Exp $
 */

package org.eclipse.ocl.library;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.util.LibraryResource;
import org.eclipse.ocl.types.AnyType;
import org.eclipse.ocl.types.BagType;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.InvalidType;
import org.eclipse.ocl.types.MessageType;
import org.eclipse.ocl.types.OrderedSetType;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.types.SequenceType;
import org.eclipse.ocl.types.SetType;
import org.eclipse.ocl.types.TupleType;
import org.eclipse.ocl.types.TypeType;
import org.eclipse.ocl.types.VoidType;
import org.eclipse.ocl.utilities.PredefinedType;

/**
 * Implementation of the {@link OCLLibrary} for the Ecore environment.
 * @since 3.0
 */
public abstract class AbstractOCLLibrary implements OCLLibrary {
	private List<OCLPackage> packages = new ArrayList<OCLPackage>(); // That contribute to the library 
	private OCLType OCL_ANY;
	private OCLType OCL_BOOLEAN;
	private OCLType OCL_INTEGER;
	private OCLType OCL_INVALID;
	private OCLType OCL_MESSAGE;
	private OCLType OCL_REAL;
	private OCLType OCL_STRING;
    private OCLType OCL_UNLIMITED_NATURAL;
	private OCLType OCL_VOID;
	
	private OCLType OCL_TYPE;

	private OCLType OCL_T;
	private OCLType OCL_T2;
	
	private OCLType OCL_SET;
	private OCLType OCL_ORDERED_SET;
	private OCLType OCL_BAG;
	private OCLType OCL_SEQUENCE;
	private OCLType OCL_COLLECTION;
	
//	private OCLType STATE;
//	private OCLType OCL_EXPRESSION;
    
    /** The singleton instance of the <tt>OclInvalid</tt> standard library type. */
    private static InvalidLiteralExp<OCLType> INVALID = null;
//    	libraryPackage.getEFactoryInstance().create(
//        LibraryPackage.Literals.OCL_INVALID_TYPE);   // FIXME
    
    /** The singleton instance of the <tt>OclInvalid</tt> standard library type. */
    private static NullLiteralExp<OCLType> NULL = null;
//    	libraryPackage.getEFactoryInstance().create(
//    	LibraryPackage.Literals.OCL_VOID_TYPE);   // FIXME

    /** The singleton instance of the <tt>OclInvalid</tt> standard library type. */
    private static UnlimitedNaturalLiteralExp<OCLType> UNLIMITED = null;
//    	libraryPackage.getEFactoryInstance().create(
//    	LibraryPackage.Literals.OCL_VOID_TYPE);   // FIXME
    
	public AbstractOCLLibrary(String libraryURI) {
		init(libraryURI);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getBoolean()
	 */
	public OCLType getBoolean() {
		return OCL_BOOLEAN;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getInteger()
	 */
	public OCLType getInteger() {
		return OCL_INTEGER;
	}

    /* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getUnlimitedNatural()
	 */
    public OCLType getUnlimitedNatural() {
        return OCL_UNLIMITED_NATURAL;
    }
    
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclInvalid()
	 */
	public OCLType getOclInvalid() {
		return OCL_INVALID;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getReal()
	 */
	public OCLType getReal() {
		return OCL_REAL;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getString()
	 */
	public OCLType getString() {
		return OCL_STRING;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclAny()
	 */
	public OCLType getOclAny() {
		return OCL_ANY;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclElement()
	 */
	public OCLType getOclElement() {
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getOclElement"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getInvalid()
	 */
	public OCLExpression<OCLType> getInvalid() {
		if (INVALID == null) {
			INVALID = ExpressionsFactory.eINSTANCE.createInvalidLiteralExp();
			INVALID.setType(getOclInvalid());
		}
		return INVALID;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getNull()
	 */
	public OCLExpression<OCLType> getNull() {
		if (NULL == null) {
			NULL = ExpressionsFactory.eINSTANCE.createNullLiteralExp();
			NULL.setType(getOclVoid());
		}
		return NULL;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getState()
	 */
	public OCLType getState() {
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getState"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclMessage()
	 */
	public OCLType getOclMessage() {
		return OCL_MESSAGE;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclType()
	 */
	public OCLType getOclType() {
		return OCL_TYPE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclVoid()
	 */
	public OCLType getOclVoid() {
		return OCL_VOID;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getT()
	 */
	public OCLType getT() {
		return OCL_T;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getT2()
	 */
	public OCLType getT2() {
		return OCL_T2;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getSet()
	 */
	public OCLType getSet() {
		return OCL_SET;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOrderedSet()
	 */
	public OCLType getOrderedSet() {
		return OCL_ORDERED_SET;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getBag()
	 */
	public OCLType getBag() {
		return OCL_BAG;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getSequence()
	 */
	public OCLType getSequence() {
		return OCL_SEQUENCE;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getCollection()
	 */
	public OCLType getCollection() {
		return OCL_COLLECTION;
	}

	public EObject getUnlimited() {
		if (UNLIMITED == null) {
		    UNLIMITED = ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp();
		    UNLIMITED.setIntegerSymbol(-1);
		    UNLIMITED.setType(getUnlimitedNatural());
		}
		return UNLIMITED;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ocl.library.internal.OCLLibrary#getOclExpression()
	 */
	public OCLType getOclExpression() {
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getOclExpression"); //$NON-NLS-1$
	}
	
    protected OCLPackage init(String libraryURI) {
        URI oclstdlibURI = URI.createURI(libraryURI != null ? libraryURI : LibraryResource.OCL_STANDARD_LIBRARY_URI);
        ResourceSet rset = new ResourceSetImpl();
        // Ensure that an EcoreResource factory is registered for the ecore extension.
        // Note that when running standalone, a registration in the global registry is not certain.
        initializeResourceFactory(rset);
        Resource res = null;
        
        try {
            Resource load = rset.getResource(oclstdlibURI, true);
            
            // transfer the loaded resource contents to a new resource that
            //    decodes URI fragments when resolving objects 
            res = getEcoreResourceFactory().createResource(load.getURI());
            res.getContents().addAll(load.getContents());
            
            OCLPackage stdlibPackage = (OCLPackage) res.getContents().get(0);
            packages.add(stdlibPackage);
            OCL_ANY = stdlibPackage.getType(AnyType.SINGLETON_NAME);
//            OCL_ELEMENT = stdlibPackage.getType(ElementType.SINGLETON_NAME);
            OCL_BOOLEAN = stdlibPackage.getType(PrimitiveType.BOOLEAN_NAME);
            OCL_INTEGER = stdlibPackage.getType(PrimitiveType.INTEGER_NAME);
            OCL_REAL = stdlibPackage.getType(PrimitiveType.REAL_NAME);
            OCL_STRING = stdlibPackage.getType(PrimitiveType.STRING_NAME);
            OCL_UNLIMITED_NATURAL = stdlibPackage.getType(PrimitiveType.UNLIMITED_NATURAL_NAME);

            OCL_INVALID = stdlibPackage.getType(InvalidType.SINGLETON_NAME);
            OCL_VOID = stdlibPackage.getType(VoidType.SINGLETON_NAME);
            OCL_MESSAGE = stdlibPackage.getType(MessageType.SINGLETON_NAME);

            
            OCL_T = stdlibPackage.getType("T"); //$NON-NLS-1$
            OCL_T2 = stdlibPackage.getType("T2"); //$NON-NLS-1$
            
//            OCL_TYPE = (EClassifier) EcoreUtil.getObjectByType(
//                    stdlibPackage.getEClassifiers(),
//                    EcorePackage.Literals.TYPE_TYPE);
            OCL_TYPE = stdlibPackage.getType(TypeType.SINGLETON_NAME);
            
            OCL_SET = stdlibPackage.getType("Set"); //$NON-NLS-1$
            OCL_ORDERED_SET = stdlibPackage.getType("OrderedSet"); //$NON-NLS-1$
            OCL_BAG = stdlibPackage.getType("Bag"); //$NON-NLS-1$
            OCL_SEQUENCE = stdlibPackage.getType("Sequence"); //$NON-NLS-1$
            
            // don't use EcoreUtil because the other collection types would match
            OCL_COLLECTION = stdlibPackage.getType("Collection"); //$NON-NLS-1$
            
//            STATE = stdlibPackage.getType("State"); //$NON-NLS-1$
//            OCL_EXPRESSION = stdlibPackage.getType("OclExpression"); //$NON-NLS-1$
            
      //      EPackage libraryPackage = LibraryPackage.eINSTANCE;
      //      EPackage.Registry.INSTANCE.put(libraryPackage.getNsURI(), libraryPackage);
            
            return stdlibPackage;
//        } catch (Exception e) {
            // normal case: the library file isn't there because we are
            //    generating it on the fly.  Let's do that, then
            
//            return build();
        } finally {
            if (res != null) {
                // don't want this resource to be in a resource set
                rset.getResources().remove(res);
            }
        }
    }

	private static String initializeResourceFactory(ResourceSet resourceSet) {
		Resource.Factory.Registry resourceFactoryRegistry = resourceSet != null
		? resourceSet.getResourceFactoryRegistry()
		: Resource.Factory.Registry.INSTANCE;
//		resourceFactoryRegistry.getExtensionToFactoryMap().put(
//			"oclstdlib", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
		String oclLocation = System.getProperty("org.eclipse.ocl.resources"); //$NON-NLS-1$
		if (oclLocation == null)
			return "'org.eclipse.ocl.resources' property not defined; use the launch configuration to define it"; //$NON-NLS-1$
		resourceFactoryRegistry.getExtensionToFactoryMap().put(
			LibraryResource.FILE_EXTENSION, LibraryResource.Factory.INSTANCE);
		Map<URI, URI> uriMap = resourceSet != null
			? resourceSet.getURIConverter().getURIMap()
			: URIConverter.URI_MAP;		
		uriMap.put(URI.createURI(LibraryResource.OCL_STANDARD_LIBRARY_URI), URI.createFileURI(oclLocation + "/libraries/OCL.oclstdlib")); //$NON-NLS-1$
		uriMap.put(URI.createURI(LibraryResource.LIBRARIES_PATHMAP), URI.createFileURI(oclLocation + "/libraries/")); //$NON-NLS-1$
		return null;
	}

	/**
	 * Obtains the best available resource factory suitable for serializing
	 * Ecore models.
	 * 
	 * @return the best available Ecore resource factory
	 */
	private static Resource.Factory getEcoreResourceFactory() {
		//        Resource.Factory result;
		//        Object maybeFactory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
		//            "ecore"); //$NON-NLS-1$
		//        if (maybeFactory instanceof Resource.Factory.Descriptor) {
		//            result = ((Resource.Factory.Descriptor) maybeFactory).createFactory();
		//        } else if (maybeFactory instanceof Resource.Factory) {
		//            result = (Resource.Factory) maybeFactory;
		//        } else {
		//            maybeFactory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(
		//                Resource.Factory.Registry.DEFAULT_EXTENSION);
		//            
		//            if (maybeFactory instanceof Resource.Factory.Descriptor) {
		//                result = ((Resource.Factory.Descriptor) maybeFactory).createFactory();
		//            } else if (maybeFactory instanceof Resource.Factory) {
		//                result = (Resource.Factory) maybeFactory;
		//            } else {
		//                result = new ResourceFactoryImpl();
		//            }
		//        }
		//        
		//        return result;
		// TODO: The EcoreResourceImpl should work!
		return new ResourceFactoryImpl() {

			@Override
			public Resource createResource(URI uri) {
				return new ResourceImpl(uri) {

					@Override
					public EObject getEObject(String uriFragment) {
						return super.getEObject(URI.decode(uriFragment));
					}
				};
			}
		};
	}
	
	public OCLOperation getOperation(OperationCallExp<?, ?> operationCall) {
		Object referredOperation = operationCall.getReferredOperation();
		if (referredOperation instanceof OCLOperation) {
			return (OCLOperation)referredOperation;
		}
		return null;
	}

	public OCLType getOCLTypeOfType(Object object) {
		if (object instanceof PredefinedType<?>) {
			if (object instanceof InvalidType<?>) {
				return getOclInvalid();
			}
			else if (object instanceof VoidType<?>) {
				return getOclVoid();
			}
			else if (object instanceof AnyType<?>) {
				return getOclAny();
			}
			else if (object instanceof TypeType<?, ?>) {
				return getOclType();
			}
			else if (object instanceof MessageType<?, ?, ?>) {
				return getOclMessage();
			}
			else if (object instanceof PrimitiveType<?>) {
				String name = ((PrimitiveType<?>)object).getName();
				if (PrimitiveType.BOOLEAN_NAME.equals(name)) {
					return getBoolean();
				}
				else if (PrimitiveType.INTEGER_NAME.equals(name)) {
					return getInteger();
				}
				else if (PrimitiveType.REAL_NAME.equals(name)) {
					return getReal();
				}
				else if (PrimitiveType.STRING_NAME.equals(name)) {
					return getString();
				}
				else if (PrimitiveType.UNLIMITED_NATURAL_NAME.equals(name)) {
					return getUnlimitedNatural();
				}
			}
			else if (object instanceof CollectionType<?, ?>) {
				if (object instanceof BagType<?, ?>) {
					return getBag();
				}
				else if (object instanceof OrderedSetType<?, ?>) {
					return getOrderedSet();
				}
				else if (object instanceof SequenceType<?, ?>) {
					return getSequence();
				}
				else if (object instanceof SetType<?, ?>) {
					return getSet();
				}
			}
			else if (object instanceof TupleType<?, ?>) {
// FIXME				return getTuple();
			}
		}
		return null;
	}
    
	public OCLType getOCLTypeOfValue(Object object) {
		if (object instanceof InvalidLiteralExp<?>) {			// FIXME This should not be needed
			return getOclInvalid();
		}
		else if (object instanceof NullLiteralExp<?>) {			// FIXME This should not be needed
			return getOclVoid();
		}
		else if ((object instanceof UnlimitedNaturalLiteralExp<?>) && ((UnlimitedNaturalLiteralExp<?>)object).isUnlimited()) {			// FIXME This should not be needed
			return getUnlimitedNatural();
		}
		else if (object instanceof Number) {
			if (object instanceof Integer) {
				return ((Integer)object).intValue() >= 0
				? getUnlimitedNatural()
				: getInteger();
			}
			else if (object instanceof Long) {
				return ((Long)object).longValue() >= 0
				? getUnlimitedNatural()
				: getInteger();
			}
			else if ((object instanceof BigDecimal) || (object instanceof Double) || (object instanceof Float)) {
				return getReal();
			}
			else if (object instanceof BigInteger) {
				return ((BigInteger)object).signum() >= 0
				? getUnlimitedNatural()
				: getInteger();
			}
			else if (object instanceof Short) {
				return ((Short)object).shortValue() >= 0
				? getUnlimitedNatural()
				: getInteger();
			}
		}
		else if (object instanceof Boolean) {
			return getBoolean();
		}
		else if ((object instanceof String) || (object instanceof StringBuffer)) {
			return getString();
		}
		return null;
	}
	
	public List<OCLPackage> getPackages() {
		return packages;
	}
}