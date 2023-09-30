package menuPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class GUI_Ventas extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCliente;
	private JLabel lblNewLabel_2;
	private JTextField txtVendedor;
	private JLabel lblNewLabel_3;
	private JTextField txtProducto;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JButton btnVender;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ventas frame = new GUI_Ventas();
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
	public GUI_Ventas() {
		setTitle("VENTAS");
		setBounds(100, 100, 530, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("VENTAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(194, 11, 114, 44);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Código del cliente");
		lblNewLabel_1.setBounds(10, 61, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(141, 58, 86, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Código del vendedor");
		lblNewLabel_2.setBounds(10, 97, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		txtVendedor = new JTextField();
		txtVendedor.setBounds(141, 94, 86, 20);
		contentPane.add(txtVendedor);
		txtVendedor.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Código del producto");
		lblNewLabel_3.setBounds(10, 136, 114, 14);
		contentPane.add(lblNewLabel_3);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(141, 133, 86, 20);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Unidades a vender");
		lblNewLabel_4.setBounds(10, 175, 114, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(141, 172, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(305, 120, 121, 20);
		contentPane.add(btnVender);
		
		table = new JTable();
		table.setBounds(10, 207, 494, 116);
		contentPane.add(table);
	}
}