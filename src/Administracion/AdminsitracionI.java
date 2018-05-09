package Administracion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionBBDD.ConexionBBDD;
import Inicio.Index;
import Inicio.PanelI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class AdminsitracionI {

	public JFrame frame;
	private JTable AdministracionProdPreCatg;
	private JLabel lblBuscar;
	private JTextField textField;
	private JButton btnBusqudaAvanzada;
	private JLabel lblAadir;
	private JButton btnProductos;
	private JLabel lblAadirmodificar;
	private JButton btnCategorias;
	private JButton btnListo;
	private JButton btnAtras;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminsitracionI window = new AdminsitracionI();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminsitracionI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 780, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 561, 364);
		frame.getContentPane().add(scrollPane);
		
		AdministracionProdPreCatg = new JTable();
		AdministracionProdPreCatg.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre del Producto", "Precio", "Categoria"
			}
		));
		scrollPane.setViewportView(AdministracionProdPreCatg);
		
		lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(581, 18, 46, 14);
		frame.getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(637, 15, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnBusqudaAvanzada = new JButton("Busqueda Avanzada");
		btnBusqudaAvanzada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedaAvanzadaAdminII busqueda = new BusquedaAvanzadaAdminII();
				busqueda.frame.setVisible(true);
				
			}
		});
		btnBusqudaAvanzada.setBounds(591, 46, 155, 23);
		frame.getContentPane().add(btnBusqudaAvanzada);
		
		lblAadir = new JLabel("A\u00F1adir");
		lblAadir.setBounds(593, 191, 46, 14);
		frame.getContentPane().add(lblAadir);
		
		btnProductos = new JButton("Productos");
		btnProductos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProductos.setBounds(601, 212, 122, 50);
		frame.getContentPane().add(btnProductos);
		
		lblAadirmodificar = new JLabel("A\u00F1adir/Modificar");
		lblAadirmodificar.setBounds(591, 300, 93, 14);
		frame.getContentPane().add(lblAadirmodificar);
		
		btnCategorias = new JButton("Categorias");
		btnCategorias.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCategorias.setBounds(601, 325, 122, 50);
		frame.getContentPane().add(btnCategorias);
		
		btnListo = new JButton("Listo");
		btnListo.setBounds(657, 399, 89, 23);
		frame.getContentPane().add(btnListo);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index = new Index();
				index.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtras.setBounds(10, 399, 64, 23);
		frame.getContentPane().add(btnAtras);
		
		btnListar = new JButton("Actualizar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConexionBBDD Prueba = new ConexionBBDD();
				AdministracionProdPreCatg.setModel(Prueba.Productos());
			}
		});
		
		ConexionBBDD Prueba = new ConexionBBDD();
		AdministracionProdPreCatg.setModel(Prueba.Productos());
		
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnListar.setBounds(601, 102, 122, 57);
		frame.getContentPane().add(btnListar);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnAadirProductos = new JMenu("Administracion");
		menuBar.add(mnAadirProductos);
		
		JMenu mnProductos = new JMenu("Productos");
		mnAadirProductos.add(mnProductos);
		
		JMenuItem mntmAadirProducto = new JMenuItem("A\u00F1adir Producto");
		mnProductos.add(mntmAadirProducto);
		
		JMenu mnCategorias = new JMenu("Categorias");
		mnAadirProductos.add(mnCategorias);
		
		JMenuItem mntmAadirModificar = new JMenuItem("A\u00F1adir / Modificar Categorias");
		mnCategorias.add(mntmAadirModificar);
		
		JMenu mnPedidos = new JMenu("Historial");
		mnAadirProductos.add(mnPedidos);
		
		JMenuItem mntmHistorialDePedidos = new JMenuItem("Historial de Pedidos");
		mnPedidos.add(mntmHistorialDePedidos);
		
		JMenuItem mntmHistorialDeTickets = new JMenuItem("Historial de Tickets");
		mnPedidos.add(mntmHistorialDeTickets);
		
		JMenu mnVista = new JMenu("Vista");
		menuBar.add(mnVista);
		
		JMenuItem mntmVistaTotal = new JMenuItem("Vista Total");
		mnVista.add(mntmVistaTotal);
			
		mntmVistaTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConexionBBDD Prueba = new ConexionBBDD();
				AdministracionProdPreCatg.setModel(Prueba.Productos());
			}

		});
		
		JMenu mnListarProductos = new JMenu("Ordenar");
		mnVista.add(mnListarProductos);
		
		JCheckBoxMenuItem chckbxmntmProducto = new JCheckBoxMenuItem("Producto");
		mnListarProductos.add(chckbxmntmProducto);
		
		JCheckBoxMenuItem chckbxmntmCategoria = new JCheckBoxMenuItem("Categoria");
		mnListarProductos.add(chckbxmntmCategoria);
		
		JCheckBoxMenuItem chckbxmntmPrecio = new JCheckBoxMenuItem("Precio");
		mnListarProductos.add(chckbxmntmPrecio);
	}

	
	public void setVisible(boolean b) {
		// TODO Apéndice de método generado automáticamente
		
	}
}

