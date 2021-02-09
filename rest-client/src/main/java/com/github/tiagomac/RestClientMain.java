package com.github.tiagomac;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

@QuarkusMain
public class RestClientMain implements QuarkusApplication {

    @Inject
    @RestClient
    CatFactsService catFactsService;

    @Override
    public int run(String... args) throws Exception {
        System.out.println(catFactsService.getFact());
        return 0;
    }
}
