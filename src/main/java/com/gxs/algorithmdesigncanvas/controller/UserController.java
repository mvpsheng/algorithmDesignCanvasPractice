package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.User;
import com.gxs.algorithmdesigncanvas.mapper.UserMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController
 * author: gxs
 * Date: 2022/8/24  19:27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    final
    UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users", userMapper.getAll());
        return "all";
    }

    @PostMapping("/login")
    public User login(User user) {
        User loginUser = userMapper.getOneByName(user.getUserName());
        User badUser = new User(11, "bad", "badPass");
        if (loginUser == null) {
            System.out.println("fail request");
            return badUser;
        } else if (!loginUser.getPassword().equals(user.getPassword())){
            System.out.println("password fault");
            return null;
        } else {
            System.out.println(loginUser);
            return loginUser;
        }
    }

    @PostMapping("/register")
    public User register(User user) {
        User loginUser = userMapper.getOneByName(user.getUserName());
        if (loginUser == null) {
            userMapper.insert(user);
        } else if (loginUser.getUserName().equals(user.getUserName())) {
            System.out.println("该用户名已经被注册");
            return null;
        }
            return user;
    }
}
