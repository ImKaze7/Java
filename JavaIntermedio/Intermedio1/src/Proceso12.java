public class Proceso12 extends Thread{
    
    int num_int;

    public Proceso12(String NombreHilo){
        super(NombreHilo);

    }

    @Override
    public void run(){
        for(int i =0; i<= num_int; i++){
            System.out.println(i + this.getName());

        }
        System.out.println("");

    }
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;

    }
}
