package com.api.services;


import com.api.Models.Personality;

public interface PersonalityService {

    
    Personality getPersonality();
    
    
    String updatePersonality(Personality newPersonality);


}
