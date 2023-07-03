package com.example.employees.controller;

import com.example.employees.dto.PosDto;
import com.example.employees.mappers.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryMapper categoryMapper;

    @GetMapping("/admin/category")
    public String getCategory(Model model) {
        model.addAttribute("dept", categoryMapper.getCateDept());
        return "admin/category";
    }

    @GetMapping("/admin/category/dept")
    @ResponseBody
    public List<PosDto> getDept(@RequestParam String deptCode) {
        return categoryMapper.getPos(deptCode);
    }

}
