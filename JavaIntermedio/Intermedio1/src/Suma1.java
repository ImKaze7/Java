public class Suma1 {

    private int vUno, vDos, Resultado;

    public Suma1(int valorUno, int valorDos)   { 
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    public void Operacion(){
        Resultado = vUno + vDos;

    }

    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: " + Resultado);
    }
} 
