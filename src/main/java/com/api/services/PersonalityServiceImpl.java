package com.api.services;

import org.springframework.stereotype.Service;
import com.api.Models.Personality;

@Service
public class PersonalityServiceImpl implements PersonalityService {

    private Personality personality = new Personality();

    @Override
    public Personality getPersonality() {
        return personality;
    }

    @Override
    public String updatePersonality(Personality newPersonality) {
        this.personality = newPersonality;
        return "Personality updated successfully!";
    }
}
