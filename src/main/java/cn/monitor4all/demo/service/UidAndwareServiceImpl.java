package cn.monitor4all.demo.service;

import cn.monitor4all.demo.dao.UidAndwareDao;
import cn.monitor4all.demo.entity.UidAndware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UidAndwareServiceImpl implements UidAndwareService {
    @Autowired
    private UidAndwareDao uidAndwareDao;


    @Override
    public int insertuidAndware(UidAndware uaw) {
        return uidAndwareDao.insertuidAndware(uaw);
    }

    @Override
    public int deleteuidAndware(int uwid) {
        return uidAndwareDao.deleteuidAndware(uwid);
    }

    @Override
    public List<Integer> selelctuidAndware(int uid) {
        return uidAndwareDao.selelctuidAndware(uid);
    }
}
