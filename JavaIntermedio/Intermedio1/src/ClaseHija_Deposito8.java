public class ClaseHija_Deposito8 extends Main8{
    @Override
    public void Transacciones(){
        System.out.println("Cuanto deseas depositar: ");
        Deposito();

        transacciones = getSaldo(); 
        setSaldo(transacciones + deposito);
        System.out.println("------------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");

    }
}
