package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Blog")
public class GreetingResource {

    Blogservice blogservice = new Blogservice();

    @GET
    public String Blog() {
        return "Read All Blogs";
    }

    @GET
    @Path("/rblog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) blogservice.getBlog();
    }

    @GET
    @Path("/readblog")
    @Produces(MediaType.APPLICATION_JSON)
    public String readblog (@PathParam("Blog") String Blog){
        return "read a blog by blogger";
    }

    @POST
    @Path("/Query")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogservice.postBlog(name , author);
    }

    @GET
    @Path("/particular")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithquery(@QueryParam("author") String author, @QueryParam("name") String name) {
        return (List<Blog>) blogservice.getBlog();
    }

    @DELETE
    @Path("/remove")
    @Produces(MediaType.APPLICATION_JSON)
    public String removequery(@QueryParam("author") String author, @QueryParam("name") String name) {
        return "A blog with " +name+ "and" +author+ "has been deleted";
    }
}

