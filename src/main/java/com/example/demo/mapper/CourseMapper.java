package com.example.demo.mapper;

import com.example.demo.bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CourseMapper {
    //Course findCourse(String subject,String name) ;
    public Course findCourse(Integer id) ;
    public long count(Map<String, Object> params);
    public List<Course> findByPager(Map<String, Object> params);
}
