public class Hilo2_14 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.print("E");
            try{
                Hilo2_14.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la clase Hilo2 " + e);
            }
        }
    }
    
}
