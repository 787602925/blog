package com.kehao.blog.service;

import com.kehao.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
