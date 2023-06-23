package com.example.emp.mappers;

import com.example.emp.dto.DeptDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Insert("INSERT INTO dept_tb VALUES( #{buseoCode}, #{buseoName})" )
    void saveDept(DeptDto deptDto);

    @Select("SELECT * FROM dept_tb ORDER BY buseo_code ASC")
    List<DeptDto> getDeptAll();

    @Select("SELECT COUNT(buseo_code) FROM dept_tb WHERE buseo_code = #{buseoCode}")
    int getBuseoCodeCheck(String buseoCode);

    @Delete(" DELETE FROM dept_tb WHERE buseo_code = #{buseoCode} ")
    void deleteDept(String buseoCode);
}











