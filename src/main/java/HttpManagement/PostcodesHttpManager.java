package HttpManagement;

import ConfigManagement.ConfigManager;

public class PostcodesHttpManager extends HttpManager {

    public PostcodesHttpManager(String postcode) {
        super(ConfigManager.baseUrl() + ConfigManager.postcodesEndpoint() + "/" + postcode);
    }

}
