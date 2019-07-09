package com.example.demo.controller;

import com.example.demo.model.TestModel;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pi")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService){ this.testService = testService; }




    @RequestMapping(value = "/test")
    @ResponseBody
    public List<TestModel> test(){ return testService.findTable(); }

}
