package InicioSesion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Inicio.Fondo;
import Inicio.FondoI;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioAdm {

	private JFrame frame;
	private JTextField textusr;
	private JTextField textpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioAdm window = new InicioAdm();
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
	public InicioAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBackground(new Color(0, 153, 204));
		frame.setBounds(100, 100, 243, 261);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(20, 66, 46, 14);
		frame.getContentPane().add(lblUsuario);
		
		textusr = new JTextField();
		textusr.setBounds(93, 63, 86, 20);
		frame.getContentPane().add(textusr);
		textusr.setColumns(10);
		
		textpass = new JTextField();
		textpass.setColumns(10);
		textpass.setBounds(93, 110, 86, 20);
		frame.getContentPane().add(textpass);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(20, 113, 65, 14);
		frame.getContentPane().add(lblContrasea);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FondoI inicio = new FondoI();
				inicio.frame.setVisible(true);
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAtras.setBounds(10, 11, 56, 23);
		frame.getContentPane().add(btnAtras);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sUser = textusr.getText();
				String sPassw = textpass.getText();
				if(sUser != "" && sPassw != "") {
					if(sPassw.equals("1234")) {
						Ejemplo1Ventana2 administracion = new Ejemplo1Ventana2();
						administracion.frame.setVisible(true);

					}else {
						JOptionPane.showMessageDialog(null, "Error en contraseña");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Error en usuario");
				
				
					
				
			}
			}
		});
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnValidar.setBounds(70, 155, 89, 38);
		frame.getContentPane().add(btnValidar);
	}
}
