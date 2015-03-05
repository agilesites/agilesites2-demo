package demo.model;

import com.fatwire.assetapi.def.AssetTypeInfo;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;
import wcs.java.model.FlexFamilyModelBase;

/**
 * Created by jelerak on 3/5/2015.
 */
public class DemoType extends FlexFamilyModelBase {
    private FlexFamiliesDefinitionLoader definitionLoader = new FlexFamiliesDefinitionLoader("demo");

    public DemoType() {
        super();
/*
        FlexAssetFamilyInfo info = new FlexAssetFamilyInfo() {
            @Override
            public AssetTypeInfo getFlexAttributeInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_A";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_A";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_A";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }

            @Override
            public AssetTypeInfo getFlexParentDefInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_PD";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_PD";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_PD";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }

            @Override
            public AssetTypeInfo getFlexDefInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_CD";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_CD";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_CD";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }

            @Override
            public AssetTypeInfo getFlexParentInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_P";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_P";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_P";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }

            @Override
            public AssetTypeInfo getFlexAssetInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_C";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_C";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_C";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }

            @Override
            public AssetTypeInfo getFlexFilterInfo() {
                return new AssetTypeInfo() {
                    @Override
                    public String getAssetTypeName() {
                        return "Demo_F";
                    }

                    @Override
                    public String getDescription() {
                        return "Demo_F";
                    }

                    @Override
                    public String getPlural() {
                        return "Demo_F";
                    }

                    @Override
                    public boolean isAssetTypeIndexingEnabled() {
                        return true;
                    }
                };
            }
        };
        addFlexFamilyData(info);
*/
    }


}
