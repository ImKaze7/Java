import javax.swing.*;
import java.awt.event.*;

public class Ejer25 extends JFrame implements ActionListener{

    private JTextField textfield;
    private JLabel label1;
    private JButton boton1;
    
    public Ejer25() {
        setLayout(null);
        label1 = new JLabel ("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);

        textfield = new JTextField();
        textfield.setBounds(120,17,150,20);
        add(textfield);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String texto  = textfield.getText();
            setTitle(texto);
        }
}

    public static void main(String[] args) {
        Ejer25 ejer_25 = new Ejer25();
        ejer_25.setBounds(0,0,300,150);
        ejer_25.setVisible(true);
        ejer_25.setResizable(false);
        ejer_25.setLocationRelativeTo(null);
    }
}
