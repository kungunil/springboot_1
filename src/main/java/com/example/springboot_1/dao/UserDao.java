package com.example.springboot_1.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_1.entity.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserDao extends BaseMapper<User> {
    Integer selectCount();
    User selectById(Integer id);
}
