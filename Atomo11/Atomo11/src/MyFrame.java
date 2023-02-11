import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener   {

    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consola",Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");
        
        this.add(button);  
        this.add(textField);  
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)     {
            System.out.println("Welcome " +  textField.getText());  

            button.setEnabled(true);
            textField.setEditable(true);
            

    }
}
}

