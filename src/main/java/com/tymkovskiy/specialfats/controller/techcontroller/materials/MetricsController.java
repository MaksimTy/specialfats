package com.tymkovskiy.specialfats.controller.techcontroller.materials;

import com.tymkovskiy.specialfats.model.tech.materials.Metrics;
import com.tymkovskiy.specialfats.service.techservice.materials.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MetricsController {

    @Autowired
    private MetricsService service;

    @GetMapping(value = "/metricsList")
    public ModelAndView getMetrics() {
        ModelAndView modelAndView = new ModelAndView("metricsList");
        modelAndView.addObject("metrics", service.findAll());
        return modelAndView;
    }

    @GetMapping(value = "/metricsAdd")
    public ModelAndView addMetrics() {
        ModelAndView modelAndView = new ModelAndView("metricsAdd");
        return modelAndView;
    }

    @PostMapping(value = "/metricsAdd")
    public ModelAndView addMetrics(@ModelAttribute("metrics") Metrics metrics) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            metrics.setId();
            service.save(metrics);
        } catch (Exception e) {
            modelAndView.setViewName("metricsAdd");
            modelAndView.addObject("metrics", metrics);
            String message = e.getMessage() ;
            modelAndView.addObject("message", message);
            return modelAndView;
        }

        modelAndView.setViewName("redirect:/metricsList");
        return modelAndView;
    }

    @GetMapping(value = "/metricsEdit/{id}")
    public ModelAndView editMetrics(@PathVariable ("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("metricsAdd");
        Metrics metrics = service.findById(id).get();
        modelAndView.addObject("metrics", metrics);
        return modelAndView;
    }

    @PostMapping(value = "/metricsEdit" )
    public ModelAndView updateMetrics(@ModelAttribute("metrics") Metrics metrics){
        ModelAndView modelAndView = new ModelAndView();
        try {
            metrics.setId();
            service.update(metrics);
        } catch (Exception e) {
            modelAndView.setViewName("metricsAdd");
            modelAndView.addObject("metrics", metrics);
            String message = e.getMessage() ;
            modelAndView.addObject("message", message);
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/metricsList");
        return modelAndView;
    }

}
