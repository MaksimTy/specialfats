package com.tymkovskiy.specialfats.controller.techcontroller.products;

import com.tymkovskiy.specialfats.service.techservice.products.ProductGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductGroupController {

    @Autowired
    private ProductGroupService service;

    @GetMapping(value = "/productGroupList")
    public ModelAndView getProductGroups(){
        ModelAndView modelAndView = new ModelAndView("productGroupList");
        modelAndView.addObject("productGroupList", service.findAll());
        return modelAndView;
    }
}
