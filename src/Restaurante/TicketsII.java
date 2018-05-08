package Restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionBBDD.ConexionBBDD;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketsII {

	private JFrame frame;
	private JTable TicketMesTiPagImpoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketsII window = new TicketsII();
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
	public TicketsII() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAtras.setBounds(10, 11, 59, 23);
		frame.getContentPane().add(btnAtras);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Todas las Mesas", "Mesa 01", "Mesa 02", "Mesa 03", "Mesa 04", "Mesa 05", "Mesa 06", "Mesa 07", "Mesa 08", "Mesa 09", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15"}));
		comboBox.setBounds(145, 12, 121, 20);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 45, 302, 266);
		frame.getContentPane().add(scrollPane);
		
		TicketMesTiPagImpoTotal = new JTable();
		TicketMesTiPagImpoTotal.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mesa", "Tipo de Pago", "Importe Total"
			}
		));
		scrollPane.setViewportView(TicketMesTiPagImpoTotal);
		
		JButton btnPagado = new JButton("Pagado");
		btnPagado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPagado.setBounds(112, 332, 121, 50);
		frame.getContentPane().add(btnPagado);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConexionBBDD Prueba = new ConexionBBDD();
				TicketMesTiPagImpoTotal.setModel(Prueba.Ticket());
			}
		});
		btnListar.setBounds(276, 11, 60, 23);
		frame.getContentPane().add(btnListar);
	}
}
