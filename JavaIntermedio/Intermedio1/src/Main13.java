public class Main13 {
    public static void main(String[] args) {
        Hilo_Proceso13 hilo1 = new Hilo_Proceso13();
        Hilo_Proceso13 hilo2 = new Hilo_Proceso13();

        hilo1.start();

        try{

        
        hilo1.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1" + e);
        }

        hilo2.start();
        // hilo2.stop(); //muerte de un hilo
        try{

        
        hilo2.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en el hilo2" + e);

    }
}
}
