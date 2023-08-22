package ProyectVentasCeramico;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_AcercaDeTienda extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JButton btnCerrar;
	private JLabel lblRamosAlaniaJos;
	private JLabel lblFloresCurahuaDaniel;
	private JLabel lblMarquinaVelaKevin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_AcercaDeTienda dialog = new GUI_AcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_AcercaDeTienda() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 293);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tienda 1.0");
			lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 23));
			lblNewLabel.setBounds(150, 0, 135, 64);
			contentPanel.add(lblNewLabel);
		}
		
		separator = new JSeparator();
		separator.setBounds(0, 51, 510, 2);
		contentPanel.add(separator);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(169, 216, 89, 23);
		contentPanel.add(btnCerrar);
		
		JLabel lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(187, 64, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblRamosAlaniaJos = new JLabel("Ramos Alania, José");
		lblRamosAlaniaJos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamosAlaniaJos.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblRamosAlaniaJos.setBounds(114, 89, 189, 30);
		contentPanel.add(lblRamosAlaniaJos);
		
		lblFloresCurahuaDaniel = new JLabel("Flores Curahua, Daniel");
		lblFloresCurahuaDaniel.setHorizontalAlignment(SwingConstants.CENTER);
		lblFloresCurahuaDaniel.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblFloresCurahuaDaniel.setBounds(114, 116, 199, 30);
		contentPanel.add(lblFloresCurahuaDaniel);
		
		lblMarquinaVelaKevin = new JLabel("Marquina Vela, Kevin");
		lblMarquinaVelaKevin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarquinaVelaKevin.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblMarquinaVelaKevin.setBounds(114, 144, 189, 30);
		contentPanel.add(lblMarquinaVelaKevin);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
