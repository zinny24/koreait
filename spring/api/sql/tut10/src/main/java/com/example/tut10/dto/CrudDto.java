package com.example.tut10.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CrudDto {
    private int empId;
    private String empEmail;
    private String empPasswd;
    private String empName;
    private LocalDateTime empReg;
}
