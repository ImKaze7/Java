import javax.swing.*;
import java.awt.event.*;

public class Ejer28 extends JFrame implements ActionListener{

    private JTextField textfield;
    private JScrollPane scrollpane;
    private JTextArea textarea;
    private JButton boton;
    
    String text = "";

    public Ejer28() {
        setLayout(null);
        textfield = new JTextField();
        textfield.setBounds(10,10,200,30);
        add(textfield);

        boton = new JButton("Agregar");
        boton.setBounds(250,10,100,30);
        add(boton);
        boton.addActionListener(this);

        textarea = new JTextArea();
        scrollpane = new JScrollPane(textarea);
        scrollpane.setBounds(10,50,400,300);
        add(scrollpane);
    }
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == boton){
            text += textfield.getText() + "\n";
            textarea.setText(text);
            textfield.setText("");
        }
        }
        public static void main(String[] args) {
            Ejer28 ejer_28 = new Ejer28();
            ejer_28.setBounds(0,0,540,400);
            ejer_28.setVisible(true);
            ejer_28.setResizable(false);
            ejer_28.setLocationRelativeTo(null);
        }
    }


