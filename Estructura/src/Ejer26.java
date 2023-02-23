import javax.swing.*;


public class Ejer26 extends JFrame{

    private JTextField textfield;
    private JTextArea textarea;

    public Ejer26() {
        setLayout(null);
        textfield = new JTextField();
        textfield.setBounds(10,10,200,30);
        add(textfield);
    
        textarea = new JTextArea();
        textarea.setBounds(10,50,400,300);
        add(textarea);

    
        
    }
    public static void main(String args[]) {
        Ejer26 ejer_26 = new Ejer26();
        ejer_26.setBounds(0,0,540,400);
        ejer_26.setVisible(true);
        ejer_26.setResizable(true);
        ejer_26.setLocationRelativeTo(null);
    }
}
