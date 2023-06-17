package mantenimiento;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Figura3 extends JDialog implements ActionListener {
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
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtLargo;
	private JTextField txtEspe;
	private JTextField txtConte;
	private JTextField txtAncho;
	private JComboBox cboMode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Figura3 dialog = new Figura3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Figura3() {
		setTitle("Modificar Cerámico");
		setBounds(100, 100, 443, 273);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 23, 64, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 57, 64, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
			lblNewLabel_2.setBounds(10, 89, 64, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Largo (cm)");
			lblNewLabel_3.setBounds(10, 124, 64, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Espesor (mm)");
			lblNewLabel_4.setBounds(10, 161, 75, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Contenido");
			lblNewLabel_5.setBounds(10, 199, 64, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			cboMode = new JComboBox();
			cboMode.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalía"}));
			cboMode.setBounds(95, 19, 218, 22);
			contentPanel.add(cboMode);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(94, 54, 219, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setBounds(93, 86, 218, 20);
			contentPanel.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtLargo = new JTextField();
			txtLargo.setBounds(94, 121, 218, 20);
			contentPanel.add(txtLargo);
			txtLargo.setColumns(10);
		}
		{
			txtEspe = new JTextField();
			txtEspe.setBounds(95, 158, 218, 20);
			contentPanel.add(txtEspe);
			txtEspe.setColumns(10);
		}
		{
			txtConte = new JTextField();
			txtConte.setBounds(92, 196, 221, 20);
			contentPanel.add(txtConte);
			txtConte.setColumns(10);
		}
		{
			JButton btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(323, 19, 89, 23);
			contentPanel.add(btnProcesar);
		}
	}

	public void actionPerformed(ActionEvent e) {
	int mode;
		
	mode = cboMode.getSelectedIndex();

		switch(mode) {
		case 0: txtPrecio.setText(precio0 + " soles");
				txtAncho.setText(ancho0 + "");
				txtLargo.setText(largo0 + "");
				txtEspe.setText(espesor0 + "");
				txtConte.setText(contenido0 + "");break;
		case 1:txtPrecio.setText(precio1 + " soles");
		txtAncho.setText(ancho1 + "");
		txtLargo.setText(largo1 + "");
		txtEspe.setText(espesor1 + "");
		txtConte.setText(contenido1 + "");break;
		case 2:txtPrecio.setText(precio2 + " soles");
		txtAncho.setText(ancho2 + "");
		txtLargo.setText(largo2 + "");
		txtEspe.setText(espesor2 +"");
		txtConte.setText(contenido2 + "");break;
		case 3:txtPrecio.setText(precio3+ " soles");
		txtAncho.setText(ancho3+"");
		txtLargo.setText(largo3+"");
		txtEspe.setText(espesor3+"");
		txtConte.setText(contenido3+"");break;
		case 4:txtPrecio.setText(precio4+ " soles");
		txtAncho.setText(ancho4+"");
		txtLargo.setText(largo4+"");
		txtEspe.setText(espesor4+"");
		txtConte.setText(contenido4+"");break;
		
		
	}
}}
