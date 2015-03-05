package demo.model.definition;

import wcs.api.Index;
import wcs.java.model.annotation.*;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.enums.StartMenuTypeEnum;
import wcs.java.model.type.BlobAttributeType;
import wcs.java.model.type.StringAttributeType;
import wcs.java.model.type.WCSAttribute;

@AssetDefinition("Image")
@Parent(ParentImage.class)
@StartMenu(items={
        @StartMenuItem(name="New Image", type = StartMenuTypeEnum.MENU_TYPE_NEW, assetType = "Demo_C"),
        @StartMenuItem(name="Find Image", type = StartMenuTypeEnum.MENU_TYPE_FIND, assetType = "Demo_C")
})
@Index("demo/definitions.txt")
public class Image implements WCSDefinition {

    @AssetAttribute("Large Image")
    @Required
    private WCSAttribute<BlobAttributeType> largeImage;

    @AssetAttribute("Medium Image")
    @Required
    private WCSAttribute<BlobAttributeType> mediumImage;

    @AssetAttribute("Small Image")
    @Required
    private WCSAttribute<BlobAttributeType> smallImage;

    @AssetAttribute("Alt Text Image")
    @Required
    private WCSAttribute<StringAttributeType> altTextImageString;


    public Image() {
    }
}
