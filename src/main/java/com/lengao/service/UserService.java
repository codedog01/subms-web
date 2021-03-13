package com.lengao.service;

import com.lengao.domain.User;

import java.util.Map;

public interface UserService {
    User login(Map<String, String> adminMap);
}
