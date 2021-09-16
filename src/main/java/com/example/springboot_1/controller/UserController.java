package com.example.springboot_1.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot_1.entity.User;
import com.example.springboot_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getCount")
   public Integer getCount(){
       return userService.findCount();
   }
    @ResponseBody
    @GetMapping("/getUser")
   public User getUser(@RequestParam("id") Integer id){
      return userService.findUserById(id);
   }

   @RequestMapping("/userList")
   public String userList(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
       Page<User> userPage = new Page<>(pn, 2);
       Page<User> page = userService.page(userPage, null);
       model.addAttribute("page",page);
       return "user";
   }
}
