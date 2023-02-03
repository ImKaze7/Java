import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Mi primer programa en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //(JFrame.DO.NOTHING_ON_CLOSE) PARA NO CERRAR LA VENTANA
        frame.setResizable(false);  //PARA NO CAMBIAR EL TAMAÑO DE LA VENTANA(false) ?= (true)
        frame.setSize (420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("image.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(07,00,28));

    
    }
}
