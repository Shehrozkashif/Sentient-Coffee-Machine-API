package com.api.controllers;


import org.springframework.web.bind.annotation.*;

import com.api.Models.Interaction;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/interaction")
public class InteractionController {
    private final List<Interaction> interactions = new ArrayList<>();

    @PostMapping
    public String recordInteraction(@RequestBody Interaction interaction) {
        interactions.add(interaction);
        return "Interaction recorded!";
    }

    @GetMapping("/recommendations")
    public List<String> getRecommendations(@RequestParam String userId) {
        // For simplicity, returning dummy recommendations
        List<String> recommendations = new ArrayList<>();
        recommendations.add("Espresso");
        recommendations.add("Latte");
        return recommendations;
    }
}
