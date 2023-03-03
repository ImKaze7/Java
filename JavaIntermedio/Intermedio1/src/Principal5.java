public class Principal5{
    public static void main(String[] args) {
        ClaseHija_Suma5 mensajeroSuma = new ClaseHija_Suma5();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        ClaseHija_Resta5 mensajeroResta = new ClaseHija_Resta5();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }   
}