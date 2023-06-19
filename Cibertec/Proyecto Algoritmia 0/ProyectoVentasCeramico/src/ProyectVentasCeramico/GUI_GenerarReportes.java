package ProyectVentasCeramico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GUI_GenerarReportes extends JDialog implements ActionListener {
	GUI_Vender R1 = new GUI_Vender();
	GUI_ModificarCeramico R2 = new GUI_ModificarCeramico();
	GUI_ConfigurarCantidadOptima R3 = new GUI_ConfigurarCantidadOptima();
	DecimalFormat df = new DecimalFormat("0.00");
	
	///Variables
	public static double compa; 
	public static double compa1; 
	public static double compa2; 
	public static double compa3; 
	public static double compa4;	
	String comparacion;
	String comparacion1;
	String comparacion2;
	String comparacion3;
	String comparacion4;
	
	String compara;
	String compara1;
	String compara2;
	String compara3;
	String compara4;
	



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
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;//100%
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox cboReport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_GenerarReportes dialog = new GUI_GenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_GenerarReportes() {
		setBounds(100, 100, 747, 448);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tipo de reporte");
			lblNewLabel.setBounds(10, 24, 105, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			cboReport = new JComboBox();
			cboReport.addActionListener(this);
			cboReport.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparación de precios con el precio promedio", "Comparación de cajas vendidas con la cantidad óptima", "Estadística sobre el precio"}));
			cboReport.setBounds(125, 20, 390, 22);
			contentPanel.add(cboReport);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(588, 20, 89, 23);
			contentPanel.add(btnCerrar);
		}
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 711, 335);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
	}
	//JOptionPane.showMessageDialog(null)
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboReport) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedComboBox(ActionEvent e) {		
		compa = Double.parseDouble(R2.getPrecio_0())-R1.getPromedio();
		compa1 = Double.parseDouble(R2.getPrecio_1())-R1.getPromedio();
		compa2 = Double.parseDouble(R2.getPrecio_2())-R1.getPromedio();
		compa3 = Double.parseDouble(R2.getPrecio_3())-R1.getPromedio();
		double c=Math.abs(compa = Double.parseDouble(R2.getPrecio_0())-R1.getPromedio());
		double c1=Math.abs(compa1 = Double.parseDouble(R2.getPrecio_1())-R1.getPromedio());
		double c2=Math.abs(compa2 = Double.parseDouble(R2.getPrecio_2())-R1.getPromedio());
		double c3=Math.abs(compa3 = Double.parseDouble(R2.getPrecio_3())-R1.getPromedio());
		double c4=Math.abs(compa4 = Double.parseDouble(R2.getPrecio_4())-R1.getPromedio());
		
		double cc=Math.abs(compa = R1.getCanti()-R3.getCantidadOptima());
		double cc1=Math.abs(compa1 = R1.getCanti1()-R3.getCantidadOptima());
		double cc2=Math.abs(compa2 = R1.getCanti2()-R3.getCantidadOptima());
		double cc3=Math.abs(compa3 = R1.getCanti3()-R3.getCantidadOptima());
		double cc4=Math.abs(compa4 = R1.getCanti4()-R3.getCantidadOptima());

		if(Double.parseDouble(R2.getPrecio_0()) > R1.getPromedio()) {
	comparacion = "más que el promedio";}
	else if (Double.parseDouble(R2.getPrecio_0()) < R1.getPromedio()) {
			comparacion = "menos que el promedio";
			}
		if(Double.parseDouble(R2.getPrecio_1()) > R1.getPromedio()) {
			comparacion1 = "más que el promedio";}
			else if (Double.parseDouble(R2.getPrecio_1()) < R1.getPromedio()) {
					comparacion1 = "menos que el promedio";
					}
		if(Double.parseDouble(R2.getPrecio_2()) > R1.getPromedio()) {
			comparacion2 = "más que el promedio";}
			else if (Double.parseDouble(R2.getPrecio_2()) < R1.getPromedio()) {
					comparacion2 = "menos que el promedio";
					}
		if(Double.parseDouble(R2.getPrecio_3()) > R1.getPromedio()) {
			comparacion3 = "más que el promedio";}
			else if (Double.parseDouble(R2.getPrecio_3()) < R1.getPromedio()) {
					comparacion3 = "menos que el promedio";
					}
		if(Double.parseDouble(R2.getPrecio_4()) > R1.getPromedio()) {
			comparacion4 = "más que el promedio";}
			else if (Double.parseDouble(R2.getPrecio_4()) < R1.getPromedio()) {
					comparacion4 = "menos que el promedio";
					}
		
		
		if(R1.getCanti() > R3.getCantidadOptima()) {
			compara = "más que la cantidad óptima";}
		if(R1.getCanti() < R3.getCantidadOptima()) {
			compara = "menos que el promedio";}
			else if (R1.getCanti() == R3.getCantidadOptima()) {
						compara = "igual que la cantidad óptima";}
		
		if(R1.getCanti1() > R3.getCantidadOptima()) {
			compara1 = "más que la cantidad óptima";}
		if(R1.getCanti1() < R3.getCantidadOptima()) {
			compara1 = "menos que el promedio";}
			else if (R1.getCanti1() == R3.getCantidadOptima()) {
						compara1 = "igual que la cantidad óptima";}
		
		if(R1.getCanti2() > R3.getCantidadOptima()) {
			compara2 = "más que la cantidad óptima";}
		if(R1.getCanti2() < R3.getCantidadOptima()) {
			compara2 = "menos que el promedio";}
			else if (R1.getCanti2() == R3.getCantidadOptima()) {
						compara2 = "igual que la cantidad óptima";}
		
		if(R1.getCanti3() > R3.getCantidadOptima()) {
			compara3 = "más que la cantidad óptima";}
		if(R1.getCanti3() < R3.getCantidadOptima()) {
			compara3 = "menos que el promedio";}
			else if (R1.getCanti3() == R3.getCantidadOptima()) {
						compara3 = "igual que la cantidad óptima";}
		
		if(R1.getCanti4() > R3.getCantidadOptima()) {
			compara4 = "más que la cantidad óptima";}
		if(R1.getCanti4() < R3.getCantidadOptima()) {
			compara4 = "menos que el promedio";}
			else if (R1.getCanti4() == R3.getCantidadOptima()) {
						compara4 = "igual que la cantidad óptima";}

					
		int report;
		report = cboReport.getSelectedIndex();
		
		switch(report) {
		case 0: txtS.setText("VENTAS POR MODELO" + "\n" +
							"" +  "\n" +
							"Modelo : " + modelo0+ "\n" + 
							"Cantidad de ventas : " + R1.getConta()  + "\n" +
							"Cantidad de cajas vendidas : " + R1.getCanti() + "\n" +
							"Importe total vendido : " + R1.getIc() + "\n"+ 
							"Aporte a la cuota diaria : " + df.format(R1.getAp()) + "%"+ "\n"+
							"" + "\n" +
							"Modelo : " + modelo1+ "\n" + 
							"Cantidad de ventas : " + R1.getConta1()  + "\n" +
							"Cantidad de cajas vendidas : " + R1.getCanti1() + "\n" +

							"Importe total vendido : " + R1.getIc1() + "\n"+ 
							"Aporte a la cuota diaria : " + df.format(R1.getAp1())+ "%" + "\n"+
							"" + "\n" +
							"Modelo : " + modelo2+ "\n" + 
							"Cantidad de ventas : " + R1.getConta2()  + "\n" +
							"Cantidad de cajas vendidas : " + R1.getCanti2() + "\n" +

							"Importe total vendido : " + R1.getIc2() + "\n"+ 
							"Aporte a la cuota diaria : " + df.format(R1.getAp2())+ "%" + "\n"+
							"" + "\n" +
							"Modelo : " + modelo3+ "\n" + 
							"Cantidad de ventas : " + R1.getConta3()  + "\n" +
							"Cantidad de cajas vendidas : " + R1.getCanti3() + "\n" +

							"Importe total vendido : " + R1.getIc3() + "\n"+ 
							"Aporte a la cuota diaria : " + df.format(R1.getAp3())+ "%" + "\n"+
							"" + "\n" +
							"Modelo : " + modelo4+ "\n" + 
							"Cantidad de ventas : " + R1.getConta4()  + "\n" +
							"Cantidad de cajas vendidas : " +  df.format(R1.getCanti4()) + "\n" +

							"Importe total vendido : " + R1.getIc4() + "\n"+ 
							"Aporte a la cuota diaria : " + df.format(R1.getAp())+ "%" + "\n"+
							"" + "\n" 
							);break;
		case 1: txtS.setText("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO" + "\n" +
							"" + "\n" +
							"Modelo : " + modelo0 + "\n" +
							"Precio : " + R2.getPrecio_0() + "\n" +
							"Precio promedio : " + df.format(R1.getPromedio()) + "\n" +
							"Comparación : " + df.format(c) +" "+ comparacion +"\n" +
							"" + "\n" +
							"Modelo : " + modelo1 + "\n" +
							"Precio : " + R2.getPrecio_1() + "\n" +
							"Precio promedio : " + df.format(R1.getPromedio()) + "\n" +
							"Comparación : " + df.format(c1)+ " "+comparacion1 +"\n" +
							"" + "\n" +
							"Modelo : " + modelo2 + "\n" +
							"Precio : " + R2.getPrecio_2() + "\n" +
							"Precio promedio : " + df.format(R1.getPromedio()) + "\n" +
							"Comparación : " + df.format(c2) +" "+ comparacion2+"\n" +
							"" + "\n" +
							"Modelo : " + modelo3 + "\n" +
							"Precio : " + R2.getPrecio_3() + "\n" +
							"Precio promedio : " + df.format(R1.getPromedio()) + "\n" +
							"Comparación : " + df.format(c3)+ " "+comparacion3 +"\n" +
							"" + "\n" +
							"Modelo : " + modelo4 + "\n" +
							"Precio : " + R2.getPrecio_4() + "\n" +
							"Precio promedio : " + df.format(R1.getPromedio()) + "\n" +
							"Comparación : " + df.format(c4) +" "+ comparacion4+"\n" +
							"" + "\n" 
							);break;
		case 2:txtS.setText("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA"+ "\n" +
				"" + "\n" +
				"Modelo : " + modelo0 + "\n" +
				"Cantidad de cajas vendidas : " + R1.getCanti() + "\n" +
				"Cantidad óptima : " + R3.getCantidadOptima() + "\n" +
				"Comparación : " + cc +" "+ compara +"\n" +
				"" + "\n" +
				"Modelo : " + modelo1 + "\n" +
				"Cantidad de cajas vendidas : " + R1.getCanti1() + "\n" +
				"Cantidad óptima : " + R3.getCantidadOptima() + "\n" +
				"Comparación : " + cc1+" "+compara1 +"\n" +
				"" + "\n" +
				"Modelo : " + modelo2 + "\n" +
				"Cantidad de cajas vendidas : " + R1.getCanti2() + "\n" +
				"Cantidad óptima : " + R3.getCantidadOptima() + "\n" +
				"Comparación : " + cc2+" "+compara2 +"\n" +
				"" + "\n" +
				"Modelo : " + modelo3 + "\n" +
				"Cantidad de cajas vendidas : " + R1.getCanti3() + "\n" +
				"Cantidad óptima : " + R3.getCantidadOptima() + "\n" +
				"Comparación : " + cc3 +" "+compara3+"\n" +
				"" + "\n" +
				"Modelo : " + modelo4 + "\n" +
				"Cantidad de cajas vendidas : " + R1.getCanti4() + "\n" +
				"Cantidad óptima : " + R3.getCantidadOptima() + "\n" +
				"Comparación : " + cc4+" " +compara4+"\n" +
				"" + "\n" 
				);break;
		default: txtS.setText("ESTADÍSTICA SOBRE EL PRECIO"+ "\n" +
				"" + "\n" +
				"Precio promedio : " + "" + "\n" +
				"Precio mayor : " + "" + "\n" +
				"Precio menor : " + "" + "\n" 
				);
		}
	}
}