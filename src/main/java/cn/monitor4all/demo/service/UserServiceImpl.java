package cn.monitor4all.demo.service;

import cn.monitor4all.demo.dao.UserDao;
import cn.monitor4all.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int deleteUser(int uid) {
        return userDao.deleteUser(uid);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User selectByuid(int uid) {
        return userDao.selectByUid(uid);
    }

    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return userDao.findUserByNameAndPassword(username,password);
    }

    @Override
    public boolean register(String name) {
        if (userDao.selectByName(name)!=null){
            return true;
        }
        return false;
    }
}
