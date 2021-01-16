package com.example.demo.control;

import com.example.demo.bean.Course;
import com.example.demo.bean.User;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import com.example.demo.util.Pager;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class HelloWorld {
    @Autowired
   private CourseService courseService;
    @GetMapping("/test")
    public String showWorld(Model model, HttpServletRequest request){
//         model.addAttribute("date",new Date());
//        System.out.println("suces  ");
//        model.addAttribute("msg","hello world");
//        model.addAttribute("sex","男");
//        model.addAttribute("id","12");
//        List<User> users=new ArrayList<>();
//        users.add(new User("1222","errr"));
//        users.add(new User("eeee","5555"));
//        users.add(new User("GGG","KK"));
//        model.addAttribute("users",users);
//        Map<String,User> map=new HashMap<>();
//        map.put("user1",new User("1222","errr"));
//        map.put("user2",new User("kkkk","er888"));
//        map.put("user3",new User("12pp","err222r"));
//        model.addAttribute("map",map);
//      request.setAttribute("req","req");
//      request.getSession().setAttribute("session","session");
//      request.getServletContext().setAttribute("app","app");
//        model.addAttribute("12");
//        List<User> users=new ArrayList<>();

   //courseService.test();
//        System.out.println(courseService);
//        System.out.println(courseService.getCourseMapper());
//        CourseMapper mapper= courseService.getCourseMapper();
//        mapper.findCourse("000003");
       // courseService.test();
//      int page= Integer.parseInt(request.getParameter("page"));
//        System.out.println("page:"+page);
//
//       Pager<Course> pager=courseService.findByPager(page,6);
//        model.addAttribute("pager",pager);
        return "index";
    }
}
