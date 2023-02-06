import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;

public class App {
    public static void main(String[] args) throws Exception {
        ImageIcon image = new ImageIcon("dedo.png");
        JLabel label = new JLabel("Hi");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,75,75);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout (null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout (null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout (new BorderLayout());
        
        JFrame frame  = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
