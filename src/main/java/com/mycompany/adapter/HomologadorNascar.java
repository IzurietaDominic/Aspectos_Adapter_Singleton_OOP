/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

import com.mycompany.adapter.Categorias.*;

/**
 *
 * @author Dominic
 */
public class HomologadorNascar implements WEC {

    private Nascar nascar;

    public HomologadorNascar(Nascar nascar) {
        this.nascar = nascar;
    }

    @Override
    public double competir(Motor motor) {
        System.out.println("Homologando Nascar para que pueda competir.");
        double aceleracion = nascar.tiempoVuelta(motor);
        double factorRendimiento = 1 + (nascar.getPesoExtra() / 10000);
        aceleracion *= factorRendimiento;
        System.out.println("El Nascar tiene una aceleración de:" + aceleracion+" Km");
        return aceleracion;
    }

}
