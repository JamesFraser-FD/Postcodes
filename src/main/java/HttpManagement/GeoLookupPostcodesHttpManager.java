package HttpManagement;

import ConfigManagement.ConfigManager;
import HttpManagement.Base.HttpGetManager;

public class GeoLookupPostcodesHttpManager extends HttpGetManager {

    public GeoLookupPostcodesHttpManager(double latitude, double longitude) {
        super(ConfigManager.baseUrl() + ConfigManager.postcodesEndpoint());
        addQueryParam("lat", String.valueOf(latitude));
        addQueryParam("lon", String.valueOf(longitude));
    }

}
