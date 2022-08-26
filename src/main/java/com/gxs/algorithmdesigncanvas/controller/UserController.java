package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.User;
import com.gxs.algorithmdesigncanvas.mapper.UserMapper;
import com.gxs.algorithmdesigncanvas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private UserService userService;
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users", userMapper.getAll());
        return "all";
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User loginUser = userService.login(user);
        User badUser = new User(11, "bad", "badPass");
        if (loginUser == null) {
            System.out.println("fail request");
            return badUser;
        }
        System.out.println(loginUser);
        return loginUser;
    }
}
