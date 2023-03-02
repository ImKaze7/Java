import java.util.Scanner;

public class Lavadora3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuántos kilos de ropa?");
        int kilos = entrada.nextInt();

        Main3 mensajero = new Main3(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();

        entrada.close();
    }
}