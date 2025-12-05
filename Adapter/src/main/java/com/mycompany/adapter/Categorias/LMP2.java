/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.Categorias;

import com.mycompany.adapter.Motor;
import com.mycompany.adapter.WEC;

/**
 *
 * @author Dominic
 */
public class LMP2 implements WEC{
    String modelo;
    Motor motor;
    private double pesoExtra = 95;
    

    public LMP2(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    @Override
    public double competir(Motor motor) {
        double aceleracion = (motor.getCaballosF() / motor.getPeso()) + (pesoExtra/520);
        System.out.println("El LMP2 " + modelo + " tiene una aceleración de:" + aceleracion+" Km");
        return aceleracion;
    }
    
}
