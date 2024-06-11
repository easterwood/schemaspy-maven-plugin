package com.wakaleo.schemaspy;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.Test;

import java.io.File;
import java.util.Locale;

public class WhenPassingParametersToSchemaSpyTest extends AbstractMojoTestCase {

    @Test
	public void testThePathToDriversOptionIsPassedAsDP() throws Exception {
        File testPom = new File(getBasedir(), "src/test/projects/unit/oracle-plugin-config.xml");
        SchemaSpyReport mojo = (SchemaSpyReport) lookupMojo("schemaspy", testPom);
        MavenSchemaAnalyzer analyzer = new MavenSchemaAnalyzer();
        mojo.setSchemaAnalyzer(analyzer);
        
        mojo.executeReport(Locale.getDefault());
	}
}
