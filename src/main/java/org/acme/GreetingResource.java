package org.acme;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Blogs")
public class GreetingResource {


    @Inject
    BlogService blogService;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> Blogwithqwery(@QueryParam("id") int id) {

        return blogService.getBlogs();
    }

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Blog getBlog(Blog blog) {
        return blogService.getBlog(blog);
    }

    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog postBlog(Blog blog) {
        return blogService.postBlog(blog);
    }

    @PUT
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog UpdateBlog(@PathParam("id") String id,Blog blog) {
        return blogService.UpdateBlog(id,blog);
    }

    @DELETE
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteBlog(@PathParam("id") long id) {
        return blogService.DeleteBlog(id);
    }




//    @DELETE
//    @Path("/blog/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Transactional
//    public String deleteblog(@PathParam("id") long id){
//        return blogService.deleteblog(id);
//    }




}

