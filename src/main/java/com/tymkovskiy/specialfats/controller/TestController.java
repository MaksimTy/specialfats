package com.tymkovskiy.specialfats.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/test")
    public ModelAndView hello(@RequestParam (name="name", defaultValue = "User") String name){
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
