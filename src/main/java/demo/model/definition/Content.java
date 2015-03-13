package demo.model.definition;

import wcs.api.Index;
import wcs.java.model.annotation.*;
import wcs.java.model.definition.WCSFlexFamily;
import wcs.java.model.enums.StartMenuTypeEnum;
import wcs.java.model.type.*;

@PageDefinition("DemoPage")
@StartMenu(items={
        @StartMenuItem(name="New Content Page", type = StartMenuTypeEnum.MENU_TYPE_NEW, assetType = "Page"),
        @StartMenuItem(name="Find Content Page", type = StartMenuTypeEnum.MENU_TYPE_FIND, assetType = "Page")
})
@Index("demo/definitions.txt")
public class Content implements WCSFlexFamily {

    @PageAssetAttribute("title")
    @Required
    private WCSAttribute<StringAttributeType> title;

    @PageAssetAttribute("subtitle")
    @Editor("RichEditor")
    private WCSAttribute<StringAttributeType> subtitle;

    @PageAssetAttribute("summary")
    @Required
    private WCSAttribute<StringAttributeType> summary;

    @PageAssetAttribute("detail")
    @Required
    @Editor("RichEditor")
    private WCSAttribute<TextAttributeType> detail;

    @PageAssetAttribute("image")
    @Required
    private WCSAttribute<BlobAttributeType> image;

    @PageAssetAttribute("teaserTitle")
    @Multiple
    private WCSAttribute<StringAttributeType> teaserTitle;

    @PageAssetAttribute("teaserText")
    @Multiple
    private WCSAttribute<TextAttributeType> teaserText;

    @PageAssetAttribute("related")
    @Multiple
    @AssetType("Page")
    private WCSAttribute<AssetAttributeType> related;

    @PageAssetAttribute("seeAlso")
    @Multiple
    @AssetType("Page")
    private WCSAttribute<AssetAttributeType> seeAlso;
}
