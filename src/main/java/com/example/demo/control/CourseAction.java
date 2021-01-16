package com.example.demo.control;

import com.example.demo.bean.Course;
import com.example.demo.service.CourseService;
import com.example.demo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CourseAction {
    @Autowired
    private CourseService courseService;
    @GetMapping("/loadCourse")
    public String loadCourses(Model model, HttpServletRequest request){
        int page= Integer.parseInt(request.getParameter("page"));
        String subject= (String)request.getParameter("subject");
        Pager<Course> pager=courseService.findByPager(subject,page,6);
        model.addAttribute("pager",pager);
        return "show";
    }
}
