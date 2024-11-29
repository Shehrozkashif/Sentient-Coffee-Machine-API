package com.api.controllers;

import com.api.services.CoffeeBrewingService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee-brewing")
public class CoffeeBrewingController {

    private final CoffeeBrewingService coffeeBrewingService;

    // @Autowired
    public CoffeeBrewingController(CoffeeBrewingService coffeeBrewingService) {
        this.coffeeBrewingService = coffeeBrewingService;
    }

    @PostMapping
    public String startBrewing(@RequestParam String brewId, @RequestParam String drinkType, @RequestParam String size) {
        return coffeeBrewingService.startBrewing(brewId, drinkType, size);
    }

    @GetMapping("/{brewId}")
    public String getBrewStatus(@PathVariable String brewId) {
        return coffeeBrewingService.getBrewStatus(brewId);
    }
}
