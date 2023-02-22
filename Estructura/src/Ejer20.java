import javax.swing.*;

public class Ejer20 extends JFrame{
    private JLabel label1;

    public Ejer20(){

    
    setLayout(null);
    label1 = new JLabel("Interfaces Gráficas");
    label1.setBounds(10,20,200,300);
    add(label1);
    
    }
        public static void main(String args[]){
            Ejer20 ejer_20 = new Ejer20();
            ejer_20.setBounds(0,0,400,300);
            ejer_20.setVisible(true);
            ejer_20.setLocationRelativeTo(null);
        }
}
