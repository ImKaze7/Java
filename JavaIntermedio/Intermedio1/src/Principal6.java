public class Principal6 {
    public static void main(String[] args) {
        Main6 mensajero_suma = new ClaseHija_Suma6();
        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();

        Main6 mensajero_resta = new ClaseHija_Resta6();
        mensajero_resta.PedirDatos();
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
    }
}
