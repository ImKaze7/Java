import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    

    MyFrame() {
        
    


      ImageIcon icon = new ImageIcon("dedoizq.png");
      ImageIcon icon2 = new ImageIcon("cara.png");


      label = new JLabel();
      label.setIcon(icon2);
      label.setBounds(150,250,150,150);
      label.setVisible(false);

      button = new JButton();
      button.setBounds(600,300,600,600);
      button.addActionListener(e -> System.out.println("poo"));
;
      button.setText ("¡Click Me!");    
      button.setFocusable(false);
      button.setIcon (icon);
      button.setHorizontalTextPosition(JButton.CENTER);
      button.setVerticalTextPosition(JButton.BOTTOM);
      button.setFont(new Font("Comic Sans",Font.BOLD,25));
      button.setIconTextGap(-15);
      button.setForeground(Color.cyan);
      button.setBackground(Color.lightGray);
      button.setBorder(BorderFactory.createEtchedBorder());
      //button.setEnabled(false)
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600,600);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button){        
            label.setVisible(true);
        
        }

    }
  
}
