package ProyectVentasCeramico;

import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExamenFinal extends JFrame implements ActionListener {
int c1, c2, c3;
double tot1, tot2, tot3;
DecimalFormat df = new DecimalFormat("0.0");
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCanti;
	private JButton btnProcesar;
	private JTextArea txtS;
	private JComboBox cboMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenFinal frame = new ExamenFinal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExamenFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(42, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(42, 58, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCanti = new JTextField();
		txtCanti.setBounds(134, 55, 126, 20);
		contentPane.add(txtCanti);
		txtCanti.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(303, 34, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(24, 87, 376, 163);
		contentPane.add(txtS);
		
		cboMarca = new JComboBox();
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Costeño", "Faraon", "Bells"}));
		cboMarca.setBounds(134, 18, 126, 22);
		contentPane.add(cboMarca);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		int marca, canti;
		double  ipagar;
		marca = leerMarca();
		canti = leerCantidad();
		ipagar = calcularImportePagar(marca);
		
		efectuarIncrementos(marca, ipagar, canti);
		mostrarResultados(ipagar);
	}
	int leerMarca() {
		return cboMarca.getSelectedIndex();
	}
	
	int leerCantidad() {
		 return Integer.parseInt(txtCanti.getText());
	}
	double calcularImportePagar(int marca) {
		switch(marca) {
		case 0: return 19.9;
		case 1: return 20.1;
		default: return 15.9;
		}
	}
	void efectuarIncrementos(int marca, double ipagar, int canti) {
		switch (marca) {
		case 0: c1=c1+canti;break;
		case 1: c2=c2+canti;break;
		default: c3=c3+canti;
		}
		switch(marca) {
		case 0: tot1=tot1+ipagar;break;
		case 1: tot2=tot2+ipagar;break;
		default: tot3=tot3+ipagar;

		}
		}
	
		void mostrarResultados(double ipagar) {
			txtS.setText("");
			imprimir("Importe a pagar: "+ ipagar);
			imprimir("Cantidad de bolsas vendidas de la primera marca: " + c1);
			imprimir("Cantidad de bolsas vendidas de la segunda marca: " + c2);
			imprimir("Cantidad de bolsas vendidas de la tercera marca: " + c3);

			imprimir("Importe total vendido de la primera marca: " + df.format(tot1));
			imprimir("Importe total vendido de la segunda marca: " + df.format(tot2));
			imprimir("Importe total vendido de la tercera marca: " + df.format(tot3));

		
		}
		void imprimir (String s) {
			txtS.append(s+"\n");
		}
		
}
