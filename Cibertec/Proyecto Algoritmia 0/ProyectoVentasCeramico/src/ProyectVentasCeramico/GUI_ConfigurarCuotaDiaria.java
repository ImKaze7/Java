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

public class GUI_ConfigurarCuotaDiaria extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static double cuotaDiaria = 30000;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_ConfigurarCuotaDiaria dialog = new GUI_ConfigurarCuotaDiaria();
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
		setBounds(100, 100, 445, 106);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cuota diaria esperada (S/.)");
			lblNewLabel.setBounds(10, 11, 186, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txt1 = new JTextField();
			txt1.setBounds(206, 8, 118, 20);
			contentPanel.add(txt1);
			txt1.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(334, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(334, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}
	
	public GUI_ConfigurarCuotaDiaria() {
		setTitle("Cuota Diaria");
	initialize();	
	CrearDatos();
	}
	void CrearDatos() {
		txt1.setText(Double.toString(cuotaDiaria));
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
	
	
	public static double getCuotaDiaria() {
		return cuotaDiaria;
	}

	

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		cuotaDiaria = Double.parseDouble(txt1.getText());
		dispose();

	}
}
