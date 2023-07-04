package com.example.employees.mappers;

import com.example.employees.dto.WebsiteDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WebsiteMapper {
    @Select("SELECT * FROM website")
    WebsiteDto getWebsite();
}






