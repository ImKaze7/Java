package ejer1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar_Ceramico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Modificar_Ceramico dialog = new Modificar_Ceramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Modificar_Ceramico() {
		setTitle("Modificar Cerámico");
		setBounds(100, 100, 457, 218);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 25, 53, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 50, 67, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
			lblNewLabel_2.setBounds(10, 75, 67, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Largo (cm)");
			lblNewLabel_3.setBounds(10, 100, 53, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Espesor (mm)");
			lblNewLabel_4.setBounds(10, 125, 67, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Contenido");
			lblNewLabel_5.setBounds(10, 150, 53, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(87, 47, 216, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(88, 72, 215, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(88, 97, 215, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(88, 147, 215, 20);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			textField_5 = new JTextField();
			textField_5.setBounds(88, 122, 215, 20);
			contentPanel.add(textField_5);
			textField_5.setColumns(10);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setEditable(true);
			comboBox.setBounds(87, 21, 216, 22);
			contentPanel.add(comboBox);
			comboBox.addItem("Cinza Plus");

		}
		{
			btnNewButton = new JButton("Cerrar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(331, 21, 89, 23);
			contentPanel.add(btnNewButton);
		}
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
