package patika.demo.service;

import patika.demo.bean.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {
    private static HashMap<Integer, User> userMap = getUserMap();

    public UserService() {
        super();
        if (userMap == null) {
        }
    }

    public static int getMaximumId() {
        int max = 0;
        for (int id : userMap.keySet()) {
            if (max <= id) {
                max = id;
            }
        }
        return max;
    }

    public static HashMap<Integer, User> getUserMap() {
        return userMap;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>(userMap.values());
        return users;
    }

    public User getUser(int id) {
        User user = userMap.get(id);
        return user;
    }

    public User addUser(User user) {
        user.setId(getMaximumId() + 1);
        userMap.put(user.getId(), user);
        return user;
    }

    public User updateUser(User user) {
        if (user.getId() <= 0)
            return null;
        userMap.put(user.getId(), user);
        return user;
    }

    public void deleteUser(int id) {
        userMap.remove(id);
    }
}

