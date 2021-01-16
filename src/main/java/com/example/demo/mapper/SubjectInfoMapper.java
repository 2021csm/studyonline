package com.example.demo.mapper;
import com.example.demo.bean.SubjectInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SubjectInfoMapper {
    public List<SubjectInfo> findByPager(Map<String, Object> params);
}
