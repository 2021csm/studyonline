package com.example.demo.service;

import com.example.demo.bean.Lab;
import com.example.demo.mapper.LabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabService {

    @Autowired
    private LabMapper LabMapper;
    public List<Lab> labList(){
        return LabMapper.findList();
    }
}
