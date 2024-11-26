package com.api.Models;

public class BrewRequest {
    private String brewId;
    private String drinkType;
    private String size;
    private String status;

  

    public String getBrewId() {
        return brewId;
    }

    public void setBrewId(String brewId) {
        this.brewId = brewId;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
