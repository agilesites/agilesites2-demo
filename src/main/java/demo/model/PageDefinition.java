package demo.model;

import wcs.java.model.DefinitionModelBase;
import wcs.java.model.definition.loader.DefinitionLoader;
import wcs.java.model.definition.loader.PageDefinitionLoader;

public class PageDefinition extends DefinitionModelBase {
	private DefinitionLoader definitionLoader = new PageDefinitionLoader("demo");

	public PageDefinition() {
		super("PageDefinition", "", "PageAttribute");
		definitionLoader.saveDefinitions(this);
	}

}
