package configuracion;

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
	private static final long serialVersionUID = 1L;
	public static String modelo0 ="Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.00;
	public static double largo0 = 62.00;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 6;
	
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	private JButton btnAceptar;
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
			txt1.setBounds(113, 8, 86, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("6 a 10 unidades");
			lblNewLabel_1.setBounds(10, 36, 90, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txt2 = new JTextField();
			txt2.setBounds(113, 33, 86, 20);
			contentPanel.add(txt2);
			txt2.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("11 a 15 unidades");
			lblNewLabel_2.setBounds(10, 61, 90, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txt3 = new JTextField();
			txt3.setBounds(113, 58, 86, 20);
			contentPanel.add(txt3);
			txt3.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Más de 15 unidades");
			lblNewLabel_3.setBounds(10, 86, 90, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txt4 = new JTextField();
			txt4.setBounds(113, 83, 86, 20);
			contentPanel.add(txt4);
			txt4.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("%");
			lblNewLabel_4.setBounds(209, 11, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(209, 36, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(209, 61, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(209, 86, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(302, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
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
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
