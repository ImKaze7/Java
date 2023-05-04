package ejer1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consultar_Ceramico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consultar_Ceramico dialog = new Consultar_Ceramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consultar_Ceramico() {
		setTitle("Consultar Cerámico");
		setBounds(100, 100, 433, 224);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 23, 42, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 48, 63, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
			lblNewLabel_2.setBounds(10, 73, 63, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Largo (cm)");
			lblNewLabel_3.setBounds(10, 98, 63, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Espesor (mm)");
			lblNewLabel_4.setBounds(10, 123, 76, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Contenido");
			lblNewLabel_5.setBounds(10, 148, 63, 14);
			contentPanel.add(lblNewLabel_5);
		}
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("92.56");
		textField.setBounds(97, 45, 198, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("62.0");
		textField_1.setBounds(97, 70, 198, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("62.0");
		textField_2.setBounds(97, 95, 198, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("8.0");
		textField_3.setBounds(96, 120, 199, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText("6");
		textField_4.setBounds(97, 145, 199, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(316, 19, 89, 23);
		contentPanel.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(97, 19, 198, 22);
		contentPanel.add(comboBox);
		comboBox.addItem("Cinza Plus");
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		System.exit(0);
	}
}
