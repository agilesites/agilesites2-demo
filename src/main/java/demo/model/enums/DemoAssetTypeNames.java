package demo.model.enums;

/**
 * Created by jelerak on 3/5/2015.
 */
public enum DemoAssetTypeNames {

    DEMO_F("Demo_F"),
    DEMO_A("Demo_A"),
    DEMO_PD("Demo_PD"),
    DEMO_CD("Demo_CD"),
    DEMO_P("Demo_P"),
    DEMO_C("Demo_C");

    private String desc;

    private DemoAssetTypeNames(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }


    }
