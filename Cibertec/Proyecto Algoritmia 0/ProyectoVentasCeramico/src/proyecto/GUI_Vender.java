package proyecto;

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
	private JComboBox cboMode;
	private JTextArea txtS;

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
		setBounds(100, 100, 450, 311);
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
			cboMode = new JComboBox();
			cboMode.setBounds(91, 17, 171, 22);
			cboMode.setModel(new DefaultComboBoxModel(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalía"}));
			contentPanel.add(cboMode);
		}
		{
			JButton btnNewButton = new JButton("Vender");
			btnNewButton.setBounds(322, 17, 89, 23);
			btnNewButton.addActionListener(this);
			contentPanel.add(btnNewButton);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Cantidad");
			lblNewLabel_1.setBounds(10, 53, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCanti = new JTextField();
			txtCanti.setBounds(91, 50, 171, 20);
			contentPanel.add(txtCanti);
			txtCanti.setColumns(10);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 93, 414, 168);
			contentPanel.add(txtS);
		}
	}

	public void actionPerformed(ActionEvent e) {
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
	}

