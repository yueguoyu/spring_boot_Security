package com.ygy.dao;

import com.ygy.model.Sysuser;

public interface UserDao {
    public Sysuser findByUserName(String username);
}
