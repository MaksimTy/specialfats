package com.tymkovskiy.specialfats.controller.techcontroller.products;

import com.tymkovskiy.specialfats.service.techservice.products.ProductRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductRecipeController {

    @Autowired
    private ProductRecipeService service;

    @GetMapping(value = "/productRecipesList")
    public ModelAndView getProductRecipes(){
        ModelAndView modelAndView = new ModelAndView("productRecipesList");
        modelAndView.addObject("productRecipesList", service.findAll());
        return modelAndView;
    }
}
