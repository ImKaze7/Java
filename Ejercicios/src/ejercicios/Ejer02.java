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
public class Ejer02 {
    public static void main(String[] args) {
        int area,lado;
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Ingrese el lado: ");
        lado=scaner.nextInt();
        
        //calculo
        area=lado*lado;
        
        System.out.println("El área del cuadrado es: "+area);
        scaner.close();
    }
}
