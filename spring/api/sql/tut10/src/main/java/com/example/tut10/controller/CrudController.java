package com.example.tut10.controller;

import com.example.tut10.dto.CrudDto;
import com.example.tut10.mappers.CrudMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/emp")
public class CrudController {

    private CrudMapper crudMapper;

    @Autowired
    public CrudController(CrudMapper crudMapper) {
        this.crudMapper = crudMapper;
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("emp", crudMapper.getEmpAll());
        return "admin/empList";
    }

    @GetMapping("/insert")
    public String getInsert1() {
        return "admin/empInsert";
    }

    @PostMapping("/insert")
    public String saveEmp(CrudDto crudDto) {
        crudMapper.saveEmp(crudDto);
        return "redirect:/emp/list";
    }

    @GetMapping("/delete")
    @ResponseBody
    public String deleteEmp(int empId) {
        crudMapper.deleteEmp(empId);
        return "success";
    }
}








