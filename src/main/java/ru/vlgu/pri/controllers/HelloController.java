package ru.vlgu.pri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vlgu.pri.services.TourService;

@Controller
public class HelloController {

    private final TourService tourService;

    @Autowired
    public HelloController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/")
    public String hello(Model model) {

//        model.addAttribute("allTours", tourService.getAll());

        return "index";
    }
}
