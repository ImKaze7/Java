import java.util.Scanner;

public class Ejer06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numero1 = 0, numero2 = 0, resultado = 0;
        System.out.println("¿Cuál es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor para tu suma: ");
        numero1 = in.nextInt();

        System.out.println("Dame el segundo valor para tu suma: ");
        numero2 = in.nextInt();

        resultado = numero1 + numero2;

        System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
        in.close();
    }
}
