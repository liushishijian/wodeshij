package xyz.xishangqing.dao;

import xyz.xishangqing.entiy.User;

import java.util.List;

public interface UserDao {
    List<User> selectUsers();
    int insertUser(User user);
}
