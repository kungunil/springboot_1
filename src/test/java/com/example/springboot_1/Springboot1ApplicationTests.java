package com.example.springboot_1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
@SpringBootTest
class Springboot1ApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        log.info("数据源类型:{}",dataSource.getClass());
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
    }

}
