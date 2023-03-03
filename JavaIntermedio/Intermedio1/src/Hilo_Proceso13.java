public class Hilo_Proceso13 extends Thread{

    @Override
    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println(i + " " + getName());

            try{ 
            Hilo_Proceso13.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error dentro de la sala" + e);
            }
        }
    }
}
