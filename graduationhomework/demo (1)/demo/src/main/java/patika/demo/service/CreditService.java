package patika.demo.service;

import patika.demo.bean.User;

import java.util.HashMap;

import static patika.demo.service.UserService.getUserMap;

public class CreditService {
    private static HashMap<Integer, User> userMap = getUserMap();
}
