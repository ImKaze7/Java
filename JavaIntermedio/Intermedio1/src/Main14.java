public class Main14 {
    public static void main(String[] args) {

        Hilo1_14 hilo1 = new Hilo1_14();
        Hilo2_14 hilo2 = new Hilo2_14();
        Hilo3_14 hilo3 = new Hilo3_14();
        Hilo4_14 hilo4 = new Hilo4_14();

        hilo1.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 1" + e);
        }
        hilo2.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 2" + e);
        }

        hilo3.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 3" + e);
        }
        hilo4.start();
        try{
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo 4" + e);
        }
    }
}
