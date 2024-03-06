package com.example.xyz_friend.dao;

import java.util.List;
import com.example.xyz_friend.model.Friend;
public interface FriendDao {
    void insert(Friend f);
    void update(int id, Friend f);
    void delete(int id);
    Friend getAFriend(int id);
    List<Friend> getAllFriends();
}