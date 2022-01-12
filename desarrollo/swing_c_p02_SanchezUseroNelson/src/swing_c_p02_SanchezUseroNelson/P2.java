/**
 * P2.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

/**
 * The Class P2.
 */
public class P2 extends JPanel{
	
	//nombre, apellidos, dni y telefono
	
	/** The espacioabajo. */
	JLabel titulo, etinombre, etiapellidos, etidni, etitf, espacioabajo;
	
	/** The dni. */
	static JFormattedTextField tf, dni;
	
	/** The mascara. */
	MaskFormatter mascara;
	
	/** The apellidos. */
	static JTextField nombre, apellidos;
	
	/** The layout. */
	GridBagLayout layout;
	
	/** The c. */
	GridBagConstraints c;
	
	/**
	 * Instantiates a new p2.
	 */
	public P2() {
		
		layout = new GridBagLayout();
		this.setLayout(layout);
		c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		
		titulo = new JLabel("DATOS PERSONALES");
		titulo.setFont(new java.awt.Font("", 1, 15));
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 0.1;
		this.add(titulo, c);
		
		etinombre = new JLabel("Escribe su nombre: ");
		etinombre.setForeground(Color.YELLOW);
		etinombre.setFont(new java.awt.Font("", Font.BOLD, 30));

		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 0.03;
		this.add(etinombre, c);
		
		
		nombre = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 2;
		c.weightx = 1;
		this.add(nombre, c);
		
		etiapellidos = new JLabel("Escribe sus apellidos: ");
		etiapellidos.setForeground(Color.YELLOW);
		etiapellidos.setFont(new java.awt.Font("", Font.BOLD, 30));
		
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 3;
		c.weightx = 1;
		this.add(etiapellidos, c);
		
		
		apellidos = new JTextField();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 4;
		c.weightx = 1;
		this.add(apellidos, c);
		
		
		etidni = new JLabel("Introduce su DNI: ");
		etidni.setForeground(Color.YELLOW);
		etidni.setFont(new java.awt.Font("", Font.BOLD, 30));
		
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 5;
		c.weightx = 1;
		this.add(etidni, c);
		
		
		
		try {
			mascara = new MaskFormatter("########A");
			dni = new JFormattedTextField(mascara);
			dni.setFocusLostBehavior(JFormattedTextField.COMMIT);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 6;
		c.weightx = 1;
		this.add(dni, c);
		
		
		etitf = new JLabel("Introduce su Telefono: ");
		etitf.setForeground(Color.YELLOW);
		etitf.setFont(new java.awt.Font("", Font.BOLD, 30));
		
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 7;
		c.weightx = 1;
		this.add(etitf, c);
		
		
		
		try {
			mascara = new MaskFormatter("#########");
			tf = new JFormattedTextField(mascara);
			tf.setFocusLostBehavior(JFormattedTextField.COMMIT);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 8;
		c.weightx = 1;
		c.weighty = 0.03;
		this.add(tf, c);
		
		espacioabajo = new JLabel();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		//fila:
		c.gridy = 9;
		c.weighty = 1;
		this.add(espacioabajo, c);
		
		
		
	}

}
