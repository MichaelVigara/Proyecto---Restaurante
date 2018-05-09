package Administracion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;

public class AñadirCategoriaAdminII {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirCategoriaAdminII window = new AñadirCategoriaAdminII();
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
	public AñadirCategoriaAdminII() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 11, 86, 14);
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 36, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(30, 59, 124, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("A\u00F1adir");
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(163, 11, 98, 68);
		frame.getContentPane().add(button);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(7, 90, 59, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnListo = new JButton("Listo");
		btnListo.setBounds(200, 90, 59, 23);
		frame.getContentPane().add(btnListo);
	}

}
