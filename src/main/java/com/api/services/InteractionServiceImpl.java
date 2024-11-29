package com.api.services;


import com.api.Models.Interaction;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class InteractionServiceImpl implements InteractionService {


    private final List<Interaction> interactions = new ArrayList<>();


    @Override
    public String recordInteraction(Interaction interaction) {
        interactions.add(interaction);
        return "Interaction recorded!";
    }


    @Override
    public List<String> getRecommendations(String userId) {
        List<String> recommendations = new ArrayList<>();
        
        recommendations.add("Espresso");
        recommendations.add("Latte");
        return recommendations;
    }
}