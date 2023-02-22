import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {
        int longitud = 0;
        Scanner entrada = new Scanner(System.in); 

        System.out.println("¿Cuántos números deseas ingresar?: ");
        longitud = entrada.nextInt();

        int numeros[] = new int [longitud];//Array int numero[0,1,2,3,4,5,6,7,8,9.ETC]

                for(int i = 0; i < numeros.length; i++){//length longitud
                System.out.println("Por favor, dame el valor #" + (i+1));
                 numeros[i] = entrada.nextInt();
                    }
                    for(int i = 0; i < numeros.length; i++){
                        System.out.print("[" + numeros[i] + "]");
                        entrada.close();
                    }
                }
            
        }
    

