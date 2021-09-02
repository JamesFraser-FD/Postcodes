package HttpManagement.Base;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public abstract class HttpPostManager extends HttpManager {

    private final HttpPost httpPost;

    public HttpPostManager(String urlString) {
        super(urlString);
        httpPost = new HttpPost(urlString);
    }

    public void setBody(JSONObject bodyJson) {
        StringEntity entity = null;
        try {
            entity = new StringEntity(bodyJson.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
    }

    public void makeUrlCall() {
        try {
            httpResponse = client.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
