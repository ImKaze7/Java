import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);  
        frame.setLayout(new GridLayout(3,3,10,10));  

        //JPanel panel = new JPanel();
        //panel.setPreferredSize(new Dimension (250,250));
        //panel.setBackground(Color.lightGray);
        //panel.setLayout(new FlowLayout());
    
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));



        //frame.add(panel);
        frame.setVisible(true);
    }
}
