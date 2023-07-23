package com.example.kor.mapper;


import com.example.kor.dto.RegisterDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterMapper {

    @Insert("INSERT INTO member VALUES(NULL, #{userid}, #{username}, #{passwd} , #{level} )" )
    void getRegister(RegisterDto registerDto);

    @Select("SELECT * FROM member " +
            "WHERE userid = #{userid} AND passwd = #{passwd}")
    RegisterDto checkLogin(RegisterDto registerDto);

}
