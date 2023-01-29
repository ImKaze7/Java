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
public class Ejer06 {
    public static void main(String[] args) {
        //Variables
        double nota1,nota2,nota3,nota4,promedio;
        Scanner scaner = new Scanner (System.in);
        
        //Enunciante
        System.out.println("Ingrese la primera nota: ");
        nota1 = scaner.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = scaner.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = scaner.nextFloat();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = scaner.nextFloat();
        
        //Cálculo
        promedio=(nota1*0.04)+(nota2*0.12)+(nota3*0.24)+(nota4*0.60);
        
        //Saliente
        System.out.println("El promedio ponderado es: "+ promedio);
        scaner.close();
    }
}
