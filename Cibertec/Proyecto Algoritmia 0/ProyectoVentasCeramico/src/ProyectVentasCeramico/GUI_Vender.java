package ProyectVentasCeramico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	GUI_ModificarCeramico aaa = new GUI_ModificarCeramico();
	GUI_ConfigurarCuotaDiaria R4 = new GUI_ConfigurarCuotaDiaria();
	GUI_ConfigurarObsequios R5 = new GUI_ConfigurarObsequios();
	GUI_ConfigurarDescuentos R6 = new GUI_ConfigurarDescuentos();

double tot1, tot2, tot3, tot4, tot5;
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
		initialize();
		txtPrecioo();
	}
	private void initialize() {
		setTitle("Vender");
		setBounds(100, 100, 474, 333);
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
			txtS.setBounds(10, 126, 438, 157);
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
    private static int conta = 0;
    private static int conta1 = 0;
    private static int conta2 = 0;
    private static int conta3 = 0;
    private static int conta4 = 0;

	public static int getConta() {
		return conta;
	}

	public static double ic = 0.0;
	public static double ic1 = 0.0;
	public static double ic2 = 0.0;
	public static double ic3 = 0.0;
	public static double ic4 = 0.0;

	public static double ap = 0.0;
	public static double ap1 = 0.0;
	public static double ap2 = 0.0;
	public static double ap3 = 0.0;
	public static double ap4 = 0.0;

	
	

	public static double getAp() {
		return ap;
	}

	

	public static double getIc() {
		return ic;
	}
	
	private static int canti = 0;
	private static int canti1 = 0;
	private static int canti2 = 0;
	private static int canti3 = 0;
	private static int canti4 = 0;

	
	private static double promedio = 0.0;
	public static double getPromedio() {
		return promedio;
	}

	public static int getCanti() {
		return canti;
	}
	
	public static int getCanti1() {
		return canti1;
	}

	

	public static int getCanti2() {
		return canti2;
	}

	
	public static int getCanti3() {
		return canti3;
	}

	

	public static int getCanti4() {
		return canti4;
	}
	

	public static double getAp1() {
		return ap1;
	}

	
	public static double getAp2() {
		return ap2;
	}

	
	public static double getAp3() {
		return ap3;
	}

	
	public static double getAp4() {
		return ap4;
	}

	public static int getConta1() {
		return conta1;
	}

	
	public static int getConta2() {
		return conta2;
	}

	

	public static int getConta3() {
		return conta3;
	}

	

	public static int getConta4() {
		return conta4;
	}

	
	public static double getIc1() {
		return ic1;
	}

	
	public static double getIc2() {
		return ic2;
	}

	
	public static double getIc3() {
		return ic3;
	}

	
	public static double getIc4() {
		return ic4;
	}
	
	
	
	

	
	public static double getPrecio0() {
		return precio0;
	}

	

	public static double getPrecio1() {
		return precio1;
	}



	public static double getPrecio2() {
		return precio2;
	}

	

	public static double getPrecio3() {
		return precio3;
	}

	

	public static double getPrecio4() {
		return precio4;
	}

	

	void VenderCeramico() {
		
		
		String modelo;
		int  mode;
		double ip,des=0.0,obs=0.0,precio, suma=0;
		
		mode = cboMode.getSelectedIndex();

		precio= Double.parseDouble(txtPrecio.getText());
		promedio=(aaa.getPrecio_0()+aaa.getPrecio_1()+aaa.getPrecio_2()+aaa.getPrecio_3()+aaa.getPrecio_4())/5;
		
		
		switch(mode) {
		case 0:modelo="Cinza Plus";
		canti = Integer.parseInt(txtCanti.getText());

			ic=canti*precio;
			ap = (ic*100)/R4.getCuotaDiaria();
			  
			if(canti >= 1 && canti <=5){	
				 des=ic*(R6.getPorcentaje1()/100);
				 }
			 
			 if(canti >=6 && canti <=10) { 
				des=ic*(R6.getPorcentaje2()/100);
				}
			 
			 if (canti >=11  && canti <=15) {
				des=ic*(R6.getPorcentaje3()/100);
				}else if (canti >15) {
				des=ic*(R6.getPorcentaje4()/100);
				}
			 
			 
			
			 ip=ic-des;	 tot1+=ip;
			//Acumula EL importe a pagar
			 
			 double cd = (tot1*100)/R4.getCuotaDiaria();
			 conta++;
             if (conta % 5 == 0) {
                 JOptionPane.showMessageDialog(null, "Venta Nro. 5" + "\n" + 
                		 							"Importe total general acumulado : " + df.format(tot1) +"\n"+
                		 							"Porcentaje de la cuota diaria: " + df.format(cd)+"%" +"\n");
             }
         
		
		

				if(canti >=1 && canti <=5) 
					obs=R5.getObsequioCantidad1();
				if (canti >=6 && canti <=10) 
					obs=R5.getObsequioCantidad2();
				else if(canti>10)
					obs=R5.getObsequioCantidad3();
				;break;
				
		case 1:modelo="Luxury";
		canti1 = Integer.parseInt(txtCanti.getText());

			ic1=canti1*precio;
			ap1 = (ic1*100)/R4.getCuotaDiaria();
			  

		 if(canti1 >= 1 && canti1 <=5){	
			 des=ic1*(R6.getPorcentaje1()/100);
			 }
		 
		 if(canti1 >=6 && canti1 <=10) { 
			des=ic1*(R6.getPorcentaje2()/100);
			}
		 
		 if (canti1 >=11  && canti1 <=15) {
			des=ic1*(R6.getPorcentaje3()/100);
			}else if (canti1 >15) {
			des=ic1*(R6.getPorcentaje4()/100);
			}
		
		 
		 ip=ic1-des;	 tot2+=ip;
			//Acumula EL importe a pagar
			 double cd2 = (tot2*100)/R4.getCuotaDiaria();
			 conta1++;
          if (conta1 % 5 == 0) {
              JOptionPane.showMessageDialog(null, "Venta Nro. 5" + "\n" + 
             		 							"Importe total general acumulado : " + df.format(tot2) +"\n"+
             		 							"Porcentaje de la cuota diaria: " + df.format(cd2)+"%" +"\n");
          }
          if(canti >=1 && canti <=5) 
				obs=R5.getObsequioCantidad1();
			if (canti >=6 && canti <=10) 
				obs=R5.getObsequioCantidad2();
			else if(canti>10)
				obs=R5.getObsequioCantidad3();
				;break;
				
		case 2:modelo="Austria";
		canti2 = Integer.parseInt(txtCanti.getText());

			ic2=canti2*precio;
			ap2 = (ic2*100)/R4.getCuotaDiaria();
			  

			if(canti2 >= 1 && canti2 <=5){	
				 des=ic2*(R6.getPorcentaje1()/100);
				 }
			 
			 if(canti2 >=6 && canti2 <=10) { 
				des=ic2*(R6.getPorcentaje2()/100);
				}
			 
			 if (canti2 >=11  && canti2 <=15) {
				des=ic2*(R6.getPorcentaje3()/100);
				}else if (canti2 >15) {
				des=ic2*(R6.getPorcentaje4()/100);
				}
			 ip=ic2-des;	 tot3+=ip;
				//Acumula EL importe a pagar
				 double cd3 = (tot3*100)/R4.getCuotaDiaria();
				 conta2++;
	          if (conta2 % 5 == 0) {
	              JOptionPane.showMessageDialog(null, "Venta Nro. 5" + "\n" + 
	             		 							"Importe total general acumulado : " + df.format(tot3) +"\n"+
	             		 							"Porcentaje de la cuota diaria: " + df.format(cd3)+"%" +"\n");
	          }			if(canti >=1 && canti <=5) 
					obs=R5.getObsequioCantidad1();
				if (canti >=6 && canti <=10) 
					obs=R5.getObsequioCantidad2();
				else if(canti>10)
					obs=R5.getObsequioCantidad3();
				;break;
		case 3:modelo="Yungay Mix";
		canti3 = Integer.parseInt(txtCanti.getText());

			ic3=canti3*precio;
			ap3 = (ic3*100)/R4.getCuotaDiaria();
			  

			if(canti3 >= 1 && canti3 <=5){	
				 des=ic3*(R6.getPorcentaje1()/100);
				 }
			 
			 if(canti3 >=6 && canti3 <=10) { 
				des=ic3*(R6.getPorcentaje2()/100);
				}
			 
			 if (canti3 >=11  && canti3 <=15) {
				des=ic3*(R6.getPorcentaje3()/100);
				}else if (canti3 >15) {
				des=ic3*(R6.getPorcentaje4()/100);
				}
			 ip=ic3-des;	 tot4+=ip;
				//Acumula EL importe a pagar
				 double cd4 = (tot4*100)/R4.getCuotaDiaria();
				 conta3++;
	          if (conta3 % 5 == 0) {
	              JOptionPane.showMessageDialog(null, "Venta Nro. 5" + "\n" + 
	             		 							"Importe total general acumulado : " + df.format(tot4) +"\n"+
	             		 							"Porcentaje de la cuota diaria: " + df.format(cd4)+"%" +"\n");
	          }				if(canti >=1 && canti <=5) 
					obs=R5.getObsequioCantidad1();
				if (canti >=6 && canti <=10) 
					obs=R5.getObsequioCantidad2();
				else if(canti>10)
					obs=R5.getObsequioCantidad3();
				;break;
		default:modelo="Thalía";
		canti4 = Integer.parseInt(txtCanti.getText());

			ic4=canti4*precio;
			ap4 = (ic4*100)/R4.getCuotaDiaria();

			 

			if(canti4 >= 1 && canti4 <=5){	
				 des=ic4*(R6.getPorcentaje1()/100);
				 }
			 
			 if(canti4 >=6 && canti4 <=10) { 
				des=ic4*(R6.getPorcentaje2()/100);
				}
			 
			 if (canti4 >=11  && canti4 <=15) {
				des=ic4*(R6.getPorcentaje3()/100);
				}else if (canti4 >15) {
				des=ic4*(R6.getPorcentaje4()/100);
				}
			 ip=ic4-des;	 tot5+=ip;
				//Acumula EL importe a pagar
				 double cd5 = (tot5*100)/R4.getCuotaDiaria();
				 conta4++;
	          if (conta4 % 5 == 0) {
	              JOptionPane.showMessageDialog(null, "Venta Nro. 5" + "\n" + 
	             		 							"Importe total general acumulado : " + df.format(tot5) +"\n"+
	             		 							"Porcentaje de la cuota diaria: " + df.format(cd5)+"%" +"\n");
	          }				
	            if(canti >=1 && canti <=5) 
					obs=R5.getObsequioCantidad1();
				if (canti >=6 && canti <=10) 
					obs=R5.getObsequioCantidad2();
				else if(canti>10)
					obs=R5.getObsequioCantidad3();
				;break;
				
		}
		
		txtS.setText("BOLETA DE VENTA: "+ "\n");
		txtS.append(" " +"\n");
		txtS.append("Modelo             : " + modelo + "\n" );
		txtS.append("Precio              : " + precio+ "\n");
		txtS.append("Cantidad adquirida  : " + canti+ "\n");
		txtS.append("Importe compra      : " + df.format(ic)+ "\n");
		txtS.append("Importe descuento   : " + df.format(des) +"\n");
		txtS.append("Importe pagar       : " + df.format(ip)+ "\n");
		txtS.append("Tipo de obsequio    : " + R5.getTipoObsequio()+ "\n");
		txtS.append("Unidades obsequiadas: " + obs);
	}
		

	

	

	

	

	void txtPrecioo() {
		

		int mode;
		mode = cboMode.getSelectedIndex();

		switch(mode) {
		case 0: txtPrecio.setText(Double.toString(aaa.getPrecio_0()));break;
		case 1: txtPrecio.setText(Double.toString(aaa.getPrecio_1()));break;
		case 2: txtPrecio.setText(Double.toString(aaa.getPrecio_2()));break;
		case 3: txtPrecio.setText(Double.toString(aaa.getPrecio_3()));break;
		default: txtPrecio.setText(Double.toString(aaa.getPrecio_4()));

		}

	}
	
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		VenderCeramico();
	}	protected void actionPerformedCboMode(ActionEvent e) {
		txtPrecioo();
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
}

