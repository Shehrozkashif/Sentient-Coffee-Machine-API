package com.api.controllers;

import com.api.Models.Interaction;
import com.api.services.InteractionService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interaction")
public class InteractionController {

    private final InteractionService interactionService;

    // @Autowired
    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping("/record")
    public String recordInteraction(@RequestBody Interaction interaction) {
        return interactionService.recordInteraction(interaction);
    }

    @GetMapping("/recommendations")
    public List<String> getRecommendations(@RequestParam String userId) {
        return interactionService.getRecommendations(userId);
    }
}
