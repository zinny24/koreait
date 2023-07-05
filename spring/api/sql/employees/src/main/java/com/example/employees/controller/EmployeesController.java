package com.example.employees.controller;


import com.example.employees.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeesController {

    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeesController(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/admin/employees")
    public String getEmpList(Model model) {
        model.addAttribute("emp", employeeMapper.getEmpList());
        return "admin/employees";
    }

}
