<?xml version="1.0" encoding="UTF-8"?>
<mspec:mspec xmlns:mspec="http://www.eclipse.org/buckminster/MetaData-1.0" name="OCL Branch Tests MSPEC" url="ocl-tools.cquery">
  <mspec:property key="resolve.target.platform" value="true"/>
  <mspec:property key="resolve.ocl.core" value="false"/>
  <!-- The tools build requires having some (OCL build) feature sources in the target platform
  however, we don't have this requirement for the tests build, and therefore every source artifact
  should be skipped -->
  <mspec:mspecNode namePattern="^org\.eclipse\.ocl.*\.source$" exclude="true"/>
</mspec:mspec>
