import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String palabra = "",
        palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una frase o una palabra: ");
        palabra = entrada.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra--;


            entrada.close();
        }

        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }
}
