package com.example.demo.service;

import com.example.demo.bean.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
public CourseMapper getCourseMapper(){
    return courseMapper;
}
    public void test(){
      Course c=  courseMapper.findCourse(  1);
        System.out.println(c.toString());
    }
    public Pager<Course> findByPager(String subject,int page, int size){
        Pager<Course> pager = new Pager<Course>();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        params.put("subject",subject);
        long count=courseMapper.count(params);
        long lastPage;
        if(count%size!=0){
            lastPage=count/size+1;
        }else{
            lastPage=count/size;
        }
        pager.setLastPage((int)lastPage);
        pager.setPage(page);
        System.out.println(lastPage);
        List<Course> list = courseMapper.findByPager(params);
        pager.setRows(list);
        pager.setTotal(courseMapper.count(params));
        pager.setMsg(list.get(0).getCourse_subject());
        return pager;
    }
}
