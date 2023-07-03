package com.example.employees.mappers;

import com.example.employees.dto.RegisterDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("SELECT * FROM kor_employees WHERE kor_emp_email = #{korEmpEmail} " +
            "AND kor_emp_passwd = #{korEmpPasswd}")
    RegisterDto getEmpInfo(RegisterDto registerDto);

}







