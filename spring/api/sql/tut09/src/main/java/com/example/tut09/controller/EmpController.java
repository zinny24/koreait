package com.example.tut09.controller;


import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import com.example.tut09.mappers.BuseoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id) {
        buseoMapper.deleteEmp(id);
        return "redirect:/emp/empList";
    }

    @GetMapping("/edit/{id}")
    public String getEditPage(@PathVariable int id, Model model) {
        EmpDto getOne = buseoMapper.getEmpOne(id);
        model.addAttribute("person", getOne);
        return "edit";
    }

    @PostMapping("/edit")
    public String editEmp(EmpDto empDto) {
        buseoMapper.editEmp(empDto);

        return "redirect:/emp/empList";
    }

    @GetMapping("/view/{id}")
    public String getEmpView(@PathVariable int id, Model model) {
        model.addAttribute("emp", buseoMapper.getEmpOne(id));
        return "view";
    }

}









