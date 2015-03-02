package demo;

import wcs.java.util.Util;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;


public class Setup extends wcs.java.Setup {

	@Override
	public Class<?>[] getAssets() {
        Util.classesFromResource(Config.site, "elements.txt");
	}
}
