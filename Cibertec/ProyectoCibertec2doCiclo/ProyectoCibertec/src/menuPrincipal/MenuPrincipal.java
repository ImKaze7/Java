package menuPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar MenuBar;
	private JMenu mnMantemiento;
	private JMenuItem mnVendedores;
	private JMenuItem mnClientes;
	private JMenuItem mnProductos;
	private JMenu mnVentas;
	private JMenu mnReportes;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MenuBar = new JMenuBar();
		MenuBar.setBounds(0, 0, 462, 22);
		contentPane.add(MenuBar);
		
		mnMantemiento = new JMenu("Mantenimiento");
		MenuBar.add(mnMantemiento);
		
		mnVendedores = new JMenuItem("Vendedores");
		mnVendedores.addActionListener(this);
		mnMantemiento.add(mnVendedores);
		
		mnClientes = new JMenuItem("Clientes");
		mnClientes.addActionListener(this);
		mnMantemiento.add(mnClientes);
		
		mnProductos = new JMenuItem("Productos");
		mnProductos.addActionListener(this);
		mnMantemiento.add(mnProductos);
		
		mnVentas = new JMenu("Ventas");
		MenuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mnReportes = new JMenu("Reportes");
		mnReportes.addActionListener(this);
		MenuBar.add(mnReportes);
		
		mntmNewMenuItem_1 = new JMenuItem("Generar Reportes");
		mntmNewMenuItem_1.addActionListener(this);
		mnReportes.add(mntmNewMenuItem_1);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mnProductos) {
			actionPerformedMnProductos(e);
		}
		if (e.getSource() == mnClientes) {
			actionPerformedMnClientes(e);
		}
		if (e.getSource() == mnVendedores) {
			actionPerformedMnVendedores(e);
		}
	}
	protected void actionPerformedMnVendedores(ActionEvent e) {
		GUI_Vendedores newframe = new GUI_Vendedores();
		newframe.setVisible(true);
	}
	protected void actionPerformedMnClientes(ActionEvent e) {
		GUI_Clientes newframe = new GUI_Clientes();
		newframe.setVisible(true);
	}
	
	protected void actionPerformedMnProductos(ActionEvent e) {
		GUI_Productos newframe = new GUI_Productos();
		newframe.setVisible(true);
	}
	
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {
		GUI_Reportes newframe = new GUI_Reportes();
		newframe.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		GUI_Ventas newframe = new GUI_Ventas();
		newframe.setVisible(true);
	}
}