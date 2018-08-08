package com.neusoft.mapper;

import com.neusoft.bean.UserInfo;

/**
 * Created by ttc on 2018/8/2.
 */
public interface UserMapper {
    int addUser(UserInfo user);
    int isUserExist(UserInfo user);
    int updateUserById(UserInfo user);
    UserInfo queryUserById(int id);
}
