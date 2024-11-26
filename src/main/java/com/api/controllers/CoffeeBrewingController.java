package com.api.controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/brew")
public class CoffeeBrewingController {
    private final Map<String, String> brewStatus = new HashMap<>();

    @PostMapping
    public String startBrewing(@RequestParam String brewId, @RequestParam String drinkType, @RequestParam String size) {
        brewStatus.put(brewId, "brewing");
        return "Brewing started for: " + drinkType + " (" + size + ")";
    }

    @GetMapping("/{brewId}/status")
    public String getBrewStatus(@PathVariable String brewId) {
        return brewStatus.getOrDefault(brewId, "Invalid brew ID");
    }
}
