package zwp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zwp.dao.IAccountDao;
import zwp.domain.Account;
import zwp.service.IAccountService;

import java.util.List;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 1:08
 * @Version 1.0
 */
@Service
public class IAccountServiceImpl implements IAccountService{

    @Autowired
    IAccountDao iAccountDao;

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public List<Account> findAll() {
        return iAccountDao.findAll();
    }
}
