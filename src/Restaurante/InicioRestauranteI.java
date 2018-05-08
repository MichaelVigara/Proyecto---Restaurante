package Restaurante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class InicioRestauranteI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioRestauranteI window = new InicioRestauranteI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InicioRestauranteI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular Importe");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 71, 138, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(10, 11, 59, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnComandas = new JButton("Comandas");
		btnComandas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComandas.setBounds(158, 71, 138, 62);
		frame.getContentPane().add(btnComandas);
		
		JButton btnTicket = new JButton("Ticket");
		btnTicket.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTicket.setBounds(306, 71, 138, 62);
		frame.getContentPane().add(btnTicket);
	}

}
