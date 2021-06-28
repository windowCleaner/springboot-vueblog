package com.ljp.vuelog.controller;


import com.ljp.vuelog.common.lang.Result;
import com.ljp.vuelog.entity.User;
import com.ljp.vuelog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-06-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public Result getUser(@PathVariable("id") Integer id) {
        Logger.getGlobal().info("/user/index");
        User user = userService.getById(id);
        return Result.success(user);
    }
}
