package com.practice.demo.controller;

import com.practice.demo.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/read")
public class ReadController {
    @Autowired
    ReadService readService;

    @RequestMapping("/init")
    public String itemlist(Model model){
        model.addAttribute("displayDate",readService.displayDate());
        model.addAttribute("items",readService.findAll());
        return "itemlist";
    }
}
