package com.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.Models.Personality;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PersonalityController {

    // Class-level field for Personality object
    private Personality personality = new Personality();
    

    @GetMapping("personality")
    public Personality getPersonality() {
        personality.setMood("good");
        return personality;
    }

    @PutMapping
    public String updatePersonality(@RequestBody Personality newPersonality) {
        personality = newPersonality;
       
        return "Personality updated successfully!";
    }
}
