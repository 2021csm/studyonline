package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserByName(String name){
        User user=userMapper.findUserByName(name);
        return user;
    }
    public boolean loginCheck(User o1,User o2){
         if(o1.getPassword().equals(o1.getPassword())&&
            o1.getName().equals(o2.getName())&&
            o1.getEmail().equals(o2.getEmail()))
             return true;
         else
             return false;
    }

    public void  addUser(User u){
        userMapper.addUser(u);
    }

}
