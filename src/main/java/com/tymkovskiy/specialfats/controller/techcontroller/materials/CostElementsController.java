package com.tymkovskiy.specialfats.controller.techcontroller.materials;

import com.tymkovskiy.specialfats.service.techservice.materials.CostElementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CostElementsController {

    @Autowired
    private CostElementsService service;

    @GetMapping("/costElementsList")
    public ModelAndView getMaterials(){
        ModelAndView modelAndView = new ModelAndView("costElementsList");
        modelAndView.addObject("costElements", service.findAll());
        return modelAndView;
    }


}
