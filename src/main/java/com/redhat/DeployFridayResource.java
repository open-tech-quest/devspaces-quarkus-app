package com.redhat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/deploy-friday")
public class DeployFridayResource {

    private static final String ENCODED_FLAG = "4443071e64473c06620300472b4501465c404a1d0b030d37370702514058";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String deployOnFriday() {
        return "yes";
    }
}
