package demo.model.flexfamilies;


import wcs.api.Index;
import wcs.java.model.annotation.FlexFamily;

/**
 * Created by jelerak on 3/9/2015.
 */
@FlexFamily(flexAsset = "Demo_C", flexAttribute = "Demo_A", flexFilter = "Demo_F",
        flexParent = "Demo_P", flexParentDefinition = "Demo_PD", flexContentDefinition = "Demo_CD"
)
@Index("demo/families.txt")
public class DemoMainFlexFamily {
}
