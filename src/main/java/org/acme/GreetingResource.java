package org.acme;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/Blog")
public class GreetingResource {


    @Inject
    BlogService bloggingService;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) bloggingService.GetBlogs();
    }


    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response PostBlog(Blog blog) {
        bloggingService.PostBlog(blog);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog UpdateBlog(@PathParam("id") long id, Blog blog) {
        return bloggingService.UpdateBlog(id, blog);
    }

    @GET
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog findByid(@PathParam("id") long id, Blog blog) {
        return bloggingService.findByid(id,blog);
    }


    @DELETE
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteBlog(@PathParam("id") long id) {
        return bloggingService.DeleteBlog(id);
    }
}