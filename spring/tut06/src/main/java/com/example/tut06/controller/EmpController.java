package com.example.tut06.controller;


import com.example.tut06.dto.DeptDto;
import com.example.tut06.mappers.EmpMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    private EmpMappers empMappers;

    @GetMapping("/register")
    public String getRegisterHtml() {
        return "emp/register";
    }

    @GetMapping("/list")
    public String getListHtml() {
        return "admin/list";
    }

    @GetMapping("/dept")
    @ResponseBody
    public List<DeptDto> getDept() {
        return empMappers.getDept();
    }

}
