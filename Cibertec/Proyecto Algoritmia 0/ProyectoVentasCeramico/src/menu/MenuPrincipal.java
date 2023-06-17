package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mantenimiento.GUI_ConsultarCeramico;
import proyecto.Figura5;
import mantenimiento.Figura3;
import mantenimiento.Figura4;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {
	public static String modelo0 ="Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.00;
	public static double largo0 = 62.00;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 6;
	
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_1;
	private JMenuItem Consultar;
	private JMenuItem Modificar;
	private JMenuItem Listar;
	private JMenu mnNewMenu_2;
	private JMenuItem Vender;
	private JMenuItem mntmNewMenuItem_5;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;

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
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(this);
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		Consultar = new JMenuItem("Consultar Cerámico");
		Consultar.addActionListener(this);
		mnNewMenu_1.add(Consultar);
		
		Modificar = new JMenuItem("Modificar Cerámico");
		Modificar.addActionListener(this);
		mnNewMenu_1.add(Modificar);
		
		Listar = new JMenuItem("Listar Cerámico");
		Listar.addActionListener(this);
		mnNewMenu_1.add(Listar);
		
		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		Vender = new JMenuItem("Vender");
		Vender.addActionListener(this);
		mnNewMenu_2.add(Vender);
		
		mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mntmNewMenuItem_5.addActionListener(this);
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Configuración");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_6 = new JMenuItem("Configurar descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Configurar obsequios");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Configurar cantidad óptima");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria");
		mnNewMenu_3.add(mntmNewMenuItem_9);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Vender) {
			actionPerformedMntmNewMenuItem_4(e);

		}
		if (e.getSource() == Listar) {
			actionPerformedMntmNewMenuItem_3(e);
		}
		if (e.getSource() == Modificar) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == Consultar) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedmnNewMenu(e);
		}
	}
	protected static void actionPerformedmnNewMenu(ActionEvent e) {
		System.exit(0);

	}
	protected static void actionPerformedMntmNewMenuItem_1(ActionEvent e) {

		GUI_ConsultarCeramico newFrame = new GUI_ConsultarCeramico();
		newFrame.setVisible(true);

	}
	protected static void actionPerformedMntmNewMenuItem_2(ActionEvent e) {
		Figura3 newFrame = new Figura3();
		newFrame.setVisible(true);
	}
	protected static void actionPerformedMntmNewMenuItem_3(ActionEvent e) {
		Figura4 newFrame = new Figura4();
		newFrame.setVisible(true);
}
	protected static void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		Figura5 newFrame = new Figura5();
		newFrame.setVisible(true);
	}

	
	
}