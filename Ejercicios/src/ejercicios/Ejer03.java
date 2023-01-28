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
public class Ejer03 {
    public static void main(String[] args) {
      
      double cambio=3.84,total,cantidad;
           
    Scanner scaner = new Scanner (System.in);   
        System.out.println("Ingrese su dinero: ");
        cantidad = scaner.nextFloat();//Decimal
        //Cálculo
        total = cantidad*cambio;
        System.out.println("El total en soles es: " + total);
        scaner.close();
    }    
}
