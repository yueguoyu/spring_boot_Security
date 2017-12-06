package com.ygy.dao;

import com.ygy.model.Sysrole;
import com.ygy.model.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
//    SysuserRepository repository;
    UserDao dao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       // Sysuser user=repository.findByUsername(username);
        Sysuser user=dao.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities=new ArrayList<SimpleGrantedAuthority>();
        //用于添加用户权限
        for(Sysrole sysrole:user.getRoles()){
            authorities.add(new SimpleGrantedAuthority(sysrole.getName()));
            System.out.println(sysrole.getName());
        }
        return  user;
    }
}
