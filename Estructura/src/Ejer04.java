public class Ejer04 {
    public static void main(String[] args) {
        int matematicas = 15;
        int biologia = 18;
        int quimica = 17;
        int promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if(promedio>= 11){
            System.out.println("El alumno aprobó " + promedio);
        }
        else {
            System.out.println("El alumno reprobó " + promedio);
        }
    }
}
