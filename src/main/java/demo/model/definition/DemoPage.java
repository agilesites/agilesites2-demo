package demo.model.definition;

import wcs.api.Index;
import wcs.java.model.annotation.*;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.enums.StartMenuTypeEnum;
import wcs.java.model.type.AssetAttributeType;
import wcs.java.model.type.StringAttributeType;
import wcs.java.model.type.WCSAttribute;

@PageDefinition("DemoPage")
@StartMenu(items={
        @StartMenuItem(name="New Content Page", type = StartMenuTypeEnum.MENU_TYPE_NEW, assetType = "Page"),
        @StartMenuItem(name="Find Content Page", type = StartMenuTypeEnum.MENU_TYPE_FIND, assetType = "Page")
})
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
