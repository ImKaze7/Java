import javax.swing.*;
import java.awt.event.*;

public class Ejer23 extends JFrame implements ActionListener{
    
    JButton boton1;
    public Ejer23(){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

        public void actionPerformed(ActionEvent e){
            if(e.getSource() == boton1){
                System.exit(0);

            }

        }
        public static void main(String[] args) {
            Ejer23 ejer_23 = new Ejer23();
            ejer_23.setBounds(0,0,450,350);
            ejer_23.setVisible(true);
            ejer_23.setResizable(true);
            ejer_23.setLocationRelativeTo(null);
        }
}
