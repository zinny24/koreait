package com.example.employees.mappers;

import com.example.employees.dto.DeptDto;
import com.example.employees.dto.PosDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("SELECT D.kor_dept_code, D.kor_dept_name, COUNT(P.kor_dept_code) as kor_pos_cnt\n" +
            "FROM kor_dept D INNER JOIN kor_pos P ON\n" +
            "D.kor_dept_code = P.kor_dept_code\n" +
            "group by D.kor_dept_code, D.kor_dept_name")
    List<DeptDto> getCateDept();

    @Select("SELECT * FROM kor_pos WHERE kor_dept_code = #{deptCode}")
    List<PosDto> getPos(String deptCode);
}
