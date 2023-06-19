package com.example.tut09.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmpDto {
    private int id;
    private String dept;
    private String email;
    private String username;
    private LocalDateTime regdate;
}






