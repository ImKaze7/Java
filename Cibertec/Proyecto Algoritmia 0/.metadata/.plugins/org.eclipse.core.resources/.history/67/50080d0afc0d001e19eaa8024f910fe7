package configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_ConfigurarObsequios extends JDialog {
	
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
	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_ConfigurarObsequios dialog = new GUI_ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private void initialize() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 436, 149);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tipo de obsequio");
			lblNewLabel.setBounds(10, 11, 95, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txt1 = new JTextField();
			txt1.setBounds(126, 8, 95, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("1 a 5 unidades");
			lblNewLabel_1.setBounds(10, 36, 106, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txt2 = new JTextField();
			txt2.setBounds(126, 33, 95, 20);
			contentPanel.add(txt2);
			txt2.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(319, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("6 a 10 unidades");
			lblNewLabel_2.setBounds(10, 58, 106, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("11 a más unidades");
			lblNewLabel_3.setBounds(10, 83, 106, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txt3 = new JTextField();
			txt3.setBounds(126, 55, 95, 20);
			contentPanel.add(txt3);
			txt3.setColumns(10);
		}
		{
			txt4 = new JTextField();
			txt4.setBounds(126, 80, 95, 20);
			contentPanel.add(txt4);
			txt4.setColumns(10);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(319, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}	}
	public GUI_ConfigurarObsequios() {
		initialize();
		CrearDatos();
	}
	void CrearDatos() {
	txt1.setText(tipoObsequio);
	txt2.setText(Double.toString(obsequioCantidad1));
	txt3.setText(Double.toString(obsequioCantidad2));
	txt4.setText(Double.toString(obsequioCantidad3));
	}
}
