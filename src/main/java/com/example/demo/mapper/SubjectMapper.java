package com.example.demo.mapper;

import com.example.demo.bean.Course;
import com.example.demo.bean.Subject;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SubjectMapper {
public Subject findSubjectById(String id);
    public List<Subject> findByPager(Map<String, Object> params);
    public List<Subject> findList(Map<String, Object> params);
    public List<Subject> findListT(Map<String, Object> params);
    @Select("select count(1) from subject")
    public Integer total();
}
