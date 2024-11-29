package com.api.services;

import com.api.Models.UserPreferences;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserPreferencesServiceImpl implements UserPreferencesService {

    private final Map<String, UserPreferences> userPreferencesMap = new HashMap<>();

    @Override
    public String createUser(UserPreferences userPreferences) {
        if (userPreferencesMap.containsKey(userPreferences.getUserId())) {
            return "User profile already exists!";
        }
        userPreferencesMap.put(userPreferences.getUserId(), userPreferences);
        return "User profile created!";
    }

    @Override
    public UserPreferences getPreferences(String userId) {
        UserPreferences preferences = userPreferencesMap.get(userId);
        if (preferences == null) {
            throw new IllegalArgumentException("User not found: " + userId);
        }
        return preferences;
    }

    @Override
    public String updatePreferences(String userId, UserPreferences preferences) {
        if (!userPreferencesMap.containsKey(userId)) {
            return "User not found!";
        }
        userPreferencesMap.put(userId, preferences);
        return "Preferences updated!";
    }
}
