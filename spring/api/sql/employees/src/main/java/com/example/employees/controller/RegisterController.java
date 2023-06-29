package com.example.employees.controller;

import com.example.employees.dto.DeptDto;
import com.example.employees.dto.PosDto;
import com.example.employees.mappers.ReigsterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<DeptDto> getDept() {
        return reigsterMapper.getDept();
    }


    @PostMapping("/main/getPos")
    @ResponseBody
    public List<PosDto> getPos(@RequestParam String selDeptValue) {
        return reigsterMapper.getPos(selDeptValue);
    }

    @PostMapping("/main/emailCheck")
    @ResponseBody
    public int emailCheck(@RequestParam String email) {
        return reigsterMapper.emailCheck(email);
    }

}







