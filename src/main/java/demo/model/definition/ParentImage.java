package demo.model.definition;

import wcs.api.Index;
import wcs.java.model.annotation.AssetAttribute;
import wcs.java.model.annotation.ParentDefinition;
import wcs.java.model.definition.WCSDefinition;
import wcs.java.model.type.StringAttributeType;
import wcs.java.model.type.WCSAttribute;

@ParentDefinition("Image Folder")
@Index("demo/definitions.txt")
public class ParentImage implements WCSDefinition {

    @AssetAttribute("Category")
    private WCSAttribute<StringAttributeType> categoryString;

}
