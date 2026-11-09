package com.redhat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/flag")
public class FlagResource {

    private static final String ENCODED_FLAG = "4105521c3f46103760066c5945570169511e57313f020003601b54";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String flag() {
        return ENCODED_FLAG;
    }
}
