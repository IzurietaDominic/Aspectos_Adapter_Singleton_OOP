/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.Categorias;

import com.mycompany.adapter.Motor;

/**
 *
 * @author Dominic
 */
public class Nascar {

    String modelo;
    Motor motor;
    private double pesoExtra = 1000;

    public Nascar(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public double tiempoVuelta(Motor motor) {
        double aceleracion = (motor.getCaballosF() / motor.getPeso());
        double tiempoVuelta = (pesoExtra / aceleracion) + (motor.getPeso() / motor.getCaballosF());
        if (tiempoVuelta < 0) {
            tiempoVuelta = 0;
        }
        System.out.println("El Nascar " + modelo + " tiene un tiempo aproximado de giro de:" + tiempoVuelta + " segundos");
        return aceleracion;
    }

    public double getPesoExtra() {
        return pesoExtra;
    }

}
