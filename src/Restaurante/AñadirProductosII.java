package Restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionBBDD.ConexionBBDD;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class AñadirProductosII {

	private JFrame frame;
	private JTextField textField;
	private JTable AñadirProductoProdCateg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirProductosII window = new AñadirProductosII();
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
	public AñadirProductosII() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 335, 313);
		frame.getContentPane().add(scrollPane);
		
		AñadirProductoProdCateg = new JTable();
		AñadirProductoProdCateg.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre del Producto", "Categoria"
			}
		));
		scrollPane.setViewportView(AñadirProductoProdCateg);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 345, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(83, 342, 100, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 384, 63, 14);
		frame.getContentPane().add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Todas las Categorias", "Refrescos", "Bebidas Alcoholicas", "Casqueria", "Carnes", "Pescados", "Sopas", "Entrantes", "Pizzas", "Ensaladas", "Arroces", "Bocadillos", "Postres", "Menu Infantil", "Hamburguesas", "Pasta"}));
		comboBox.setBounds(83, 381, 148, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(10, 418, 65, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(255, 372, 100, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBBDD Prueba = new ConexionBBDD();
				AñadirProductoProdCateg.setModel(Prueba.AñadirProd());
			
			}
		});
		btnListar.setBounds(262, 341, 89, 23);
		frame.getContentPane().add(btnListar);
	}
}
