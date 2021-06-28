package com.ljp.vuelog.service.impl;

import com.ljp.vuelog.entity.Blog;
import com.ljp.vuelog.mapper.BlogMapper;
import com.ljp.vuelog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
