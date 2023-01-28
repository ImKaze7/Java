/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;


/**
 *
 * @author ericka
 */
public class Ejer01 {
    public static void main(String[] args) {
        double costo, precio;
        Scanner scaner = new Scanner(System.in);
        System.out.println("¿Cuál es el costo del producto?: ");
        costo = scaner.nextFloat();
        precio = costo*1.18;//18% inlcuido
        System.out.println("El precio del producto es:" + precio);
        scaner.close();       
        
    }
}
