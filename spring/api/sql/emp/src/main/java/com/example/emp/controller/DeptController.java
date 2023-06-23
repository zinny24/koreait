package com.example.emp.controller;

import com.example.emp.dto.DeptDto;
import com.example.emp.mappers.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("/dept")
    public String getDept() {
        return "admin/dept";
    }

    @GetMapping("/getDept")
    @ResponseBody
    public List<DeptDto> getDeptAll() {
        return deptMapper.getDeptAll();
    }

    @PostMapping("/dept")
    @ResponseBody
    public Map<String, Object> saveDept(DeptDto deptDto) {
        Map<String, Object> map = new HashMap<>();

        deptMapper.saveDept(deptDto);
        map.put("msg", "success");

        return map;
    }

}









