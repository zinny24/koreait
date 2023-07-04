package com.example.employees.mappers;

import com.example.employees.dto.WebsiteDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface WebsiteMapper {
    @Select("SELECT * FROM kor_web")
    WebsiteDto getWebsite();

    @Update("UPDATE kor_web\n" +
            "SET kor_web_logo = #{korWebLogo},\n" +
            "kor_web_title = #{korWebTitle},\n" +
            "kor_web_url = #{korWebUrl},\n" +
            "kor_web_menus = #{korWebMenus},\n" +
            "kor_web_copyright = #{korWebCopyright},\n" +
            "kor_web_term = #{korWebTerm}")
    void editWebsite(WebsiteDto websiteDto);
}






