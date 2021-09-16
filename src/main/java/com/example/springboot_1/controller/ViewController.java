package com.example.springboot_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class ViewController {

    @Autowired
    DataSource dataSource;

    @GetMapping("/atguigu")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
    @RequestMapping("/druidTest")
    public String druidTest() throws SQLException {
        //获取连接
        Connection c = dataSource.getConnection();
        //通过数据库连接操作数据库 获取数据
        Statement st=c.createStatement();
        ResultSet rs=st.executeQuery("select * from t_user");
        //处理结果
        while(rs.next()){
            System.out.println("VC_LOGIN_NAME:"+rs.getInt(1)+rs.getString(2)+rs.getString(3));
        }
        //关闭资源
        rs.close();
        st.close();
        c.close();
        return "success";
    }
}
