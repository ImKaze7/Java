import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //JOptionPane.showMessageDialog(null, "Esto es una información inútil", "Título", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Aquí hay más información inútil :D", "Título", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "¿En serio?", "Título", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Tu computadora tiene un VIRUS!!!", "Título", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Llame al soporte técnico ahora, o de lo contrario...", "Título", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "Hermano, ¿incluso codificas?", "Este es mi título", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        //System.out.println("Hola " + name);
        String[] responses = {"No, tú eres increíble", "Gracias", "*blush*"};
        ImageIcon icon = new ImageIcon ("Image.png");

        JOptionPane.showOptionDialog(null,
         "Tú eres increíble",
          "Mensaje Secreto",
           JOptionPane.YES_NO_CANCEL_OPTION,
           JOptionPane.INFORMATION_MESSAGE ,
             icon,
              responses,
               0);
    }
}
