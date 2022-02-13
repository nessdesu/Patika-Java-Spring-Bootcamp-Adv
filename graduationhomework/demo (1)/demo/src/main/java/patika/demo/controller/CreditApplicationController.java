package patika.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import patika.demo.bean.Credit;
import patika.demo.bean.User;
import patika.demo.service.CreditService;
import patika.demo.service.UserService;

import java.util.List;

public class CreditApplicationController {
    CreditService creditService = new CreditService();
    UserService userService = new UserService();

    @RequestMapping(value = "/creditApplication/{creditScore}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String showCreditPage() {
        return "creditApplication";
    }

}