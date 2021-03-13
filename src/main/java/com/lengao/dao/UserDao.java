package com.lengao.dao;

import com.lengao.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserDao {
    User login(Map<String, String> adminMap);
}
