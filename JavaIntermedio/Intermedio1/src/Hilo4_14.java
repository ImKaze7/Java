public class Hilo4_14 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("K");
            try{
                Hilo4_14.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la clase Hilo4 " + e);
            }
        }
    }
    
}
