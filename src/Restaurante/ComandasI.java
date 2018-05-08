package Restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionBBDD.ConexionBBDD;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComandasI {

	private JFrame frame;
	private JTable ComandasMesaComProdCant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComandasI window = new ComandasI();
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
	public ComandasI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(10, 11, 67, 23);
		frame.getContentPane().add(btnAtras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 64, 599, 215);
		frame.getContentPane().add(scrollPane);
		
		ComandasMesaComProdCant = new JTable();
		ComandasMesaComProdCant.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de Mesa", "Numero de Comandas", "Productos", "Cantidad"
			}
		));
		scrollPane.setViewportView(ComandasMesaComProdCant);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Todas las Mesas", "Mesa 01", "Mesa 02", "Mesa 03", "Mesa 04", "Mesa 05", "Mesa 06", "Mesa 07", "Mesa 08", "Mesa 09", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15"}));
		comboBox.setBounds(21, 290, 163, 40);
		frame.getContentPane().add(comboBox);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBBDD Prueba = new ConexionBBDD();
				ComandasMesaComProdCant.setModel(Prueba.Comandas());
			}
		});
		btnListar.setBounds(515, 290, 89, 23);
		frame.getContentPane().add(btnListar);
		
		JButton btnNewButton = new JButton("A\u00F1adir Producto");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(617, 114, 146, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLsito = new JButton("Listo");
		btnLsito.setBounds(700, 317, 67, 23);
		frame.getContentPane().add(btnLsito);
	}

}
