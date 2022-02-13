package patika.demo.controller;

import org.springframework.web.bind.annotation.*;
import patika.demo.bean.User;
import patika.demo.service.CreditService;
import patika.demo.service.UserService;

import java.util.List;

@RestController
public class UserController {
    UserService userService = new UserService();
    CreditService creditService = new CreditService();

    @RequestMapping(value = "/user", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<User> getUser(){
        List<User> userList = userService.getAllUsers();
        return userList;
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public User getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, headers = "Accept=application/json")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, headers = "Accept=application/json")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @RequestMapping(value = "/user/{id}" ,method = RequestMethod.DELETE,headers = "Accept=application/json")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }


}
