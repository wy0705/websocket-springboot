package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.UserData;

public interface DataService {
    int deletedata(int did);
    int insertdata(UserData data);
    UserData selectBydid(int did);
    boolean updatedataz(UserData data);
}
