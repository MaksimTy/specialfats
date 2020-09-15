package com.tymkovskiy.specialfats.controller.techcontroller.products;

import com.tymkovskiy.specialfats.service.techservice.products.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductLineController {

    @Autowired
    private ProductLineService service;

    @GetMapping(value = "/productLineList")
    public ModelAndView getProductLines(){
        ModelAndView modelAndView = new ModelAndView("productLineList");
        modelAndView.addObject("productLineList", service.findAll());
        return modelAndView;
    }


}
