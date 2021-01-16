package com.example.demo.service;

import com.example.demo.bean.Category;
import com.example.demo.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper CategoryMapper;
    public List<Category> labList(){
        return  CategoryMapper.findList();
    }
}
