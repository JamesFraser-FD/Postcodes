package HttpManagement;

import ConfigManagement.ConfigManager;
import HttpManagement.Base.HttpGetManager;

public class PostcodesHttpManager extends HttpGetManager {

    public PostcodesHttpManager(String postcode) {
        super(ConfigManager.baseUrl() + ConfigManager.postcodesEndpoint() + "/" + postcode);
    }

}
