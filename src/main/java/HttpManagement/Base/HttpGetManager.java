package HttpManagement.Base;

import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public abstract class HttpGetManager extends HttpManager {

    private HttpGet httpGet;

    public HttpGetManager(String urlString) {
        super(urlString);
    }

    public void makeUrlCall() {
        httpGet = new HttpGet(buildUrl());

        try {
            httpResponse = client.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
