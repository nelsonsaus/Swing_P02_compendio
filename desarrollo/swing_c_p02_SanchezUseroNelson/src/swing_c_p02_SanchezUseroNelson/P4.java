/**
 * P4.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

/**
 * The Class P4.
 */
public class P4 extends JPanel{
	
	/** The ventanas. */
	JTabbedPane ventanas;
	
	/** The panel 2. */
	static JPanel panel1, panel2;
	
	/** The layout. */
	GridBagLayout layout;
	
	/** The c. */
	GridBagConstraints c;
	
	/**
	 * Instantiates a new p4.
	 */
	public P4() {
		
		layout = new GridBagLayout();
		this.setLayout(layout);
		c = new GridBagConstraints();
		
		ventanas = new JTabbedPane();
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		panel1.setBackground(Color.decode("#A3908B"));
		panel2.setBackground(Color.decode("#A3908B"));
		
		ventanas.addTab("DATOS ARRENDADOR", panel1);
		ventanas.addTab("DATOS INMUEBLE", panel2);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		this.add(ventanas, c);
		
		
	}

}
