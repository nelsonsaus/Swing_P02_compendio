/**
 * P1.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import javax.swing.*;
import java.awt.*;

/**
 * The Class P1.
 */
public class P1 extends JPanel{
	
	/** The texto. */
	JLabel texto;
	
	/**
	 * Instantiates a new p1.
	 */
	public P1() {
		
		
		texto = new JLabel("EMPRESA ALMERIMAR");
		
		Color colortext = Color.decode("#EDD991");
		texto.setForeground(colortext);
		texto.setFont(new java.awt.Font("Calibri Light", Font.BOLD, 70));

		this.add(texto);
		
		
	}

}
