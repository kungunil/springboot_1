package com.example.springboot_1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_1.entity.User;

public interface UserService extends IService<User> {
    Integer findCount();
    User findUserById(Integer id);
}
