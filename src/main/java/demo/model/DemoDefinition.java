package demo.model;

import wcs.api.Log;
import wcs.java.model.DefinitionModelBase;
import wcs.java.model.definition.loader.AssetDefinitionLoader;
import wcs.java.model.definition.loader.DefinitionLoader;

import static wcs.Api.getLog;

/**
 * Class contains Parent and Content definitions for Flex Family Demo.
 */
public class DemoDefinition extends DefinitionModelBase {
        private DefinitionLoader assetDefinitionLoader = new AssetDefinitionLoader("demo");

        final static Log log = getLog(DemoDefinition.class);

        public DemoDefinition() {
                super("Demo_CD", "Demo_PD", "Demo_A");

                // First save parent definitions, so they can be added to asset definitions.
                assetDefinitionLoader.saveParentDefinitions(this);

                // Save asset definitions, and add parents + attributes.
                assetDefinitionLoader.saveDefinitions(this);

        }
}
