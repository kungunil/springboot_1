package com.example.springboot_1.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_1.dao.UserDao;
import com.example.springboot_1.entity.User;
import com.example.springboot_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Integer findCount() {
        return userDao.selectCount();
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.selectById(id);
    }
}
