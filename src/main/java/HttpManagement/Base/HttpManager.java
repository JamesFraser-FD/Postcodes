package HttpManagement.Base;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public abstract class HttpManager {

    protected final HttpClient client;
    protected HttpResponse httpResponse;

    public HttpManager(String urlString) {
        client = HttpClientBuilder.create().build();
    }

    public abstract void makeUrlCall();

    public String getResponseBody() {
        try {
            return EntityUtils.toString(httpResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Header[] getResponseHeaders() {
       return httpResponse.getAllHeaders();
    }

}
