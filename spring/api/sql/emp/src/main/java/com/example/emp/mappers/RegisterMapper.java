package com.example.emp.mappers;


import com.example.emp.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegisterMapper {

    @Insert(" INSERT INTO emp_tb VALUES( NULL, #{selDept}, #{email}, #{passwd}, now() )  ")
    void saveEmp(RegisterDto registerDto);

    @Select("SELECT * FROM emp_tb ORDER BY id DESC")
    List<RegisterDto> getEmpAll();

    @Select(" SELECT COUNT(id) as total FROM emp_tb ")
    int getEmpCout();

    @Select("SELECT * FROM emp_tb WHERE email=#{email} AND passwd = #{passwd}")
    RegisterDto getLoginDo(RegisterDto registerDto);

}








