package com.example.tut09.mappers;

import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuseoMapper {

    @Select("SELECT * FROM kor_buseo")
    List<BuseoDto> getEmpAjax();

    @Insert("INSERT INTO kor_emp VALUES(NULL, #{dept}, #{email}, #{username}, now())")
    void saveEmp(EmpDto empDto);

    @Select("SELECT * FROM kor_emp ORDER BY id DESC")
    List<EmpDto> getEmpAll();
}








