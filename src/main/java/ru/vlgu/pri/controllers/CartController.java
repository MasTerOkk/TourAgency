package ru.vlgu.pri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.vlgu.pri.entities.Tour;
import ru.vlgu.pri.services.CartService;
import ru.vlgu.pri.services.TourService;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final TourService tourService;
    private final CartService cartService;

    @Autowired
    public CartController(TourService tourService, CartService cartService) {
        this.tourService = tourService;
        this.cartService = cartService;
    }

    @GetMapping("")
    public String hello() {
        System.out.println("Bye");
        return "/cart/cart";
    }

    @GetMapping("/addToCart/{tourid}")
    public String addToCart(@PathVariable("tourid") Long tourId, Model model) {
        System.out.println("tourid is " + tourId);
        Tour tour = tourService.findById(tourId);
        System.out.println("helloooo!");
        return "redirect:/";
    }


}
