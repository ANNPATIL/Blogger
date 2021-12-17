package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.List;

@ApplicationScoped
public class BloggingRepository implements PanacheRepository<Blog> {


    public Blog updateBlog(long id, Blog blog) {
        Blog entity = Blog.findById(id);
        if (entity == null) {
            throw new NotFoundException();
        }
        entity.title = blog.title;
        entity.name = blog.name;
        entity.persist();
        return entity;
    }


    public Blog postBlog(Blog blog) {
        blog.persist();
        return blog;


    }


    @Transactional
    public Blog findByid(long id,Blog blog) {
//        Blog blog = new Blog();
//        Blog blog = findById(id);
//        List<Blog> blogs = Blog.listAll();
//        for (Blog blog1 : blogs) {
        if (blog.id==id) {
            return blog;
        }
        return null;
    }





    String findanddelete(long id) {
        Blog blog = findById(id);
        if (blog.isPersistent()) {
            if (deleteById(id) == true) {
                return "Item is deleted with id" + id;
            }
        }
        return "Item is not deleted with id";
    }


}

