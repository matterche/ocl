Bug 345708 means that the Acceleo builder cannot do a clean build of Acceleo templates for MDT/OCL.

As a workaround we do a dirty build, and put the products in GIT from the src2 folder so that the
Java build copies the files across to the bin folder, from where they are distributed provided no
Acceleo buiold occurs.

Therefore the GIT status is to make src2 a source folder, disabled the Acceleo builder and nature,
eliminate build.acceleo and the custombuildcallbacks.

For development, the Acceleo builder is enabled, the ocl and ocl.ecore plugins are closed, the src2
is a non-source folder so that emtl files are correctly produced. Once tested they are copied from bin
to src2 possibly with aid of tree compare and committed to GIT.