/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configmanager;

/**
 *
 * @author Dominic
 */
public class ConfigManager {

    private static ConfigManager instance;

    private double volume = 1.0;
    private String language = "ES";
    private int difficulty = 1;
    
    
    private ConfigManager(){}
    
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    
    
    
    public void printConfig() {
        System.out.println("=== Configuración del Sistema ===");
        System.out.println("Volumen: " + volume);
        System.out.println("Idioma: " + language);
        System.out.println("Dificultad: " + difficulty);
        System.out.println("=================================");
    }
    
    

}
