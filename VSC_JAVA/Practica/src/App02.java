import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Ingrese tiempo a trabajar: ");
        double trabajo = scaner.nextDouble();
        System.out.println("Tarifa horaria: ");
        double tarifa = scaner.nextDouble();

        //cálculo
        var sueldobruto = trabajo * tarifa;
        var bonificacion = sueldobruto * 0.20;
        var descuento = sueldobruto * 0.10;
        var sueldoneto = (sueldobruto+bonificacion) - descuento;

        System.out.println("El sueldo bruto es: S/" + sueldobruto);
        System.out.println("La bonificación es: S/" + bonificacion);
        System.out.println("El descuento es: S/" + descuento);
        System.out.println("El sueldoneto es: S/" + sueldoneto);
        System.out.println("El sueldo mensual es: S/" + sueldoneto*30);       
        
        scaner.close();
        
    }
}
