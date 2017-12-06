package com.ygy.dao;

import com.ygy.mapper.SysuserMapper;
import com.ygy.model.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    SysuserMapper mapper;

    @Override
    public Sysuser findByUserName(String username) {
        return this.mapper.findByUserName(username);
    }
}
