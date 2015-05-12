package tutorial.core.services;

import tutorial.core.models.entities.Blog;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.util.BlogList;

import java.util.List;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public interface BlogService {

    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

    public BlogList findAllBlogs();

    public BlogEntryList findAllBlogEntries(Long blogId);

    public Blog findBlog(Long id);
}
