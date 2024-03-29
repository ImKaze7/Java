package menuPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;

public class GUI_Productos extends JFrame {

	private JPanel contentPane;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JButton btnEliminacion;
	private JButton btnListado;
	private JButton btnIngreso;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Productos frame = new GUI_Productos();
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
	public GUI_Productos() {
		setTitle("Vendedores");
		setBounds(100, 100, 531, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnModificacion = new JButton("Modificación");
		btnModificacion.setBounds(319, 146, 122, 23);
		contentPane.add(btnModificacion);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(319, 180, 122, 23);
		contentPane.add(btnConsulta);
		
		btnEliminacion = new JButton("Eliminación");
		btnEliminacion.setBounds(319, 214, 122, 23);
		contentPane.add(btnEliminacion);
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(319, 109, 122, 23);
		contentPane.add(btnListado);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.setBounds(319, 75, 122, 23);
		contentPane.add(btnIngreso);
		
		lblNewLabel = new JLabel("MANTENIMIENTO PRODUCTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(33, 11, 472, 53);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Código de producto");
		lblNewLabel_1.setBounds(10, 78, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(142, 76, 129, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Descripción");
		lblNewLabel_2.setBounds(10, 113, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 110, 129, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(10, 150, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 147, 129, 20);
		contentPane.add(textField_2);
		
		table = new JTable();
		table.setBounds(10, 282, 495, 205);
		contentPane.add(table);
	}
}
