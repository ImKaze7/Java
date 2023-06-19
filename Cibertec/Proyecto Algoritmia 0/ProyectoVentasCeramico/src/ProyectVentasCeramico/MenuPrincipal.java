package ProyectVentasCeramico;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuPrincipal extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
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
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_2;
	private JMenuItem Vender;
	private JMenuItem Generar;
	private JMenu menu3;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem Obsequios;
	private JMenuItem Optima;
	private JMenuItem mntmNewMenuItem_9;
	private JMenu menucito;
	private JMenuItem AcercaDeTienda;
	private JMenu Mantenimiento;
	private JMenuItem Consultar;
	private JMenuItem Modificar;
	private JMenuItem Listar;

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
		
		Mantenimiento = new JMenu("Mantenimiento");
		menuBar.add(Mantenimiento);
		
		Consultar = new JMenuItem("Consultar cerámico");
		Consultar.addActionListener(this);
		Mantenimiento.add(Consultar);
		
		Modificar = new JMenuItem("Modificar cerámico");
		Modificar.addActionListener(this);
		Mantenimiento.add(Modificar);
		
		Listar = new JMenuItem("Listar cerámicos");
		Listar.addActionListener(this);
		Mantenimiento.add(Listar);
		
		mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		Vender = new JMenuItem("Vender");
		Vender.addActionListener(this);
		mnNewMenu_2.add(Vender);
		
		Generar = new JMenuItem("Generar reportes");
		Generar.addActionListener(this);
		mnNewMenu_2.add(Generar);
		
		menu3 = new JMenu("Configuración");
		menuBar.add(menu3);
		
		mntmNewMenuItem_6 = new JMenuItem("Configurar descuentos");
		mntmNewMenuItem_6.addActionListener(this);
		menu3.add(mntmNewMenuItem_6);
		
		Obsequios = new JMenuItem("Configurar obsequios");
		Obsequios.addActionListener(this);
		menu3.add(Obsequios);
		
		Optima = new JMenuItem("Configurar cantidad óptima");
		Optima.addActionListener(this);
		menu3.add(Optima);
		
		mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria");
		mntmNewMenuItem_9.addActionListener(this);
		menu3.add(mntmNewMenuItem_9);
		
		menucito = new JMenu("Ayuda");
		menuBar.add(menucito);
		
		AcercaDeTienda = new JMenuItem("Acerca de tienda");
		AcercaDeTienda.addActionListener(this);
		menucito.add(AcercaDeTienda);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Listar) {
			actionPerformedListar(e);
		}
		if (e.getSource() == Modificar) {
			actionPerformedModificar(e);
		}
		if (e.getSource() == Consultar) {
			actionPerformedConsultar(e);
		}
		if (e.getSource() == AcercaDeTienda) {
			actionPerformedAcercaDeTienda(e);
		}
		if (e.getSource() == mntmNewMenuItem_9) {
			actionPerformedMntmNewMenuItem_9(e);
		}
		if (e.getSource() == mntmNewMenuItem_6) {
			actionPerformedMntmNewMenuItem_6(e);
		}
		if (e.getSource() == Obsequios) {
			actionPerformedObsequios(e);
		}
		if (e.getSource() == Vender) {
			actionPerformedMntmNewMenuItem_4(e);

		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedmnNewMenu(e);
		}
		if (e.getSource() == Generar) {
			actionPerformedmnNewMenu_2(e);
		}
		if (e.getSource() == Optima) {
			actionPerformedmenu3(e);
		}
		
	}
	protected static void actionPerformedmnNewMenu(ActionEvent e) {
		System.exit(0);		

	}
	protected static void actionPerformedMntmNewMenuItem_4(ActionEvent e) {
		GUI_Vender newFrame = new GUI_Vender();
		newFrame.setVisible(true);
	}
	protected static void actionPerformedmnNewMenu_2(ActionEvent e) {
	GUI_GenerarReportes newFrame = new GUI_GenerarReportes();
	newFrame.setVisible(true);
	}
	protected static void actionPerformedmenu3(ActionEvent e) {
		GUI_ConfigurarCantidadOptima newDialog = new GUI_ConfigurarCantidadOptima();
		newDialog.setVisible(true);
	
	}
	protected void actionPerformedObsequios(ActionEvent e) {
		GUI_ConfigurarObsequios newDialog = new GUI_ConfigurarObsequios();
		newDialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_6(ActionEvent e) {
		GUI_ConfigurarDescuentos newDialog = new GUI_ConfigurarDescuentos();
		newDialog.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_9(ActionEvent e) {
		GUI_ConfigurarCuotaDiaria newDialog = new GUI_ConfigurarCuotaDiaria();
		newDialog.setVisible(true);
	}
	

	protected void actionPerformedAcercaDeTienda(ActionEvent e) {
		GUI_AcercaDeTienda newDialog = new GUI_AcercaDeTienda();
		newDialog.setVisible(true);
	}
	protected void actionPerformedConsultar(ActionEvent e) {
		GUI_ConsultarCeramico newFrame  = new GUI_ConsultarCeramico();
		newFrame.setVisible(true);
		
	}
	protected void actionPerformedModificar(ActionEvent e) {
		GUI_ModificarCeramico newFrame  = new GUI_ModificarCeramico();
		newFrame.setVisible(true);
	}
	protected void actionPerformedListar(ActionEvent e) {
		GUI_ListarCeramico newFrame  = new GUI_ListarCeramico();
		newFrame.setVisible(true);
	}
}