package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper){ this.testMapper = testMapper; }





    public List<TestModel> findTable(){ return testMapper.testModel(); }


}
