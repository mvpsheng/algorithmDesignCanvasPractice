package com.gxs.algorithmdesigncanvas.service.impl;

import com.gxs.algorithmdesigncanvas.entity.User;
import com.gxs.algorithmdesigncanvas.mapper.UserMapper;
import com.gxs.algorithmdesigncanvas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName: UserServiceImpl
 * author: gxs
 * Date: 2022/8/26  21:32
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        User loginUser = userMapper.getOneByName(user.getUserName());
        if (loginUser == null) {
            return null;
        }
        if (user.getPassword().equals(loginUser.getPassword())) {
            return loginUser;
        }
        return null;
    }
}
