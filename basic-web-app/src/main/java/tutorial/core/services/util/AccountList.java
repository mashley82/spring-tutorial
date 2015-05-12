package tutorial.core.services.util;

import tutorial.core.models.entities.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Micheal.Ashley on 5/12/2015.
 */
public class AccountList {
    private List<Account> accounts = new ArrayList<Account>();

    public AccountList(List<Account> list)
    {
        this.accounts = list;
    }

    public List<Account> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
