package demo.model.enums;

import wcs.java.model.AttributeEnum;
import wcs.java.model.enums.Constants;
import wcs.java.util.NamingUtil;

public enum DemoAttributeEditorNames implements AttributeEnum {

    RICH_TEXT_EDITOR("RichEditor"),
    YES_NO_EDITOR("YesNoEditor"),
    COLOUR_CHOOSER("ColorChooser");

    private long id;
    private String desc;

    private DemoAttributeEditorNames(String desc)  {
        this.id = Constants.ATTRIBUTE_START + NamingUtil.hash(super.name());
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return NamingUtil.convert(super.name());
    }

    @Override
    public String getDescription() {
        return desc;
    }

}
