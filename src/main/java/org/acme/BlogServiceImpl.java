package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BlogServiceImpl implements BlogService {

    @Inject
    BloggingRepository bloggingRepository;


    public BlogServiceImpl() {

    }
//
//    @Transactional
//    public Blog getBlog(Blog id) {
//        Blog blog = new Blog();
//        List<Blog> blogs = Blog.listAll();
//        for (Blog blog1 : blogs) {
//            if (blog1.id.equals(id)) {
//                return blog;
//            }
//        }
//        return null;
//    }

    @Transactional
    public List<Blog> GetBlogs() {
        return Blog.listAll();
    }


    @Transactional
    public Blog findByid(long id,Blog blog) {
        return bloggingRepository.findByid(id,blog);
    }

    @Transactional
    public Blog UpdateBlog(long id, Blog blog) {
        return bloggingRepository.updateBlog(id, blog);
    }


    public Blog PostBlog(Blog blog) {
        return bloggingRepository.postBlog(blog);
    }

    @Transactional
    public String DeleteBlog(long id) {
        return bloggingRepository.findanddelete(id);
    }
}