package com.lengao.service.imp;

import com.lengao.dao.UserDao;
import com.lengao.domain.User;
import com.lengao.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User login(Map<String, String> adminMap) {
        System.out.println(adminMap.get("系统管理员"));
        System.out.println("进入UserServiceImp的login方法");
        return userDao.login(adminMap);
    }
}
