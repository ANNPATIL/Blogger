package org.acme;

import java.util.ArrayList;
import java.util.List;

public class Blogservice {
    List<Blog> blogs = new ArrayList<>();

    public Blogservice() {
    }

    public List<Blog> getBlog() {
        Blog blog = new Blog();
        blog.author = "Annapurna";
        blog.name = "automation";
        Blog blog2 = new Blog();
        blog.author = "vivek";
        blog.name = "HR";

        blogs.add(blog);
        blogs.add(blog2);


        return blogs;
    }

    public Blog postBlog(String name, String author) {
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name;
        blogs.add(blog);
        return blog;


    }
}