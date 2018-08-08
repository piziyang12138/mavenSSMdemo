package com.neusoft.service;

import com.neusoft.bean.UserInfo;

public interface IUserService {
    int addUser(UserInfo user);
    int isUserExist(UserInfo user);
    int updateUserById(UserInfo user);
    UserInfo queryUserById(int id);
}
