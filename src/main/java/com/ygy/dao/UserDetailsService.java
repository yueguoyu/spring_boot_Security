package com.ygy.dao;

import com.ygy.mapper.SysroleMapper;
import com.ygy.model.Sysrole;
import com.ygy.model.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    UserDao dao;
    @Autowired
    SysroleMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Sysuser user=dao.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
        //用于添加用户权限
        Sysrole role=this.mapper.selectById1(user.getId());

            authorities.add(new SimpleGrantedAuthority(role.getName()));

        return new  User(user.getUsername(),user.getPassword(),authorities);
    }
}
