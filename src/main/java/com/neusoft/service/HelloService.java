package com.neusoft.service;

import com.neusoft.bean.UserInfo;
import com.neusoft.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloService implements IHelloService{

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public void addUser(UserInfo user) {

    }
}
