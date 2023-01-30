

     public class App {
    //@autor Kaze
    public static void main(String[] args) {
        //Variable Primitiva 
        String nombre;
        int a, b, c;
        nombre = "José Fernando";
        int edad = 17;
        a = 1;
        b = 2;
        c = 3;
        System.out.println(nombre);
        System.out.println(edad);        
        
        edad=26;
        System.out.println(edad);
        System.out.println(a+b+c);
        
        //Variable dinamica Objetos
        var primernombre = "José";
        var segundonombre = "Fernando";        
        var nombrecompleto = primernombre+segundonombre;
        
        System.out.println("Mis nombres: " + nombrecompleto);
        }
}

