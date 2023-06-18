package com.example.tut09.controller;


import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import com.example.tut09.mappers.BuseoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private BuseoMapper buseoMapper;

    @GetMapping("/dept")
    @ResponseBody
    public List<BuseoDto> getDept() {
        return buseoMapper.getEmpAjax();
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String saveEmp(EmpDto empDto) {
        buseoMapper.saveEmp(empDto);
        return "redirect:/emp/empList";
    }

    @GetMapping("/empList")
    public String getList(Model model) {
        model.addAttribute("employees", buseoMapper.getEmpAll());

        return "admin/empList";
    }

}









