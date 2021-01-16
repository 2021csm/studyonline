package com.example.demo.control;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//@RestController
@Controller
public class Login {
    @Autowired
    private UserService userService;
//    @PostMapping("/login")
//    public  String login(@RequestBody String s){
//        System.out.println(s);
//        return "{\"username\":\"2793219495@qq.com\",\"password\":\"112911\"}";
//    }

    @PostMapping("/login")
    public @ResponseBody  String userLogin(@RequestBody String s){

         Gson gson=new Gson();
         User user=gson.fromJson(s,User.class);


        User userFromDataBase=userService.getUserByName(user.getName());

        System.out.println(userFromDataBase);
        System.out.println(user);

      if(userService.loginCheck(user,userFromDataBase))
          return "{\"usernameStatus\":\"1\",\"emailStatus\":\"1\",\"passwordStatus\":\"1\"}";
      else
          return "test";

    }
    @PostMapping("/regist")
    public String userRegist(Model model,User user){


        User userFromDataBase=userService.getUserByName(user.getName());
        if(userFromDataBase!=null||user.equals(userFromDataBase))
            return "test";
        else {
            userService.addUser(user);
            return "index";
        }
    }
}
