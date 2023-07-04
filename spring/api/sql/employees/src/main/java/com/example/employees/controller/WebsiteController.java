package com.example.employees.controller;


import com.example.employees.dto.WebsiteDto;
import com.example.employees.mappers.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebsiteController {

    @Autowired
    private WebsiteMapper websiteMapper;

    @GetMapping("/admin/website")
    public String getWebsite(Model model) {
        model.addAttribute("web", websiteMapper.getWebsite());
        return "admin/website";
    }

    @PostMapping("/admin/website")
    public String editWebsite(@ModelAttribute WebsiteDto websiteDto) {
        websiteMapper.editWebsite(websiteDto);
        return "redirect:/admin/website";
    }
}










