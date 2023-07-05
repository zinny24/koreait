package com.example.employees.controller;


import com.example.employees.dto.WebsiteDto;
import com.example.employees.mappers.WebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WebsiteController {

    String UPLOAD_LOCATION = "D:\\koreait\\Java\\spring\\employees\\src\\main\\resources\\static\\upload";

    @Autowired
    private WebsiteMapper websiteMapper;

    @GetMapping("/admin/website")
    public String getWebsite(Model model) {
        model.addAttribute("web", websiteMapper.getWebsite());
        return "admin/website";
    }

    /*@PostMapping("/admin/website")
    public String editWebsite(@ModelAttribute WebsiteDto websiteDto) {
        websiteMapper.editWebsite(websiteDto);
        return "redirect:/admin/website";
    }*/

    @PostMapping("/admin/website")
    @ResponseBody
    public Map<String, Object> fileUpload(@ModelAttribute WebsiteDto websiteDto, MultipartFile uploadFile) {
        Map<String, Object> map = new HashMap<>();

        try {
            if( uploadFile != null ) {
                websiteDto.setKorWebLogo(uploadFile.getOriginalFilename());
                Path path = Paths.get(UPLOAD_LOCATION, uploadFile.getOriginalFilename());
                Files.write(path, uploadFile.getBytes());
            }
            websiteMapper.editWebsite(websiteDto);

            map.put("msg", "success");

        }catch(Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}










