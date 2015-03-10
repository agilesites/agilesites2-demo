package demo.model;

import com.fatwire.assetapi.def.AssetTypeInfo;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;
import wcs.java.model.FlexFamilyModelBase;
import wcs.java.model.definition.loader.FlexFamilyLoader;

/**
 * Created by jelerak on 3/5/2015.
 */
public class DemoFlexFamily extends FlexFamilyModelBase {
    private FlexFamilyLoader familyLoader = new FlexFamilyLoader("demo");

    public DemoFlexFamily() {
        familyLoader.saveFlexFamilies(this);
    }

}
