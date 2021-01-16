package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User findUserByName(String name);
    public void addUser(User user);
}
