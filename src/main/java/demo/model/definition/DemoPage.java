package demo.model.definition;

import wcs.api.Index;
import wcs.java.model.annotation.AssetType;
import wcs.java.model.annotation.PageAssetAttribute;
import wcs.java.model.annotation.PageDefinition;
import wcs.java.model.annotation.Required;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.type.AssetAttributeType;
import wcs.java.model.type.StringAttributeType;
import wcs.java.model.type.WCSAttribute;

@PageDefinition("DemoPage")
@Index("demo/definitions.txt")
public class DemoPage implements WCSDefinition {

    @PageAssetAttribute("title")
    @Required
    private WCSAttribute<StringAttributeType> title;

    @PageAssetAttribute("subtitle")
    @Required
    private WCSAttribute<StringAttributeType> subtitle;

    @PageAssetAttribute("summary")
    @Required
    private WCSAttribute<StringAttributeType> summary;

    @PageAssetAttribute("image")
    @Required
    @AssetType("Demo_C")
    private WCSAttribute<AssetAttributeType> image;
}
