public class Hilo1_14 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.print(i + ": G");
            try{
                Hilo1_14.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en la clase Hilo1 " + e );
            }
        }
    }
    
}
