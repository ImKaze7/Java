import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        String cadena_original = "", cadena_substraccion = "";
        int num_caracteres = 0, desde = 0, hasta = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + " pose " + num_caracteres + " carateres.");

        System.out.println("¿Desde qué caractere deseas obtener la nueva cadena?: ");
        desde = in.nextInt();
        System.out.println("¿Hasta qué caracter deseas obtener la nueva cadena?: ");
        hasta = in.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadena_substraccion);
        in.close();
    }
}
