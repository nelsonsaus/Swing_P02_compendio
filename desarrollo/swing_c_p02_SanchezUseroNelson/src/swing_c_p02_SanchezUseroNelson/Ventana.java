/**
 * Ventana.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;


/**
 * The Class Ventana.
 */
public class Ventana extends JFrame implements ActionListener{
	
	/** The barra menu. */
	JMenuBar barraMenu;
	
	/** The menu ayuda. */
	JMenu menuArchivo, menuRegistro, menuAyuda;
	
	/** The acerca. */
	JMenuItem salir, alta, baja, acerca;
	
	/** The bajapi. */
	JButton altapi, bajapi;
	
	/**
	 * Instantiates a new ventana.
	 */
	public Ventana() {
		super("Gestionar Apartamentos Turisticos AlmeriMar");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamagnoPantalla = miPantalla.getScreenSize();
		
		
		int altoPantalla = tamagnoPantalla.height;
		int anchoPantalla = tamagnoPantalla.width;
		
		
		this.setSize(anchoPantalla / 2, altoPantalla/2);
		
		this.setLocation(anchoPantalla/4, altoPantalla/4);
		
		
		Image miIcono = miPantalla.getImage("src/recursos/anagrama.png");
		
		this.setIconImage(miIcono);
		
		
		
		
		
		salir = new JMenuItem();
		salir.setText("Salir");
		salir.addActionListener(this);
		
		menuArchivo = new JMenu("Archivo");
		menuArchivo.add(salir);

		
		
		
		alta = new JMenuItem();
		alta.setText("Alta Pisos");
		alta.addActionListener(this);
		
		baja = new JMenuItem();
		baja.setText("Baja Pisos");
		baja.addActionListener(this);
		
		menuRegistro = new JMenu("Registro");
		menuRegistro.add(alta);
		menuRegistro.addSeparator();
		menuRegistro.add(baja);
		
		
		
		acerca = new JMenuItem();
		acerca.setText("Acerca de...");
		acerca.addActionListener(this);
		
		menuAyuda = new JMenu("Ayuda");
		menuAyuda.add(acerca);
		
		
		
		barraMenu = new JMenuBar();
		barraMenu.add(menuArchivo);
		barraMenu.add(menuRegistro);
		barraMenu.add(menuAyuda);
		setJMenuBar(barraMenu);
		
		
		altapi = new JButton("Alta Pisos");
		altapi.setMnemonic(KeyEvent.VK_A);
		altapi.addActionListener(this);
		bajapi = new JButton("Baja Pisos");
		bajapi.setMnemonic(KeyEvent.VK_B);
		bajapi.addActionListener(this);
		

		Box horizontalbox = Box.createHorizontalBox();
		horizontalbox.add(Box.createHorizontalGlue());
		horizontalbox.add(altapi);
		
		horizontalbox.add(Box.createRigidArea(new Dimension(50,10)));
		horizontalbox.add(bajapi);
		horizontalbox.add(Box.createHorizontalGlue());
		this.add(horizontalbox, BorderLayout.CENTER);
		

		
		
		this.setVisible(true);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == salir) {
			
			System.exit(0);
			
		}
		
		if (e.getSource() == alta) {
					
			VentanaDialog v = new VentanaDialog();
					
		}
		
		
		if (e.getSource() == baja) {
			
			Mensaje men = new Mensaje();
			
		}
		
		if (e.getSource() == acerca) {
			
			Mensaje2 men2 = new Mensaje2();
			
			
		}
		
		if (e.getSource() == altapi) {
			
			VentanaDialog v = new VentanaDialog();
			
		}
		
		if (e.getSource() == bajapi) {
			
			Mensaje men = new Mensaje();
			
		}
		
	}
	

}
