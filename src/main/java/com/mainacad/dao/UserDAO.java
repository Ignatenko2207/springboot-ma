package com.mainacad.dao;

import com.mainacad.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer> {

    List<User> findAllByLoginAndAndPassword(String login, String password);

    @Query(nativeQuery = true, value = "SELECT * FROM users WHERE email=:email")
    List<User> findAllBySQLQuery(String email);

}
