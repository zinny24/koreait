package com.example.employees.mappers;


import com.example.employees.dto.DeptDto;
import com.example.employees.dto.PosDto;
import com.example.employees.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReigsterMapper {

    @Select("SELECT * FROM kor_dept ORDER BY kor_dept_code DESC")
    List<DeptDto> getDept();

    @Select("SELECT * FROM kor_pos WHERE kor_dept_code = #{selDeptValue}")
    List<PosDto> getPos(String selDeptValue);

    @Select("SELECT COUNT(*) FROM kor_employees WHERE kor_emp_email = #{email}")
    int emailCheck(String email);

    @Insert("INSERT INTO kor_employees VALUES" +
    "(NULL, #{korEmpEmail}, #{korEmpPasswd}, #{korEmpName}, #{korEmpGender}, #{korEmpDept}, #{korEmpPos}," +
    " 1, 'N', now(), now(), '', 0, '')")
    void saveRegister(RegisterDto registerDto);

}
