package com.example.employees.controller;

import com.example.employees.dto.RegisterDto;
import com.example.employees.mappers.ReigsterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegisterController {

    private ReigsterMapper reigsterMapper;

    @Autowired
    public RegisterController(ReigsterMapper reigsterMapper) {
        this.reigsterMapper = reigsterMapper;
    }

    @GetMapping("/main/register")
    public String getRegister() {
        return "main/register";
    }

    @PostMapping("/main/register")
    @ResponseBody
    public List<RegisterDto> getDept() {
        return reigsterMapper.getDept();
    }
}
