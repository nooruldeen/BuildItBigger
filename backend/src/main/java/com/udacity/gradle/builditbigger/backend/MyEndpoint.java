package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Named;

import io.bigsoft.android.jokes.JokeTeller;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    private static final Logger LOGGER = Logger.getLogger( MyEndpoint.class.getName() );

    @ApiMethod(name = "getJoke")
    public MyBean getJoke(@Named("name") String name) {
        LOGGER.log( Level.FINE, "Inside GCE" );
        MyBean response = new MyBean();
        response.setData(JokeTeller.getJoke());

        return response;
    }

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

}
