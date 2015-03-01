package demo;

import wcs.java.util.Util;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;


public class Setup extends wcs.java.Setup {

    public String exec(ICS ics, String site, String username, String password) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("sono qui\n");
        ElementCatalog ec = new ElementCatalog(ics, username, password);
        ec.replace("Sono/Una/Prova.jsp", "<%=\n3+3\n%>\n" );
        ec.close();

    	return sb + super.exec(ics, site, username, password);
	}

	@Override
	public Class<?>[] getAssets() {
		return new Class<?>[0]; // Util.classesFromResource(Config.site, "elements.txt");
	}
}
