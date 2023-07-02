package com.resgister_login.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resgister_login.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}