package com.tymkovskiy.specialfats.controller.techcontroller.products;


import com.tymkovskiy.specialfats.service.techservice.products.ProductRecipeComposedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductRecipeComposedController {

    @Autowired
    private ProductRecipeComposedService service;

    @GetMapping(value = "/productRecipesComposedList")
    public ModelAndView getProductRecipes(){
        ModelAndView modelAndView = new ModelAndView("productRecipesComposedList");
       modelAndView.addObject("productRecipesComposedList", service.findAll());
        return modelAndView;
    }
}
