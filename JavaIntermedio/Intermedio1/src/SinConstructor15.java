import java.util.*;

public class SinConstructor15 {
    private Scanner mensajero = new Scanner(System.in);
    String nombre = "";

    public void PedirNombre(){
        System.out.print("¿Cuál es tu nombre?: ");
        nombre = mensajero.nextLine();


    }
    
    public void Imprimir(){
        System.out.println("Tu nombre es: " + nombre);
    }
}
