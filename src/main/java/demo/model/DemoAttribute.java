package demo.model;

import demo.model.enums.DemoAttributeEditorNames;
import wcs.java.model.AttributeModelBase;
import wcs.java.model.definition.loader.AssetDefinitionLoader;
import wcs.java.model.definition.loader.DefinitionLoader;
import wcs.java.model.editors.PullDownEditor;
import wcs.java.model.editors.RichTextEditor;

public class DemoAttribute extends AttributeModelBase {
    private DefinitionLoader definitionLoader = new AssetDefinitionLoader("demo");

    public DemoAttribute() {
        super("Demo_A");
        saveAttributeEditors();
        definitionLoader.saveAttributes(this);
    }

    private void saveAttributeEditors() {
        // ATTRIBUTE EDITORS
        definitionLoader.addEditor(DemoAttributeEditorNames.RICH_TEXT_EDITOR);
        attrEditor(DemoAttributeEditorNames.RICH_TEXT_EDITOR,RichTextEditor.getBuilder(DemoAttributeEditorNames.RICH_TEXT_EDITOR.name()).heightValue("500").widthValue("600").allowedAssetTypesValue("Demo_C").build().toXml());
        definitionLoader.addEditor(DemoAttributeEditorNames.YES_NO_EDITOR);
        attrEditor(DemoAttributeEditorNames.YES_NO_EDITOR, PullDownEditor.getBuilder(DemoAttributeEditorNames.YES_NO_EDITOR.toString()).addItem("YES").addItem("NO").build().toXml());
        definitionLoader.addEditor(DemoAttributeEditorNames.COLOUR_CHOOSER);
        attrEditor(DemoAttributeEditorNames.COLOUR_CHOOSER, PullDownEditor.getBuilder(DemoAttributeEditorNames.COLOUR_CHOOSER.toString()).addItem("Red").addItem("Green").addItem("Blue").build().toXml());
    }
}
