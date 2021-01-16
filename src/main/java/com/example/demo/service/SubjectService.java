package com.example.demo.service;

import com.example.demo.bean.Course;
import com.example.demo.bean.Subject;
import com.example.demo.mapper.SubjectMapper;
import com.example.demo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;
    public Subject findByID(String id){
       Subject subject= subjectMapper.findSubjectById(id);
       return subject;
    }

   public int  total(){
       return  subjectMapper.total();
   };

    public Pager<Subject> findByPager(String subject, int page, int size) {
        Pager<Subject> subjectPager=new Pager<>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        params.put("subject",subject);
        List<Subject> list=   subjectMapper.findByPager(params);
        subjectPager.setRows(list);
        subjectPager.setSize(list.size());
        return subjectPager;
    }
    public Pager<Subject> findByPager(String name,String value, int page, int size) {
        Pager<Subject> subjectPager=new Pager<>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        params.put("name",name);
        params.put("value",value);
        List<Subject> list=   subjectMapper.findList(params);
        subjectPager.setRows(list);
        subjectPager.setSize(list.size());
        return subjectPager;
    }
    public Pager<Subject> findByPager(String name1,String value1,String name2,String value2, int page, int size) {
        Pager<Subject> subjectPager=new Pager<>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        params.put("name1",name1);
        params.put("value1",value1);
        params.put("name2",name2);
        params.put("value2",value2);
        List<Subject> list=   subjectMapper.findListT(params);
        subjectPager.setRows(list);
        subjectPager.setSize(list.size());
        return subjectPager;
    }
}
