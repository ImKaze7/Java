public class Main11 {
    public static void main(String[] args) {

        Proceso1_11 hilo1 = new Proceso1_11();
        Proceso1_11 hilo3 = new Proceso1_11();
        Thread hilo2 = new Thread(new Proceso2_11());
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
