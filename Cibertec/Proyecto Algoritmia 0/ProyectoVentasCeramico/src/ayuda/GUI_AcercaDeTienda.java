package ayuda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class GUI_AcercaDeTienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;

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
		setBounds(100, 100, 450, 300);
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
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(167, 227, 89, 23);
		contentPanel.add(btnCerrar);
		
		JLabel lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(187, 64, 46, 14);
		contentPanel.add(lblNewLabel_1);
	}
}
