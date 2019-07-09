package com.example.demo.mapper;

import com.example.demo.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface TestMapper {
    @Select("select * from Tickets")
    List<TestModel> testModel();
}
