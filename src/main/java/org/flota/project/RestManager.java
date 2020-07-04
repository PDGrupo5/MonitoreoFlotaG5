package org.flota.project;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Este ejemplo muestra el uso del patron singleton para la clase RestMAnager el
 * cual Se encargará de las peticiones http a nuestro api
 */
public class RestManager {

    public static RestManager manager;
    private String uri;

    public static synchronized RestManager getInstance(String uri) {
        if (manager == null) {
            manager = new RestManager();
            manager.uri = uri;
        }
        return manager;
    }

    public void makeGetRequest(String path) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            // HTTP GET method
            HttpGet httpget = new HttpGet(this.uri + path);
            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
        }
    }
}