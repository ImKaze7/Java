import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
       Scanner scaner = new Scanner(System.in);
       System.out.println("Ingrese nombre");
       String nombre = scaner.nextLine();
       System.out.println("Ingrese edad");
       int edad = scaner.nextInt();

       System.out.println("Tu nombre es: " + nombre +  " y tu edad es: " + edad);
       scaner.close();
    }
}
