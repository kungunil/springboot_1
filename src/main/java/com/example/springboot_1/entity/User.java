package com.example.springboot_1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    private Integer id;
    private String name;
    private String password;
}
