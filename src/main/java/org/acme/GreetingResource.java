package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/ABC")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ABC() {
        return "Read All Blogs";
    }


    @GET
    @Path("/{name}/{All}")
    public String All(@PathParam("name") String name, @PathParam("All") String All) {
        return "Hello" +name ;
    }

    @GET
    @Path("/particular")
    public String particular() {
        return "Get a particular blog";
    }

    @POST
    @Path("/hello")
    public String hello() {
        return "A new blog is created with content hello";
    }

    @PUT
    @Path("/{id}/{adding}")
    public String adding(@PathParam("id") String id, @PathParam("hello") String hello) {
        return "A blog with id " +id ;
        return "has been updated with content" + hello;
    }

}

