package tutorial.core.repositories;

import tutorial.core.models.entities.Account;
import tutorial.core.models.entities.Blog;
import tutorial.core.services.util.AccountList;
import java.util.List;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
public interface AccountRepo {
    public List<Account> findAllAccounts();
    public Account findAccount(Long id);
    public Account findAccountByName(String name);
    public Account createAccount(Account data);
}
