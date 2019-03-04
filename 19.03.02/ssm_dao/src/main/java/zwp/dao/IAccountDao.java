package zwp.dao;

import org.springframework.stereotype.Repository;
import zwp.domain.Account;

import java.util.List;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 1:05
 * @Version 1.0
 */
@Repository
public interface IAccountDao {

    public void saveAccount(Account account);

    public List<Account> findAll();

}
