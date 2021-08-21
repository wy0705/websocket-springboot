package cn.monitor4all.demo.service;


import cn.monitor4all.demo.dao.MessageDao;
import cn.monitor4all.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public int deleteMessage(int mid) {
        return messageDao.deleteMessage(mid);
    }

    @Override
    public int insertMessage(Message message) {
        return messageDao.insertMessage(message);
    }

    @Override
    public List<Integer> selectMessageByfid(int fid) {
        return messageDao.selectMessageByfid(fid);
    }
}
