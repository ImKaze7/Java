import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
    
    JRadioButton pizzaButton;
    JRadioButton hamburguesaButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburguesaIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("pizza.png");
        hamburguesaIcon = new ImageIcon("hamburguesa.png");
        hotdogIcon = new ImageIcon("hotdog.png");


        pizzaButton = new JRadioButton("pizza");
        hamburguesaButton = new JRadioButton("hamburguesa");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburguesaButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburguesaButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburguesaButton.setIcon(hamburguesaIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add (pizzaButton);
        this.add (hamburguesaButton);
        this.add (hotdogButton);
        this.pack();
        this.setVisible(true);
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");

    }
    else if(e.getSource()==hamburguesaButton) {
            System.out.println("You ordered hamburguesa!");

 }
    else if(e.getSource()==hotdogButton) {
            System.out.println("You ordered hotdog!");
}
}
}