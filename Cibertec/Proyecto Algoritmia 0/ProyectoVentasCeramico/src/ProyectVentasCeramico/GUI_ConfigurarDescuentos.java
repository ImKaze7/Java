package ProyectVentasCeramico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_ConfigurarDescuentos extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	private JButton btnAceptar;
	private JButton btnCerrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_ConfigurarDescuentos dialog = new GUI_ConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_ConfigurarDescuentos() {
		initialize();
		CrearPorcentajes();
	}
	
	private void initialize() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 417, 153);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("1 a 5 unidades");
			lblNewLabel.setBounds(10, 11, 90, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txt1 = new JTextField();
			txt1.setBounds(133, 8, 86, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("6 a 10 unidades");
			lblNewLabel_1.setBounds(10, 36, 113, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txt2 = new JTextField();
			txt2.setBounds(133, 33, 86, 20);
			contentPanel.add(txt2);
			txt2.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("11 a 15 unidades");
			lblNewLabel_2.setBounds(10, 61, 113, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txt3 = new JTextField();
			txt3.setBounds(133, 58, 86, 20);
			contentPanel.add(txt3);
			txt3.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Más de 15 unidades");
			lblNewLabel_3.setBounds(10, 86, 113, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txt4 = new JTextField();
			txt4.setBounds(133, 83, 86, 20);
			contentPanel.add(txt4);
			txt4.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("%");
			lblNewLabel_4.setBounds(229, 11, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(229, 36, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(229, 61, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(229, 86, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(302, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(302, 32, 89, 23);
			contentPanel.add(btnCerrar);
		}
	}
	void CrearPorcentajes() {
		txt1.setText(Double.toString(porcentaje1));
		txt2.setText(Double.toString(porcentaje2));
		txt3.setText(Double.toString(porcentaje3));
		txt4.setText(Double.toString(porcentaje4));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		porcentaje1 = Double.parseDouble(txt1.getText());
		porcentaje2 = Double.parseDouble(txt2.getText());
		porcentaje3 = Double.parseDouble(txt3.getText());
		porcentaje4 = Double.parseDouble(txt4.getText());

		dispose();
		
	}
	
	
	
	public static double getPorcentaje1() {
		return porcentaje1;
	}

	

	public static double getPorcentaje2() {
		return porcentaje2;
	}

	
	public static double getPorcentaje3() {
		return porcentaje3;
	}


	public static double getPorcentaje4() {
		return porcentaje4;
	}

	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
