package com.api.controllers;

import com.api.Models.UserPreferences;
import com.api.services.UserPreferencesService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserPreferencesController {

    private final UserPreferencesService userPreferencesService;

    // @Autowired
    public UserPreferencesController(UserPreferencesService userPreferencesService) {
        this.userPreferencesService = userPreferencesService;
    }

    @PostMapping
    public String createUser(@RequestBody UserPreferences userPreferences) {
        return userPreferencesService.createUser(userPreferences);
    }

    @GetMapping("/{userId}/preferences")
    public UserPreferences getPreferences(@PathVariable String userId) {
        return userPreferencesService.getPreferences(userId);
    }

    @PutMapping("/{userId}/preferences")
    public String updatePreferences(@PathVariable String userId, @RequestBody UserPreferences preferences) {
        return userPreferencesService.updatePreferences(userId, preferences);
    }
}
