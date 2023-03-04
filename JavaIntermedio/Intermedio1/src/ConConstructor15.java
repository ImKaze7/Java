import java.util.*;

public class ConConstructor15 {
    public ConConstructor15(){
        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.print("¿Cuál es tu nombre?: ");
        nombre = entrada.nextLine();
        System.out.print("Tu nombre es: " + nombre);

        entrada.close();
    }
}
