package com.practice.demo.controller;

import com.practice.demo.form.ItemCreateForm;
import com.practice.demo.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create")
public class CreateController {
    @Autowired
    CreateService createService;
    @RequestMapping("/init")
    public String init(@ModelAttribute ItemCreateForm itemCreateForm){
        return "itemCreateForm";
    }

    @RequestMapping("/do")
    public String create(@ModelAttribute @Validated ItemCreateForm itemCreateForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "itemCreateForm";
        }else{
            createService.create(itemCreateForm);
            return "itemCreateComplete";
        }

    }
}
