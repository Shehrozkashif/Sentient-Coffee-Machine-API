package com.api.services;

import com.api.Models.Interaction;
import java.util.List;

public interface InteractionService {
    String recordInteraction(Interaction interaction);
    List<String> getRecommendations(String userId);
}
