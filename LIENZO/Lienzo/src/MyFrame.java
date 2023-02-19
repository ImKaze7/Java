import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    
    JButton buttoncerrar;
    JButton button3;

    MyFrame() {
    
    JLabel label = new JLabel();
    label.setBounds(0,0,43,38);
    label.setFont(new Font("Comic Sans",Font.BOLD,25));
    label.setText("  X");
    label.setForeground(Color.white);

    JTextArea textArea = new JTextArea();
    textArea.setBounds(30,230,340,120);

    
    JTextField titulofield = new JTextField();
    titulofield.setBounds(40,0,700,40);
    titulofield.setText("TÍTULO");
    titulofield.setBackground(Color.gray);
            
    JTextField textfield = new JTextField();
    textfield.setBounds(50,59,150,30);
    JTextField textfield2 = new JTextField();
    textfield2.setBounds(50,119,150,30);
    JTextField textfield3 = new JTextField();
    textfield3.setBounds(50,179,150,30);
    

    buttoncerrar = new JButton();
    buttoncerrar.setBounds(0,0,43,38);
    
    buttoncerrar.setBackground(Color.red);
   

    JButton button = new JButton();
    button.setBounds(240,50,100,50);
    button.setText("Boton 1");
    
    //button.setVerticalTextPosition(JButton.CENTER);
    //button.setHorizontalTextPosition(JButton.RIGHT);
    JButton button2 = new JButton();
    button2.setBounds(240,110,100,50);
    button2.setText("Boton 2");

    button3 = new JButton();
    button3.setBounds(240,170,100,50);
    button3.setText("Boton 3");
    

    

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setTitle("Diseño");
    this.setSize(400,400);
    this.setVisible(true);
    this.add(button);
    this.add(button2);
    this.add(button3);
    this.add(label);
    this.add(buttoncerrar);
    this.add(textfield);
    this.add(textfield2);
    this.add(textfield3);
    this.add(titulofield);
    this.add(textArea);
   

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button3) {
            System.exit(0);
        }        
    }}
