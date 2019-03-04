package zwp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zwp.domain.Account;
import zwp.service.IAccountService;

import java.util.List;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 14:55
 * @Version 1.0
 */
@Controller
@RequestMapping("/account")
public class accountController {

    @Autowired
    private IAccountService iAccountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){

        System.out.println(111);

        List<Account> list = iAccountService.findAll();
        Account account = list.get(1);

        model.addAttribute("account", account);

        return "account";
    }

    @RequestMapping("/findAll2")
    public void findAll2(Model model){

        System.out.println(111);
        System.out.println(111);
        System.out.println(111);

    }




}
