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


import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.common.io.eclipse.MetamodelRegistryProvider;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompilerMessages;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.mmregistry.IMetamodelRegistryProvider;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtModule;
import org.eclipse.osgi.util.NLS;

/**
 * This class has only tiny changes from DeployedQvtModule.
 */
@SuppressWarnings("restriction")
public class StandaloneQvtModule extends QvtModule
{ 
	private final URI moduleURI;
	private Module myModule = null;
	private CompiledUnit myUnit = null;
    private QVTOCompiler myCompiler = null;
	
	public StandaloneQvtModule(URI qvtModuleID) {
		if(qvtModuleID == null || qvtModuleID.toString().length() == 0) {
			throw new IllegalArgumentException("Invalid QVT module ID"); //$NON-NLS-1$
		}
		this.moduleURI = qvtModuleID;
    }
	
	protected IMetamodelRegistryProvider creatMetamodelRegistryProvider() {
		return new MetamodelRegistryProvider();
	}
	
    @Override
	public Module getModule() throws MdaException {
        if (myModule == null) {
			UnitResolverFactory factory = UnitResolverFactory.Registry.INSTANCE.getFactory(moduleURI);
			UnitResolver unitResolver = factory.getResolver(moduleURI);
			UnitProxy srcUnit = factory.findUnit(moduleURI);
        	if (srcUnit == null) {
        		throw new MdaException(NLS.bind(CompilerMessages.importedModuleNotFound, moduleURI));
        	}

        	
            QVTOCompiler qvtCompiler = new QVTOCompiler(unitResolver, creatMetamodelRegistryProvider());

            QvtCompilerOptions options = getQvtCompilerOptions();
            if (options == null) {
                options = new QvtCompilerOptions();
                options.setGenerateCompletionData(false);
            }
           
            myUnit = qvtCompiler.compile(srcUnit, options, null);
            
            if (!options.isModuleWithErrorAllowed()) {
            	checkModuleErrors(myUnit);
            }
            
            // FIXME - we should add support of uri fragment, being the name of the refered module
            myModule = myUnit.getModules().get(0);
            myCompiler = qvtCompiler;
        }
        
        return myModule;
    }
    
	@Override
	public QVTOCompiler getCompiler() throws MdaException {
		getModule();
		return myCompiler;
	}
	
    @Override
	public CompiledUnit getUnit() throws MdaException {
    	getModule();    	
    	return myUnit;
    }
	
    @Override
	public String toString() {
        return "deployed:/" + moduleURI; //$NON-NLS-1$
    }
}
