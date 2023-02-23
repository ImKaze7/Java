import javax.swing.*;
import java.awt.event.*;


public class Ejer30 extends JFrame implements ItemListener{
    private JComboBox combo1;
    
    public Ejer30() {
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");

        combo1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    public static void main(String[] args) {
        Ejer30 ejer_30 = new Ejer30();
        ejer_30.setBounds(0,0,200,150);
        ejer_30.setVisible(true);
        ejer_30.setResizable(false);
        ejer_30.setLocationRelativeTo(null);

    }
}   