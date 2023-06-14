package com.example.tut06.mappers;

import com.example.tut06.dto.DeptDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMappers {

    @Select("SELECT * FROM kor_buseo ORDER BY kor_buseo_code DESC")
    public List<DeptDto> getDept();
}







