package HttpManagement;

import ConfigManagement.ConfigManager;
import HttpManagement.Base.HttpPostManager;
import org.json.JSONObject;

public class BulkPostcodesHttpManager extends HttpPostManager {

    public BulkPostcodesHttpManager(String[] postcodes) {
        super(ConfigManager.baseUrl() + ConfigManager.postcodesEndpoint());

        JSONObject body = new JSONObject();
        body.put("postcodes", postcodes);
        setBody(body);
    }

}
