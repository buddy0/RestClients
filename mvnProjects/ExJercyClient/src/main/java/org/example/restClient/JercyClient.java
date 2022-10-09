package org.example.restClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class JercyClient {
    private static final String SAMPLE_API = "https://catfact.ninja/fact";

    static WebTarget webTarget;

    static {
        Client client = ClientBuilder.newClient();
        webTarget = client.target(SAMPLE_API);
    }

    public static String getHello() {
        Response response =  webTarget.request().get();
        return response.readEntity(String.class);
    }
}
