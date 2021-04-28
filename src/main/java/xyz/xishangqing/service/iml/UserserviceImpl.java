package xyz.xishangqing.service.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xishangqing.dao.UserDao;
import xyz.xishangqing.entiy.User;
import xyz.xishangqing.service.Userservice;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice {
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(User user) {
        int resul= userDao.insertUser(user);
        return resul;
    }

    @Override
    public List<User> findUsers() {
        List<User> userList = userDao.selectUsers();
        return userList;
    }
}
