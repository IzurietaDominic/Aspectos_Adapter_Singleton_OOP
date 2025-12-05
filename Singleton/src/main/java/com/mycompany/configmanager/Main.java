/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.configmanager;

/**
 *
 * @author Dominic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();

        config.setDifficulty(5);
        config.setLanguage("Español");
        config.setVolume(40);

        config.printConfig();

        // Obtener nuevamente la instancia (es la misma) para mostrar que ambas referencias apuntan almismo objeto
        ConfigManager config2 = ConfigManager.getInstance();
        config2.printConfig();
        System.out.println(config == config2); // true
    }

}
