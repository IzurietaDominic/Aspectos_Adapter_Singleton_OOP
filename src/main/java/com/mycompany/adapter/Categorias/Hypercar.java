/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.Categorias;

import com.mycompany.adapter.*;

/**
 *
 * @author Dominic
 */
public class Hypercar implements WEC{
    String modelo;
    Motor motor;
    private double aerodinamica = 0.8;
    
    public Hypercar( String modelo,Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }
    
    @Override
    public double competir(Motor motor) {
        double aceleracion = (motor.getCaballosF()/motor.getPeso())* aerodinamica;
        System.out.println("El Hypercar " + modelo + " tiene una aceleración de:" + aceleracion+" Km");
        return aceleracion;
    }    
    
    
}
