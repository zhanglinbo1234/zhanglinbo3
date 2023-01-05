package com.practice.demo.controller;

import com.practice.demo.form.ItemCreateForm;
import com.practice.demo.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/delete")
public class DeleteController {
    @Autowired
    DeleteService deleteService;
    @RequestMapping("/init")
    public String init(@RequestParam int id, Model model){
        model.addAttribute("item",deleteService.init(id));
        return "itemDetail";
    }

    @RequestMapping("/do")
    public String delete(@RequestParam int id){
        deleteService.delete(id);
        return "redirect:/read/init";
    }
}
