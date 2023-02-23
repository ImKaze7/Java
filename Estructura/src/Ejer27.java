import javax.swing.*;


public class Ejer27 extends JFrame{

    private JTextField textfield;
    private JScrollPane scrollpane;
    private JTextArea textarea;

    public Ejer27(){
        setLayout(null);
        textfield = new JTextField();
        textfield.setBounds(10,10,200,30);
        add(textfield);

        textarea = new JTextArea();
        scrollpane = new JScrollPane(textarea);
        scrollpane.setBounds(10,50,400,300);
        add(scrollpane);
    }

    public static void main(String[] args) {
        Ejer27 ejer_27 = new Ejer27();
        ejer_27.setBounds(0,0,540,400);
        ejer_27.setVisible(true);
        ejer_27.setResizable(false);
        ejer_27.setLocationRelativeTo(null);
    }
}
