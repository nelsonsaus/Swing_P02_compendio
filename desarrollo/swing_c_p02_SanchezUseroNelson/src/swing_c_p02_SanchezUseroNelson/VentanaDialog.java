/**
 * VentanaDialog.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

/**
 * The Class VentanaDialog.
 */
public class VentanaDialog extends JDialog{
	
	/** The layout. */
	private GridBagLayout layout;
	
	/** The c. */
	private GridBagConstraints c;
	
	
	
	/** The p 1. */
	P1 p1;
	
	/** The p 2. */
	P2 p2;
	
	/** The p 3. */
	P3 p3;
	
	/** The p 4. */
	P4 p4;
	
	/**
	 * Instantiates a new ventana dialog.
	 */
	public VentanaDialog() {
		
		this.setTitle("Alta Pisos");

		
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamagnoPantalla = miPantalla.getScreenSize();
		
		
		int altoPantalla = tamagnoPantalla.height;
		int anchoPantalla = tamagnoPantalla.width;
		
		
		this.setSize(anchoPantalla, altoPantalla);
		
		Image miIcono = miPantalla.getImage("src/recursos/anagrama.png");
		
		this.setIconImage(miIcono);
		
		
		layout = new GridBagLayout();
		this.setLayout(layout); 
		c = new GridBagConstraints();
		
		
		p1 = new P1();
		p1.setBackground(Color.decode("#304242"));
		p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		c.fill = GridBagConstraints.HORIZONTAL;
		//como son 3 paneles abajo pues en total ocupta 3 columnas la fila de arriba
		c.gridwidth = 3;
		//para que aparezca en la primera posicion
		c.gridx = 0;
		c.gridy = 0;
		//c.weighty = 0.1;
		//para que ocupe todo el ancho:
		c.weightx = 1;
		this.add(p1, c);
		
		
		
		p2 = new P2();
		p2.setBackground(Color.decode("#4E677A"));
		p2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 1;
		this.add(p2, c);
		
		
		
		
		p3 = new P3();
		p3.setBackground(Color.decode("#EDA591"));
		p3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 1;
		this.add(p3, c);
		
		
		
		p4 = new P4();
		p4.setBackground(Color.decode("#A3908B"));
		p4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 1;
		this.add(p4, c);
		
		
		
		this.setVisible(true);
		
	}

}
