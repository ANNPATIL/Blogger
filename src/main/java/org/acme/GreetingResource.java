package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/blog")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String blog() {
        return "Read All Blogs";
    }

    @POST
    @Path("/hello")
    public String hello() {
        return "A new blog is created with content hello";
    }

    @PUT
    @Path("/ABC")
    public String ABC() {
        return "A blog ABC has been updated with content hello";
    }
    @DELETE
    @Path("/Def")
    public String Def(){
        return "delete";
    }
}
