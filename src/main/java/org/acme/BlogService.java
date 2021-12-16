package org.acme;
import java.util.List;

public interface BlogService {
    List<Blog> getBlogs();

    Blog postBlog(Blog blog);
    Blog getBlog(Blog id);
     Blog UpdateBlog(String id ,Blog blog);
    String DeleteBlog(long id);
}

