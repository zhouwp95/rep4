package zwp.service;

import org.springframework.stereotype.Service;
import zwp.domain.Account;

import java.util.List;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 1:07
 * @Version 1.0
 */
public interface IAccountService {

    public void saveAccount(Account account);

    public List<Account> findAll();

}
