package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName: UserController
 * author: gxs
 * Date: 2022/8/24  19:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users", userMapper.getAll());
        return "all";
    }
}
