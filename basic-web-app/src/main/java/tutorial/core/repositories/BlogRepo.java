package tutorial.core.repositories;

import tutorial.core.models.entities.Blog;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.services.util.BlogList;

import java.util.List;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public interface BlogRepo {
    public Blog createBlog(Blog data);

    public List<Blog> findAllBlogs();

    public Blog findBlog(Long id);

    public Blog findBlogByTitle(String title);

    public List<Blog> findBlogsByAccount(Long accountId);
}
