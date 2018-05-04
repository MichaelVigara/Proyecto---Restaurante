package Inicio;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelI extends JPanel {

	/**
	 * Create the panel.
	 */
	
	ImageIcon imagen;
	String nombre;
	
	public PanelI(String nombre) {
		this.nombre = nombre;
		setLayout(null);
		
		JButton btnNewButton = new JButton("Administracion");
		btnNewButton.setBounds(39, 415, 127, 48);
		add(btnNewButton);
		
		JButton btnRestaurante = new JButton("Restaurante");
		btnRestaurante.setBounds(570, 415, 127, 48);
		add(btnRestaurante);
		

	}
	
	public void paint(Graphics g) {
		Dimension tamano = getSize();
		imagen = new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(),0,0,tamano.width,tamano.height, null);
		setOpaque(false);
		super.paint(g);
	}

}
