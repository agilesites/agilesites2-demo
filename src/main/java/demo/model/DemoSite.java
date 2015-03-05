package demo.model;

import demo.model.enums.DemoAssetTypeNames;
import wcs.java.model.SiteModelBase;
import wcs.java.model.enums.AssetTypeNames;
import wcs.java.model.enums.Constants;

/**
 * This class models the entire site
 * 
 * @author msciab
 * 
 */
public class DemoSite extends SiteModelBase {

    DemoType demoType = new DemoType();

	DemoAttribute demoAttributes = new DemoAttribute();
	PageAttribute pageAttributes = new PageAttribute();
	DemoDefinition demoDefinitions = new DemoDefinition();
	PageDefinition pageDefinitions = new PageDefinition();
	DemoStartMenu startMenus = new DemoStartMenu();

	public DemoSite() {
		// initial id, name and description
		super(Constants.FIRST, "Demo", "Agilesites Demo");

		// types
		setAssetTypes(
				AssetTypeNames.STATIC.toString(),
				AssetTypeNames.TEMPLATE.toString(),
				AssetTypeNames.CS_ELEMENT.toString(),
				AssetTypeNames.SITE_ENTRY.toString(),
				AssetTypeNames.ATTR_TYPES.toString(),
				AssetTypeNames.PAGE_ATTRIBUTE.toString(),
				AssetTypeNames.PAGE_DEFINITION.toString(),
				AssetTypeNames.PAGE.toString(),
				AssetTypeNames.ADV_COLS.toString(),
				AssetTypeNames.SEGMENTS.toString(),
				AssetTypeNames.SCALAR_VARS.toString(),
                DemoAssetTypeNames.DEMO_A.toString(),
                DemoAssetTypeNames.DEMO_C.toString(),
                DemoAssetTypeNames.DEMO_CD.toString(),
                DemoAssetTypeNames.DEMO_F.toString(),
                DemoAssetTypeNames.DEMO_P.toString(),
                DemoAssetTypeNames.DEMO_PD.toString());


		// enabled users with his role
		addUserRoles("fwadmin", "AdvancedUser", "GeneralAdmin", "SitesUser");

		// attributes
		setAttributes(demoAttributes, pageAttributes);

		// definitions
		setDefinitions(demoDefinitions, pageDefinitions);

        // start menus
		setStartMenuItems(startMenus);

        setFlexFamilies(demoType);

	}

}
