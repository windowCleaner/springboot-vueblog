package com.ljp.vuelog.service.impl;

import com.ljp.vuelog.entity.User;
import com.ljp.vuelog.mapper.UserMapper;
import com.ljp.vuelog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-06-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
