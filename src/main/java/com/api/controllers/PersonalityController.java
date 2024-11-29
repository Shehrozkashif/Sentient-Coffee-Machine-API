package com.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.api.Models.Personality;
import com.api.services.PersonalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PersonalityController {

    // dependency injection
    @Autowired
    private PersonalityService personalityService;

    @GetMapping("/personality")
    public Personality getPersonality() {
        return personalityService.getPersonality();
    }

    @PutMapping("/updatepersonality")
    public String updatePersonality(@RequestBody Personality newPersonality) {
        return personalityService.updatePersonality(newPersonality);
    }
}
