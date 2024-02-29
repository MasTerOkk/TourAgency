package ru.vlgu.pri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.vlgu.pri.entities.Cart;
import ru.vlgu.pri.entities.Tour;
import ru.vlgu.pri.services.CartService;
import ru.vlgu.pri.services.TourService;

@Controller
public class HelloController {

    private final TourService tourService;
    private final CartService cartService;

    @Autowired
    public HelloController(TourService tourService, CartService cartService) {
        this.tourService = tourService;
        this.cartService = cartService;
    }

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("allTours", tourService.getAll());
        System.out.println("Hello");
        return "/Tour/index";
    }

    @GetMapping("/tour/create")
    public String createPage(Model model) {
        Tour tour = new Tour();
        model.addAttribute("tour", tour);
        return "/Tour/Create";
    }

    @PostMapping("/tour/createTour")
    public String newTour(@ModelAttribute("tour") Tour tourNew, Model model) {
        tourNew.setRemainingSeats(0);
        tourNew.setGoing(true);
        tourService.save(tourNew);
        model.addAttribute("Massage", "tour saved");
        return "redirect:/";
    }

}
