package tutorial.core.repositories.jpa;

import org.springframework.stereotype.Repository;
import tutorial.core.models.entities.Account;
import tutorial.core.models.entities.Blog;
import tutorial.core.repositories.AccountRepo;
import tutorial.core.services.util.AccountList;
import tutorial.core.services.util.BlogList;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Micheal.Ashley on 5/11/2015.
 */
@Repository
public class JpaAccountRepo implements AccountRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Account findAccount(Long id) {
        return em.find(Account.class, id);
    }

    @Override
    public Account createAccount(Account data) {
        em.persist(data);
        return data;
    }

    @Override
    public Account findAccountByName(String name) {
        Query query = em.createQuery("Select a from Account a where a.name=?1");
        query.setParameter(1, name);
        List<Account> accounts = query.getResultList();
        if(accounts.size() == 0)
            return null;
        else
        {
            return accounts.get(0);
        }
    }

    @Override
    public List<Account> findAllAccounts() {
        Query query = em.createQuery("Select a from Account a");
        return query.getResultList();
    }
}
