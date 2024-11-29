package com.api.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CoffeeBrewingServiceImpl implements CoffeeBrewingService {

    private final Map<String, String> brewStatus = new HashMap<>();

    @Override
    public String startBrewing(String brewId, String drinkType, String size) {
        brewStatus.put(brewId, "brewing");
        return "Brewing started for: " + drinkType + " (" + size + ")";
    }

    @Override
    public String getBrewStatus(String brewId) {
        return brewStatus.getOrDefault(brewId, "Invalid brew ID");
    }
}
