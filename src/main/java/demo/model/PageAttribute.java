package demo.model;

import wcs.java.model.AttributeModelBase;
import wcs.java.model.definition.loader.DefinitionLoader;
import wcs.java.model.definition.loader.PageDefinitionLoader;

public class PageAttribute extends AttributeModelBase {
	private DefinitionLoader definitionLoader = new PageDefinitionLoader("demo");

	public PageAttribute() {
		super("PageAttribute");

		definitionLoader.saveAttributes(this);

	}

}
