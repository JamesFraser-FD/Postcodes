package HttpManagement.Base;

import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public abstract class HttpGetManager extends HttpManager {

    private final HttpGet httpGet;

    public HttpGetManager(String urlString) {
        super(urlString);
        httpGet = new HttpGet(urlString);
    }

    public void makeUrlCall() {
        try {
            httpResponse = client.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
