package com.ygy.dao;

import com.ygy.model.Sysuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysuserRepository extends JpaRepository<Sysuser,Long> {
    Sysuser findByUsername(String username);
}
