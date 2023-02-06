import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) throws Exception {
        ImageIcon image = new ImageIcon("imagen02.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        JLabel label = new JLabel("Hello");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground (new Color(255, 0, 0));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));;
        label.setIconTextGap(-25);
        label.setBackground (Color.black);
        label.setOpaque (true);
        label.setBorder (border);
        label.setVerticalAlignment(JLabel.CENTER);     
        label.setHorizontalAlignment(JLabel.CENTER);  
       // label.setBounds(100,100,350,350);
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
