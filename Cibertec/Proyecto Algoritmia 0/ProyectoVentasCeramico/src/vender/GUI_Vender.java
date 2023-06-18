package vender;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class GUI_Vender extends JDialog implements ActionListener {

	DecimalFormat df = new DecimalFormat("0.00");
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCanti;
	private JTextArea txtS;
	private JButton btnVender;
	private JLabel lblNewLabel_2;
	private JTextField txtPrecio;
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
	private JComboBox cboMode;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_Vender dialog = new GUI_Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_Vender() {
		setTitle("Vender");
		setBounds(100, 100, 464, 320);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Modelo");
			lblNewLabel.setBounds(10, 21, 60, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Cantidad");
			lblNewLabel_1.setBounds(10, 73, 60, 17);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCanti = new JTextField();
			txtCanti.setBounds(91, 71, 171, 20);
			contentPanel.add(txtCanti);
			txtCanti.setColumns(10);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 126, 428, 144);
			contentPanel.add(txtS);
		}
		{
			btnNewButton = new JButton("Cerrar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(322, 49, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(322, 17, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			lblNewLabel_2 = new JLabel("Precio (S/)");
			lblNewLabel_2.setBounds(10, 46, 78, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(91, 42, 171, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			cboMode = new JComboBox();
			cboMode.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalía"}));
			cboMode.addActionListener(this);
			cboMode.setBounds(91, 17, 171, 22);
			contentPanel.add(cboMode);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == cboMode) {
			actionPerformedCboMode(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnNewButton_1(e);
		}
		
	}
	
	void VenderCeramico() {
		String modelo;
		int canti, mode;
		double ic,ip,des=0.0,obs=0.0,precio;
		
		mode = cboMode.getSelectedIndex();
		canti = Integer.parseInt(txtCanti.getText());
		
		
		
		switch(mode) {
		case 0:modelo="Cinza Plus";
			precio=92.56;
			ic=canti*precio;
		 if(canti >= 1 && canti <=5){	
			 des=(ic*7.5)/100;
		if(canti >=6 && canti <=10) 
			des=ic*0.10;
		if (canti >=11  && canti <=15)
			des=(ic*12.5)/100;
		else if (canti >15)
			des=canti*0.15;
		
		 }
			 ip=ic-des;
			 if(canti >=1 && canti <=5) {
					obs=2;
				if (canti >=6 && canti <=10) 
					obs=4;
				if(canti>=10)
					obs=6;
				};break;
		case 1:modelo="Luxury";
			precio=42.77;
			ic=canti*precio;
		 if(canti >= 1 && canti <=5){	
			 des=(ic*7.5)/100;
		if(canti >=6 && canti <=10) 
			des=ic*0.10;
		if (canti >=11  && canti <=15)
			des=(ic*12.5)/100;
		else if (canti >15)
			des=canti*0.15;
		
		 }
			 ip=ic-des;
				if(canti >=1 && canti <=5) 
					obs=2;
				if (canti >=6 && canti <=10) 
					obs=4;
				if (canti>=10)
					obs=6;
				;break;
		case 2:modelo="Austria";
			precio=52.45;
			ic=canti*precio;
		 if(canti >= 1 && canti <=5){	
			 des=(ic*7.5)/100;
		if(canti >=6 && canti <=10) 
			des=ic*0.10;
		if (canti >=11  && canti <=15)
			des=(ic*12.5)/100;
		else if (canti >15)
			des=canti*0.15;
		
		 }
			 ip=ic-des;
				if(canti >=1 && canti <=5) {
					obs=2;
				if (canti >=6 && canti <=10) 
					obs=4;
				if(canti>=10)
					obs=6;
				};break;
		case 3:modelo="Yungay Mix";
			precio=55.89;
			ic=canti*precio;
		 if(canti >= 1 && canti <=5){	
			 des=(ic*7.5)/100;
		if(canti >=6 && canti <=10) 
			des=ic*0.10;
		if (canti >=11  && canti <=15)
			des=(ic*12.5)/100;
		else if (canti >15)
			des=canti*0.15;
		
		 }
			 ip=ic-des;
				if(canti >=1 && canti <=5) {
					obs=2;
				if (canti >=6 && canti <=10) 
					obs=4;
				if(canti>=10)
					obs=6;
				};break;
		default:modelo="Thalía";
			precio=45; 
			ic=canti*precio;
		 if(canti >= 1 && canti <=5){	
			 des=(ic*7.5)/100;
		if(canti >=6 && canti <=10) 
			des=ic*0.10;
		if (canti >=11  && canti <=15)
			des=(ic*12.5)/100;
		else if (canti >15)
			des=canti*0.15;
		
		 }
			 ip=ic-des;
				if(canti >=1 && canti <=5) {
					obs=2;
				if (canti >=6 && canti <=10) 
					obs=4;
				if(canti>=10)
					obs=6;
				};break;
				
		}
		
		txtS.setText("BOLETA DE VENTA: "+ "\n");
		txtS.append(" " +"\n");
		txtS.append("Modelo             : " + modelo + "\n" );
		txtS.append("Precio              : " + precio+ "\n");
		txtS.append("Cantidad adquirida  : " + canti+ "\n");
		txtS.append("Importe compra      : " + df.format(ic)+ "\n");
		txtS.append("Importe descuento   : " + df.format(des) +"\n");
		txtS.append("Importe pagar       : " + df.format(ip)+ "\n");
		txtS.append("Tipo de obsequio    : " + " Lapicero"+ "\n");
		txtS.append("Unidades adquiridads: " + obs);
	}
	void txtPrecioo() {
		int mode;
		mode = cboMode.getSelectedIndex();

		switch(mode) {
		case 0: txtPrecio.setText(Double.toString(precio0));break;
		case 1: txtPrecio.setText(Double.toString(precio1));break;
		case 2: txtPrecio.setText(Double.toString(precio2));break;
		case 3: txtPrecio.setText(Double.toString(precio3));break;
		default: txtPrecio.setText(Double.toString(precio4));

		}

	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		VenderCeramico();
	}	protected void actionPerformedCboMode(ActionEvent e) {
		txtPrecioo();
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		System.exit(0);
	}
}

