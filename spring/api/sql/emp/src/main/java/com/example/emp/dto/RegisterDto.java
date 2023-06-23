package com.example.emp.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterDto {
    private int id;
    private String selDept;
    private String email;
    private String passwd;
    private LocalDate regdate;
}










