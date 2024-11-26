package com.api.controllers;

import com.api.Models.UserPreferences;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserPreferencesController {

    private final Map<String, UserPreferences> userPreferencesMap = new HashMap<>();

  
    @PostMapping
    public String createUser(@RequestBody UserPreferences userPreferences) {
        if (userPreferencesMap.containsKey(userPreferences.getUserId())) {
            return "User profile already exists!";
        }
        userPreferencesMap.put(userPreferences.getUserId(), userPreferences);
        return "User profile created!";
    }

   
    @GetMapping("/{userId}/preferences")
    public UserPreferences getPreferences(@PathVariable String userId) {
        UserPreferences preferences = userPreferencesMap.get(userId);
        if (preferences == null) {
            throw new IllegalArgumentException("User not found: " + userId);
        }
        return preferences;
    }


    @PutMapping("/{userId}/preferences")
    public String updatePreferences(@PathVariable String userId, @RequestBody UserPreferences preferences) {
        if (!userPreferencesMap.containsKey(userId)) {
            return "User not found!";
        }
        userPreferencesMap.put(userId, preferences);
        return "Preferences updated!";
    }
}
