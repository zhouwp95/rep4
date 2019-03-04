import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zwp.dao.IAccountDao;
import zwp.domain.Account;

import java.util.List;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 14:27
 * @Version 1.0
 */
public class DaoTest {

    @Test
    public void testFindAll(){
        // 获取spring容器
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        //获取mapper
        IAccountDao iAccountDao = applicationContext.getBean(IAccountDao.class);
        //调用mapper方法
        List<Account> list = iAccountDao.findAll();
        for (Account account : list) {
            System.out.println(account.getName());
        }

    }

}
