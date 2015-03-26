package demo;

import demo.model.DemoSite;
import wcs.api.Log;
import wcs.java.model.ElementImporter;
import wcs.java.model.StaticImporter;
import wcs.java.util.Util;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;

public class Setup extends wcs.java.Setup {

    private static Log log = Log.getLog(Setup.class);

    @Override
    public String exec(ICS ics, String site, String username, String password) {
        StringBuilder sb = new StringBuilder();
        try {
            // validate the content model
            sb.append(new DemoSite().setup(ics, username, password));
            sb.append(new ElementImporter().setup(ics, username, password));
            sb.append(super.exec(ics, site, username, password));
        } catch (Throwable ex) {
            ex.printStackTrace();
            log.error("*** ERROR: " + ex.getMessage() + " ***");
            sb.append("*** ERROR: ").append(ex.getMessage()).append(" ***");
        }


        return sb.toString();
    }

    @Override
	public Class<?>[] getAssets() {
           return Util.classesFromResource(Config.site, "elements.txt");
	}
}
