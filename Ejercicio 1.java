/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;

/**
 *
 * @author User
 */
public class Circulo {
    
    private double radio = 12.5;
    private String color = "azul";

    public Circulo() {}
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}

/*
 * Ejercicio 2:
 * No se puede ejecutar la clase Circulo porque le falta el metodo "main()"// 
 */
