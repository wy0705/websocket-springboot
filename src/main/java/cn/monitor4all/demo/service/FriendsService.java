package cn.monitor4all.demo.service;


import cn.monitor4all.demo.entity.Friends;

import java.util.List;

public interface FriendsService {
    int deleteFriends(int fid);
    int insertFriend(Friends friends);
    List<Integer> selectFriendByIUid(int uid);
}
