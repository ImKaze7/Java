import java.util.Scanner;

public class Main1 {

    public static void main(String  [] args) {
    
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Dame el primer valor: ");
        int valorUno = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();

        Suma1 valores = new Suma1 (valorUno, valorDos);
        valores.Imprimir();

        entrada.close();
        
    }
}