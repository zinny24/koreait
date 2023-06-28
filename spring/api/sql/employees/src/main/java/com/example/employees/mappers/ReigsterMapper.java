package com.example.employees.mappers;


import com.example.employees.dto.RegisterDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReigsterMapper {

    @Select("SELECT * FROM kor_dept ORDER BY kor_dept_code DESC")
    List<RegisterDto> getDept();

}
