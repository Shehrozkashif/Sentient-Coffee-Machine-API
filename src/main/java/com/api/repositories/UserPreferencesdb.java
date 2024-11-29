package com.api.repositories;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// generating autotables
@Data
@Entity
@Table(name = "UserPreferences")
public class UserPreferencesdb {


    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    
    private String name;
    private String preferredDrink;
    private String strength;
    private String sugar; 
    private String milk; 


    
}
