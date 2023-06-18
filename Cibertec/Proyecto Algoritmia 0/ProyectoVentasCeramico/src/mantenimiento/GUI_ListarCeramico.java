package mantenimiento;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;

public class GUI_ListarCeramico extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnListar;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_ListarCeramico dialog = new GUI_ListarCeramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_ListarCeramico() {
		setTitle("Listar Cerámico");
		setBounds(100, 100, 516, 381);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(235, 308, 89, 23);
		btnListar.addActionListener(this);
		contentPanel.setLayout(null);
		contentPanel.add(btnListar);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(136, 308, 89, 23);
		contentPanel.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 480, 279);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		


      
    }
	
	public void actionPerformed(ActionEvent e) {
		
		
		txtS.setText("LISTADO DE CERÁMICOS" + "\n") ;
		txtS.append(""+ "\n");
		txtS.append("Modelo     : Cinza Plus"+ "\n");
		txtS.append("Precio     : S/ 92.56"+ "\n");
		txtS.append("Ancho (cm) : 62.0 cm"+ "\n");
		txtS.append("Largo (cm) : 62.0 cm"+ "\n");
		txtS.append("Espesor(mm): 8.0 cm"+ "\n");
		txtS.append("Contenido  : 6 unidades"+ "\n");
		txtS.append(""+ "\n");
		txtS.append("Modelo     : Luxury"+ "\n");
		txtS.append("Precio     : S/ 42.77"+ "\n");
		txtS.append("Ancho (cm) : 60.0 cm"+ "\n");
		txtS.append("Largo (cm) : 60.0 cm"+ "\n");
		txtS.append("Espesor(mm): 8.5 cm"+ "\n");
		txtS.append("Contenido  : 4 unidades"+ "\n");
		txtS.append(""+ "\n");
		txtS.append("Modelo     : Austria"+ "\n");
		txtS.append("Precio     : S/ 52.45"+ "\n");
		txtS.append("Ancho (cm) : 45 cm"+ "\n");
		txtS.append("Largo (cm) : 45 cm"+ "\n");
		txtS.append("Espesor(mm): 6.5 cm"+ "\n");
		txtS.append("Contenido  : 12 unidades"+ "\n");
		txtS.append(""+ "\n");
		txtS.append("Modelo     : Yungay Mix"+ "\n");
		txtS.append("Precio     : S/ 55.89"+ "\n");
		txtS.append("Ancho (cm) : 80.0 cm"+ "\n");
		txtS.append("Largo (cm) : 120.0 cm"+ "\n");
		txtS.append("Espesor(mm): 6.8 cm"+ "\n");
		txtS.append("Contenido  : 9 unidades"+ "\n");
		txtS.append(""+ "\n");
		txtS.append("Modelo     : Thalía"+ "\n");
		txtS.append("Precio     : S/ 42.77"+ "\n");
		txtS.append("Ancho (cm) : 60.0 cm"+ "\n");
		txtS.append("Largo (cm) : 60.0 cm"+ "\n");
		txtS.append("Espesor(mm): 8.5 cm"+ "\n");
		txtS.append("Contenido  : 4 unidades"+ "\n");
	}
}
