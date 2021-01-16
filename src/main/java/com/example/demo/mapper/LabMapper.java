package com.example.demo.mapper;

import com.example.demo.bean.Lab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LabMapper {
    public List<Lab> findList();
}
