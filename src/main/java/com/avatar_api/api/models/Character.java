package com.avatar_api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "nation_id")
    private Integer nationId;

    @Column(name = "date_of_birth")
    private String dateOfBirth;
    
    @Column(name = "date_of_death")
    private String dateOfDeath;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "height")
    private Double height;
    
    @Column(name = "hair_color")
    private String hairColor;
    
    @Column(name = "eye_color")
    private String eyeColor;

    // Constructors
    public Character() {}

    public Character(String name,  
    		         Integer nationId, 
    		         String dateOfBirth,
    		         String dateOfDeath,
    		         String gender,
    		         Double height,
    		         String hairColor,
    		         String eyeColor) {
        this.name = name;
        this.nationId = nationId;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.height = height;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getDateOfDeath() {
    	return dateOfDeath;
    }
    
    public void setDateOfDeath(String dateOfDeath) {
    	this.dateOfDeath = dateOfDeath;
    }
    
    public String getGender() {
    	return gender;
    }
    
    public void setGender(String gender) {
    	this.gender = gender;
    }
    
    public Double getHeight() {
    	return height;
    }
    
    public void setHeight(Double height) {
    	this.height = height;
    }
    
    public String getHairColor() {
    	return hairColor;
    }
    
    public void setHairColor(String hairColor) {
    	this.hairColor = hairColor;
    }
    
    public String getEyeColor() {
    	return eyeColor;
    }
    
    public void setEyeColor(String eyeColor) {
    	this.eyeColor = eyeColor;
    }
}
