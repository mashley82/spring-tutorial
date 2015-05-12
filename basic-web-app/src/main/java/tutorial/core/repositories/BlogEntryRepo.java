package tutorial.core.repositories;

import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.util.BlogEntryList;

import java.util.List;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public interface BlogEntryRepo {
    public BlogEntry findBlogEntry(Long id);
    public BlogEntry deleteBlogEntry(Long id);
    public BlogEntry updateBlogEntry(Long id, BlogEntry data);
    public BlogEntry createBlogEntry(BlogEntry data);
    public List<BlogEntry> findByBlogId(Long blogId);
}
