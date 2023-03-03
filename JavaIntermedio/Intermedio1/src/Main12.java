public class Main12 {
    public static void main(String[] args) {
        Proceso12 hilo1 = new Proceso12("Hilo 1");
        Proceso12 hilo2 = new Proceso12("Hilo 2");
        Proceso12 hilo3 = new Proceso12("Hilo 3");


        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(5);


        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
