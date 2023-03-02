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
public class Ejercicio1Intermedio {
     String palabra  = "", palabraInvertida="";
     int longitudPalabra = 0;
     Scanner entrada = new Scanner(System.in);
     
     System.out.print("Escribe una frase: ");
     palabra = entrada.nextLine();
     
     longitudPalabra = palabra.length();
     
     while(longitudPalabra != 0){
    palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
    longitudPalabra--;
    }
     
     System.out.print("Palabra invertida: " + palabraInvertida);
}
