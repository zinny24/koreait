package com.example.tut10.mappers;

import com.example.tut10.dto.CrudDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CrudMapper {

    @Insert("INSERT INTO kor_sawon VALUES(NULL, #{empEmail}, #{empPasswd}, #{empName}, now())")
    void saveEmp(CrudDto crudDto);

    @Select("SELECT * FROM kor_sawon ORDER BY emp_id DESC")
    List<CrudDto> getEmpAll();

    @Delete("DELETE FROM kor_sawon WHERE emp_id = #{empId}")
    void deleteEmp(int empId);

}












