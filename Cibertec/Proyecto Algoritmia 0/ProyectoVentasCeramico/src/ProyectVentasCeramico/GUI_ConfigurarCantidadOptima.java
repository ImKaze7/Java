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

public class GUI_ConfigurarCantidadOptima extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	
	
	
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_ConfigurarCantidadOptima dialog = new GUI_ConfigurarCantidadOptima();
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
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 507, 106);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad óptima");
			lblNewLabel.setBounds(10, 11, 242, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txt1 = new JTextField();
			txt1.setBounds(138, 8, 232, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(380, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(380, 33, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}
	public GUI_ConfigurarCantidadOptima() {
		initialize();
		CrearDatos();
		
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
	
	void CrearDatos() {
		txt1.setText(Integer.toString(cantidadOptima));

	}
	public static int getCantidadOptima() {
		return cantidadOptima;
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		cantidadOptima = Integer.parseInt(txt1.getText());
		dispose();
	}

	

	
}
