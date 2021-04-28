package xyz.xishangqing.service;

import xyz.xishangqing.entiy.User;

import java.util.List;

public interface Userservice {
    int addUser(User user);
    List<User> findUsers();
}
