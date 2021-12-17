package org.acme;

import java.util.List;


public interface BlogService {
    List<Blog> GetBlogs();

    Blog findByid(long id,Blog blog);

    Blog PostBlog(Blog blog);

    Blog UpdateBlog(long id, Blog blog);

    String DeleteBlog(long id);


}

