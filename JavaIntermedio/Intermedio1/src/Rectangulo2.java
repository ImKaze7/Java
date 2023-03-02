public class Rectangulo2 {
    
    private int base, altura, area;

    public Rectangulo2(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void CalculoArea(){
        area = base * altura;
    }

    public void Imprimir(){
        CalculoArea();
        System.out.print("El area es" + area) ;
    }
}
