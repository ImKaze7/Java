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
public class Ejer05 {
    public static void main(String[] args) {
        //Variables
        double bono,descuento=0.10,sueldoneto,sueldobruto,hora,tarifa,sueldob,bonificacion=1.20; //1.20 es el 20% ya agregado
        
        Scanner scaner = new Scanner (System.in);
        
        //Enunciante
        
        System.out.println("Ingrese hora: ");
        hora = scaner.nextFloat(); 
        System.out.println("Ingrese la tarifa: ");
        tarifa = scaner.nextFloat();
                
        //Cálculo
        sueldob=hora*tarifa;
        bono =sueldob*0.20;
        sueldobruto=sueldob*bonificacion;
        sueldoneto=sueldobruto-(sueldobruto*descuento);
        
        //Saliente
        System.out.println("Sueldo básico: " + sueldob);
        System.out.println("La bonificación del 20% es: " + bono );
        System.out.println("Sueldo bruto: " + sueldobruto);
        System.out.println("El descuento 10% es: " + sueldobruto*descuento);
        System.out.println("Total suelto neto: " + sueldoneto);
        System.out.println("Tu sueldo mensual es: " + sueldoneto*30);
        scaner.close();
    }
}
