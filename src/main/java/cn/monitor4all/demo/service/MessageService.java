package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.Message;

import java.util.List;

public interface MessageService {
    int deleteMessage(int mid);
    int insertMessage(Message message);
    List<Integer> selectMessageByfid(int fid);

}
