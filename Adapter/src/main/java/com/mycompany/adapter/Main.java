/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.adapter;

import com.mycompany.adapter.Categorias.*;
/**
 *
 * @author Dominic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor motorHypercar = new Motor(800, 1200);  
        Motor motorLMP2 = new Motor(850, 1000);  
        Motor motorLMGT3 = new Motor(900, 850);  
        Motor motorNascar = new Motor(950, 900);  

        Hypercar hypercar = new Hypercar("Porsche 963", motorHypercar);
        LMP2 lmp2 = new LMP2("Oreca 07", motorLMP2);
        LMGT3 lmgt3 = new LMGT3("Ferrari 296 GT3", motorLMGT3);
        Nascar nascar = new Nascar("Chevrolet Camaro ZL1", motorNascar);

        // Crear el Homologador para Nascar
        HomologadorNascar homologador = new HomologadorNascar(nascar);

        // Simular la competencia
        System.out.println("Iniciando la competencia:");

        // Competir con cada vehículo
        hypercar.competir(motorHypercar);
        lmp2.competir(motorLMP2);
        lmgt3.competir(motorLMGT3);

        // Homologar Nascar para que compita
        homologador.competir(motorNascar);
    }
}
