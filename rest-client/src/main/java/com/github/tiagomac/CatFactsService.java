package com.github.tiagomac;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/facts")
@RegisterRestClient(configKey = "cat-facts-api")
public interface CatFactsService {

    @GET
    public String getFact();

}
