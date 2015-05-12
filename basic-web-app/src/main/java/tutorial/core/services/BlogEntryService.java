package tutorial.core.services;

import tutorial.core.models.entities.BlogEntry;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public interface BlogEntryService {
    public BlogEntry findBlogEntry(Long id);
    public BlogEntry deleteBlogEntry(Long id);
    public BlogEntry updateBlogEntry(Long id, BlogEntry data);

}
