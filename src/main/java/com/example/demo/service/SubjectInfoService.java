package com.example.demo.service;

import com.example.demo.bean.Subject;
import com.example.demo.bean.SubjectInfo;
import com.example.demo.mapper.SubjectInfoMapper;
import com.example.demo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SubjectInfoService {
    @Autowired
    private SubjectInfoMapper SubjectInfoMapper;
    public Pager<SubjectInfo> findByPager(String name, String value,int page,int size) {
        Pager<SubjectInfo> subjectPager=new Pager<>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page - 1) * size);
        params.put("size", size);
        params.put("name",name);
        params.put("value",value);
        System.out.println(name+":"+value);
        List<SubjectInfo> list=   SubjectInfoMapper.findByPager(params);
        for (SubjectInfo f:list) {
            System.out.println(f.getSubject_id());
        }
        subjectPager.setRows(list);
        return subjectPager;
    }
}
