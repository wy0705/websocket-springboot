package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.UidAndware;

import java.util.List;

public interface UidAndwareService {
    int insertuidAndware(UidAndware uaw);
    public int deleteuidAndware(int uwid);
    public List<Integer> selelctuidAndware(int uid);
}

