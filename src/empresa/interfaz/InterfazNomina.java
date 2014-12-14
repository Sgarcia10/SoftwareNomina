package empresa.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.border.LineBorder;

public class InterfazNomina extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public InterfazNomina() {
		setTitle("Pulsoft Versi\u00F3n Beta");
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "Informacion Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(236, 139, 418, 262);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 24, 128, 161);
		panel_1.add(panel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 24, 157, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(158, 24, 46, 14);
		panel_1.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(158, 58, 46, 14);
		panel_1.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 55, 157, 20);
		panel_1.add(textField_2);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setBounds(158, 89, 105, 14);
		panel_1.add(lblFechaDeNacimiento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(310, 86, 86, 20);
		panel_1.add(textField_3);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de Ingreso:");
		lblFechaDeIngreso.setBounds(158, 120, 105, 14);
		panel_1.add(lblFechaDeIngreso);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(310, 117, 86, 20);
		panel_1.add(textField_4);
		
		JLabel lblFechaDeAfiliacin = new JLabel("Fecha de Afiliaci\u00F3n a ISS:");
		lblFechaDeAfiliacin.setBounds(158, 151, 135, 14);
		panel_1.add(lblFechaDeAfiliacin);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(310, 148, 86, 20);
		panel_1.add(textField_5);
		
		JLabel lblSalarioBsico = new JLabel("Salario B\u00E1sico:");
		lblSalarioBsico.setBounds(158, 182, 105, 14);
		panel_1.add(lblSalarioBsico);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(310, 179, 86, 20);
		panel_1.add(textField_6);
		
		JButton btnLiquidacindeNomina = new JButton("Liquidaci\u00F3nde Nomina");
		btnLiquidacindeNomina.setBounds(10, 217, 163, 23);
		panel_1.add(btnLiquidacindeNomina);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(307, 217, 89, 23);
		panel_1.add(btnModificar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(null, "Lista Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 24, 221, 377);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 201, 248);
		panel_3.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setRowHeaderView(list);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(10, 30, 46, 14);
		panel_3.add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(77, 27, 98, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setBounds(185, 24, 26, 23);
		panel_3.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setToolTipText("Buscar\r\n");
		btnBuscar.setIcon(new ImageIcon("./data/icono_lupa.gif"));
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 311, 89, 23);
		panel_3.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(122, 311, 89, 23);
		panel_3.add(btnEliminar);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(497, 11, 157, 123);
		panel.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setSize(140, 140);
		ImageIcon fot = new ImageIcon("./data/logo_empresa.jpg");
		ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(icono);
		panel_5.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnArchivo.add(mntmSalir);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmSobreLaAplicacin = new JMenuItem("Sobre la aplicaci\u00F3n");
		mnAbout.add(mntmSobreLaAplicacin);
		setSize(new Dimension(700, 500));
	}
	
	public static void main(String[] args) {
		JFrame ventana = new InterfazNomina();
		ventana.setVisible(true);
		

	}
}
