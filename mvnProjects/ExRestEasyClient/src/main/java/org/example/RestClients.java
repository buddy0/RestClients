package org.example;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import java.util.HashMap;

public class RestClients {

    private static final String SAMPLE_API = "https://catfact.ninja/fact";

    static WebTarget webTarget;

    static {
        Client client = ResteasyClientBuilder.newBuilder().build();
        webTarget = client.target(SAMPLE_API);
    }

    static String getHello() {
       Response response =  webTarget.request().get();
       return response.readEntity(String.class);
    }
}
