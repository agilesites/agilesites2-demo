package demo.model;

import wcs.api.Log;
import wcs.java.model.StartMenuModelBase;
import wcs.java.model.definition.loader.AssetDefinitionLoader;
import wcs.java.model.definition.loader.DefinitionLoader;

import static wcs.Api.getLog;

/**
 * Class contains Start Menu items for Flex Family Demo.
 */
public class DemoStartMenu extends StartMenuModelBase {
        private DefinitionLoader assetDefinitionLoader = new AssetDefinitionLoader("demo");

        final static Log log = getLog(DemoStartMenu.class);

        public DemoStartMenu() {
            createDefaultStartMenus();
            assetDefinitionLoader.saveStartMenus(this);
        }


}
