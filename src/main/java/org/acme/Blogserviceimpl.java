package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
 public class Blogserviceimpl implements Blogservice {
    List<Blog> blogs = new ArrayList<>();

    public Blogserviceimpl() {

        Blog blog = new Blog();
        blog.author = "Annapurna";
        blog.name = "automation";
        Blog blog2 = new Blog();
        blog2.author = "Bapu";
        blog2.name = "markating";

        blogs.add(blog);
        blogs.add(blog2);

    }

    public List<Blog> getBlogs() {

        return blogs;
    }

    public Blog postBlog(String name, String author) {
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name;
        blogs.add(blog);
        return blog;


    }

    public Blog getBlogbyname(String name) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blogs.add(blog1);

            }
        }
        return null;
    }

    public Blog updateBlogbyname(String name, String author) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog1.author = author;
                blogs.add(blog1);

            }
        }
        return null;
    }

    public Blog deleteBlogbyname(String name, String author) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog1.author = author;
                blogs.remove(blog1);
            }
        }
        return null;
    }
}




