package com.practice.demo.controller;

import com.practice.demo.form.ItemCreateForm;
import com.practice.demo.form.ItemUpdateForm;
import com.practice.demo.service.DeleteService;
import com.practice.demo.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/update")
public class UpdateController {
    @Autowired
    DeleteService deleteService;
    @Autowired
    UpdateService updateService;

    @RequestMapping("/init")
    public String init(@RequestParam int id, Model model) {
        model.addAttribute("itemUpdateForm", deleteService.init(id));
        return "itemUpdateForm";
    }

    @RequestMapping("/do")
    public String update(@ModelAttribute @Validated ItemUpdateForm itemUpdateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "itemUpdateForm";
        } else {
            updateService.update(itemUpdateForm);
            return "redirect:/read/init";
        }
    }
}
