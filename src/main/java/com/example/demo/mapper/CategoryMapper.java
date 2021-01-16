package com.example.demo.mapper;

import com.example.demo.bean.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface CategoryMapper {
    public List<Category> findList();
}
