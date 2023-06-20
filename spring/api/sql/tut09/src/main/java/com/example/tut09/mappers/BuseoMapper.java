package com.example.tut09.mappers;

import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BuseoMapper {

    @Select("SELECT * FROM kor_buseo")
    List<BuseoDto> getEmpAjax();

    @Insert("INSERT INTO kor_emp VALUES(NULL, #{dept}, #{email}, #{username}, now())")
    void saveEmp(EmpDto empDto);

    @Select("SELECT * FROM kor_emp ORDER BY id DESC")
    List<EmpDto> getEmpAll();

    @Delete("DELETE FROM kor_emp WHERE id = #{id}")
    void deleteEmp(int id);

    @Select("SELECT * FROM kor_emp WHERE id = #{id}")
    EmpDto getEmpOne(int id);

    @Update("UPDATE kor_emp SET dept=#{dept}, email=#{email}, username=#{username}, regdate=now() WHERE id = #{id}")
    void editEmp(EmpDto empDto);
}








