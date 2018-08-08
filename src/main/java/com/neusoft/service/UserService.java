package com.neusoft.service;

import com.neusoft.bean.UserInfo;
import com.neusoft.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(UserInfo user) {
        return userMapper.addUser(user);
    }

    @Override
    public int isUserExist(UserInfo user) {
        return userMapper.isUserExist(user);
    }

    @Override
    public int updateUserById(UserInfo user) {
        return userMapper.updateUserById(user);
    }

    @Override
    public UserInfo queryUserById(int id) {
        return userMapper.queryUserById(id);
    }
}
