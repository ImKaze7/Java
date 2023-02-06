import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    

    MyFrame(){

        this.setTitle("Mi primer programa en Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //(Jthis.DO.NOTHING_ON_CLOSE) PARA NO CERRAR LA VENTANA
        this.setResizable(false);  //PARA NO CAMBIAR EL TAMAÑO DE LA VENTANA(false) ?= (true)
        this.setSize (420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("image.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(07,00,28));
    }
}
