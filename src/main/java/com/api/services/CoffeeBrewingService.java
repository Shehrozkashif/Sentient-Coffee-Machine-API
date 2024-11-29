package com.api.services;

public interface CoffeeBrewingService {
    String startBrewing(String brewId, String drinkType, String size);
    String getBrewStatus(String brewId);
}
