package com.example.employees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @GetMapping("/admin/category")
    public String getCategory() {
        return "admin/category";
    }

}
