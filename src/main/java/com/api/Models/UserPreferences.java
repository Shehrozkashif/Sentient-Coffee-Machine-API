package com.api.Models;

public class UserPreferences {
    private String userId;
    private String preferredDrink;
    private String strength;
    private String sugar; 
    private String milk;  


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

 
    public String getPreferredDrink() {
        return preferredDrink;
    }

    public void setPreferredDrink(String preferredDrink) {
        this.preferredDrink = preferredDrink;
    }

 
    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }


    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

  
    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

  
}
