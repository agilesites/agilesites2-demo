package demo.model;

import wcs.java.model.AttributeModelBase;
import wcs.java.model.definition.loader.AssetDefinitionLoader;
import wcs.java.model.definition.loader.DefinitionLoader;

public class DemoAttribute extends AttributeModelBase {
    private DefinitionLoader definitionLoader = new AssetDefinitionLoader("demo");

    public DemoAttribute() {
        super("Demo_A");
        definitionLoader.saveAttributes(this);
    }

}
