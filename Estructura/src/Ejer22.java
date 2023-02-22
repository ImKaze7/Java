import javax.swing.*;


public class Ejer22 extends JFrame{

    private JLabel label1;
    private JLabel label2;

    public Ejer22(){
        setLayout(null);
        label1 = new JLabel("Interfaz gráfica");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2 = new JLabel("Versión 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);


    }
        public static void main(String args []){
            Ejer22 ejer_22 = new Ejer22();
            ejer_22.setBounds(0,0,300,200);
            ejer_22.setResizable(false);
            ejer_22.setVisible(true);
            ejer_22.setLocationRelativeTo(null);
        }

}   
