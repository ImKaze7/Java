import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el valor de la base: ");
        int base = entrada.nextInt();

        System.out.print("Dame el valor de la altura: ");
        int altura = entrada.nextInt();

        Rectangulo2 mensajero = new Rectangulo2 (base,altura);
        mensajero.Imprimir();

        entrada.close();
    }
}
