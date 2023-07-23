package com.example.kor.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private int id;
    private String userid;
    private String username;
    private String passwd;
    private int level;
}
