package cn.monitor4all.demo.service;


import cn.monitor4all.demo.dao.FriendsDao;
import cn.monitor4all.demo.entity.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsServiceImpl implements FriendsService {
    @Autowired
    private FriendsDao friendsDao;


    @Override
    public int deleteFriends(int fid) {
        return friendsDao.deleteFriends(fid);
    }

    @Override
    public int insertFriend(Friends friends) {
        return friendsDao.insertFriend(friends);
    }

    @Override
    public List<Integer> selectFriendByIUid(int uid) {
        return friendsDao.selectFriendByUid(uid);
    }

}
