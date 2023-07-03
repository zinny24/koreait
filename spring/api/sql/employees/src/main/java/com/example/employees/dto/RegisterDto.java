package com.example.employees.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterDto {
    private int korEmpId;
    private String korEmpEmail;
    private String korEmpPasswd;
    private String korEmpName;
    private String korEmpGender;
    private String korEmpDept;
    private String korEmpPos;
    private int korEmpLevel;
    private String korEmpAuth;
    private LocalDateTime korEmpCreated;
    private LocalDateTime korEmpModified;
    private String korEmpImageName;
    private Long korEmpImageSize;
    private String korEmpTransName;
}









