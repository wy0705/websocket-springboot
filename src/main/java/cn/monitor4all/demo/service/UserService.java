package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.User;

public interface UserService {
    int deleteUser(int uid);
    int insertUser(User user);
    User selectByuid(int uid);
    User findUserByNameAndPassword(String username,String userid);
    boolean register(String name);
}
