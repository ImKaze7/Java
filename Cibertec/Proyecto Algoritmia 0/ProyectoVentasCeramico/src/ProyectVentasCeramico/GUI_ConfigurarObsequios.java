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

public class GUI_ConfigurarObsequios extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JButton btnCancelar;
	private JButton btnAceptar;

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
			lblNewLabel.setBounds(10, 11, 105, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txt1 = new JTextField();
			txt1.setBounds(143, 8, 95, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("1 a 5 unidades");
			lblNewLabel_1.setBounds(10, 36, 123, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txt2 = new JTextField();
			txt2.setBounds(143, 33, 95, 20);
			contentPanel.add(txt2);
			txt2.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(319, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("6 a 10 unidades");
			lblNewLabel_2.setBounds(10, 58, 123, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("11 a más unidades");
			lblNewLabel_3.setBounds(10, 83, 123, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txt3 = new JTextField();
			txt3.setBounds(143, 55, 95, 20);
			contentPanel.add(txt3);
			txt3.setColumns(10);
		}
		{
			txt4 = new JTextField();
			txt4.setBounds(143, 80, 95, 20);
			contentPanel.add(txt4);
			txt4.setColumns(10);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(319, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}	}
	public GUI_ConfigurarObsequios() {
		initialize();
		CrearDatos();
	}
	void CrearDatos() {
	txt1.setText(tipoObsequio);
	txt2.setText(Integer.toString(obsequioCantidad1));
	txt3.setText(Integer.toString(obsequioCantidad2));
	txt4.setText(Integer.toString(obsequioCantidad3));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	
	
	public static String getTipoObsequio() {
		return tipoObsequio;
	}

	

	public static int getObsequioCantidad1() {
		return obsequioCantidad1;
	}

	

	public static int getObsequioCantidad2() {
		return obsequioCantidad2;
	}

	
	public static int getObsequioCantidad3() {
		return obsequioCantidad3;
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		tipoObsequio = txt1.getText();
		obsequioCantidad1 = Integer.parseInt(txt2.getText());
		obsequioCantidad2 = Integer.parseInt(txt3.getText());
		obsequioCantidad3 = Integer.parseInt(txt4.getText());

		
		dispose();
	}
}
