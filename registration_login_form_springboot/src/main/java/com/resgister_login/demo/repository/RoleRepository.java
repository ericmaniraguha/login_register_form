package com.resgister_login.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.resgister_login.demo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}