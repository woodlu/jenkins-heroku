package ru.wdl.endpoint;

import lombok.AllArgsConstructor;

import ru.wdl.service.EmailService;

import javax.inject.Singleton;
import javax.ws.rs.*;

@Path("/jenkins")
@Singleton
@AllArgsConstructor
public class AppResource {

    EmailService emailService;

    @GET
    @Path("/test")
    public String test(@DefaultValue("test") @QueryParam("name") String name) {
        return String.format("Hello, %s!", name);
    }
}
