/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/**
 *
 * @author Joaquin
 */
public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        System.out.println("Utilizando un constructor por defecto:");
        System.out.println("Radio del circulo: " + circulo1.getRadio());
        System.out.println("Area del circulo: " + circulo1.getArea());

        Circulo circulo2 = new Circulo(6.55);
        System.out.println("Utilizando un constructor sobrecargado:");
        System.out.println("Radio del circulo: " + circulo2.getRadio());
        System.out.println("Area del circulo: " + circulo2.getArea());
    }
}


