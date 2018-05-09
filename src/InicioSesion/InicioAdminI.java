package InicioSesion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Administracion.AdminsitracionI;
import Inicio.FondoI;
import Inicio.Index;
import Inicio.PanelI;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class InicioAdminI {

	public JFrame frame;
	private JTextField textusr;
	private JPasswordField textpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioAdminI window = new InicioAdminI();
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
	public InicioAdminI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
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
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(20, 113, 65, 14);
		frame.getContentPane().add(lblContrasea);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sUser = textusr.getText();
				String sPassw = textpass.getText();
				if(sUser != "" && sPassw != "") {
					if(sPassw.equals("1234")) {
						AdminsitracionI administracion = new AdminsitracionI();
						JOptionPane.showMessageDialog(null, "Datos Correctos: Bienvenido");
						administracion.frame.setVisible(true);
						frame.setVisible(false);
						Index portal = new Index();
						portal.frame.setVisible(false);

					}else {
						JOptionPane.showMessageDialog(null, "Error en el usuario o contraseña");
					}
									
			}
			}
		});
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnValidar.setBounds(128, 162, 89, 38);
		frame.getContentPane().add(btnValidar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(20, 162, 89, 38);
		frame.getContentPane().add(btnCancelar);
		
		textpass = new JPasswordField();
		textpass.setBounds(93, 110, 86, 20);
		frame.getContentPane().add(textpass);
	}
}

