package com.api.services;

import com.api.Models.UserPreferences;

public interface UserPreferencesService {
    String createUser(UserPreferences userPreferences);
    UserPreferences getPreferences(String userId);
    String updatePreferences(String userId, UserPreferences preferences);
}
