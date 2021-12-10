package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Blogs")
public class GreetingResource {


    @Inject
    Blogservice blogservice;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) blogservice.getBlogs();
    }

//    @GET
//    @Path("/readblog")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String readblog (@PathParam("Blog") String Blog){
//        return "read a blog by blogger";
//    }

    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogservice.postBlog(name , author);
    }

    @PUT
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog updateBlogbyname(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogservice.updateBlogbyname(name, author);
    }

    @GET
    @Path("/blog/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Blog getBlogbyname(@PathParam("name") String name){
        return blogservice.getBlogbyname(name);
    }

    @DELETE
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog deleteBlogbyname(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogservice.deleteBlogbyname(name, author);
    }
}

