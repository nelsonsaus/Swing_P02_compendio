/**
 * P3.java
   28 nov 2021 23:21:15
   @author Nelson Sánchez Usero
 */
package swing_c_p02_SanchezUseroNelson;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.*;

/**
 * The Class P3.
 */
public class P3 extends JPanel implements ActionListener, FocusListener, ChangeListener{
	
	/** The picture. */
	JLabel picture;
	
	/** The text 2. */
	JTextArea text, text2;
	
	/** The etitipocama. */
	JLabel titulo,titulo2, etidir, etipro, etifeca, etifefi, pictures, 
		etihues, etidorm, etiba, eticamas, etitipoca, etinin, 
		etiextra, etiprec, etiedades, espacioabajo, etitipocama;
	
	/** The disponible. */
	JTextField direccion, tipocamas, prec, extrastext, disponible;
	
	/** The fecalta. */
	JFormattedTextField fecalta;
	
	/** The fechahoy. */
	DateTimeFormatter fechahoy;
	
	/** The image. */
	ImageIcon imagen1, imagen2, imagen3, image;
	
	/** The tipocama. */
	JComboBox provincia, tipocama;
	
	/** The fefin. */
	LocalDate fefin;
	
	/** The edad ninos. */
	JSpinner huespedes, dormitorios, bannos, camas, edadNinos;
	
	/** The ninos. */
	JCheckBox ninos;
	
	/** The botones. */
	JPanel extras, imagenes, botones;
	
	/** The nuevo. */
	JButton siguiente, imprimir, grabar, nuevo;
	
	/** The layout. */
	GridBagLayout layout;
	
	/** The c. */
	GridBagConstraints c;
	
	/** The cadena. */
	String cadena;
	
	/** The img 1. */
	boolean img1 = true;
	
	/** The img 2. */
	boolean img2 = false;
	
	/** The img 3. */
	boolean img3 = false;
	
	
	/** The resultado. */
	int resultado=0;
	
	/**
	 * Instantiates a new p3.
	 */
	public P3() {
		
		
		
		
		
		
		
		layout = new GridBagLayout();
		this.setLayout(layout);
		c = new GridBagConstraints();
		
		titulo = new JLabel("DATOS RESERVA");
		titulo.setFont(new java.awt.Font("", 1, 15));
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 3;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		this.add(titulo, c);
		
		etidir = new JLabel("Direccion: ");
		etidir.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		//columna:
		c.gridx = 0;
		//fila:
		c.gridy = 1;
		c.weightx = 0;
		c.weighty = 0.4;
		this.add(etidir, c);
		
		direccion = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 1;
		this.add(direccion, c);
		
		
		
		etipro = new JLabel("Provincia: ");
		etipro.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
//		c.weightx = 0;
//		c.weighty = 1;
		this.add(etipro, c);
		
		
		String[] provincias = {"Alava","Albacete","Alicante","Almería","Asturias","Avila","Badajoz","Barcelona","Burgos","Cáceres",
	              "Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
	              "Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
	              "Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
	              "Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
		provincia = new JComboBox<String>(provincias);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 2;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(provincia, c);
		

		
		etifeca  =new JLabel("Fecha de Alta");
		etifeca.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 3;
//		c.weightx = 0;
//		c.weighty = 1;
		this.add(etifeca, c);
		
		
		fecalta = new JFormattedTextField();
		
		fechahoy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		fecalta.setText(fechahoy.format(LocalDateTime.now()));
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 3;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(fecalta, c);
		
		
		
		etifefi = new JLabel("FECHA FIN DISPONIBILIDAD: ");
		etifefi.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 4;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etifefi, c);
		
		fefin = LocalDate.now().plusYears(1);
		disponible = new JTextField(""+fefin);
		disponible.setEditable(false);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 4;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(disponible, c);
		
		
		
		
		etihues = new JLabel("NUMERO HUESPEDES: ");
		etihues.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 5;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etihues, c);
		
		
		int min = 0;
	    int max = 8;
	    int step = 1;
	    int i = 0;
	    SpinnerModel value = new SpinnerNumberModel(i, min, max, step);
	    huespedes = new JSpinner(value);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 5;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(huespedes, c);
	    
	    
	    
		etidorm = new JLabel("NUMERO DORMITORIOS: ");
		etidorm.setForeground(Color.RED);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 6;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etidorm, c);
		
	    min = 0;
	    max = 4;
	    step = 1;
	    i = 0;
	    value = new SpinnerNumberModel(i, min, max, step);
	    dormitorios = new JSpinner(value);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 6;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(dormitorios, c);
		
	    
	    
	    etiba = new JLabel("NUMERO BAÑOS: ");
	    etiba.setForeground(Color.RED);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 7;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etiba, c);
		
	    min = 0;
	    max = 2;
	    step = 1;
	    i = 0;
	    value = new SpinnerNumberModel(i, min, max, step);
	    bannos = new JSpinner(value);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 7;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(bannos, c);
	    
	    
	    eticamas = new JLabel("NUMERO CAMAS: ");
	    eticamas.setForeground(Color.RED);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 8;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(eticamas, c);
		
	    min = 0;
	    max = 4;
	    step = 1;
	    i = 0;
	    value = new SpinnerNumberModel(i, min, max, step);
	    camas = new JSpinner(value);
	    camas.addChangeListener(this);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 8;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(camas, c);
		
		
		
		etitipocama = new JLabel("Tipo Cama: ");
		etitipocama.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 9;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etitipocama, c);
		
		
		String[] camasexist = {"simple","doble","sofa cama"};
		tipocama = new JComboBox<String>(camasexist);
		tipocama.setEnabled(false);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 9;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(tipocama, c);
		

		
		
	    
	    
	    etinin = new JLabel("¿NIÑOS?");
	    etinin.setForeground(Color.RED);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 10;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(etinin, c);
		
	    ninos = new JCheckBox();
	    ninos.setOpaque(false);
	    ninos.addActionListener(this);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 10;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(ninos, c);
	    
	    
	    extras = new JPanel();
	    extras.setBackground(Color.decode("#EDA591"));
	    
	    etiedades = new JLabel("Edad de niños");
	    etiedades.setForeground(Color.RED);
	    
	    min = 0;
	    max = 10;
	    step = 1;
	    i = 0;
	    value = new SpinnerNumberModel(i, min, max, step);
	    edadNinos = new JSpinner(value);
	    
	    
	    
	    edadNinos.setEnabled(false);
	    
	    etiextra = new JLabel("Extras");
	    etiextra.setForeground(Color.RED);
	    extrastext  = new JTextField("", 20);
	    extrastext.setEditable(false);
	    extrastext.addFocusListener(this);
	    
	    
	    extras.add(etiedades);
	    extras.add(edadNinos);
	    extras.add(etiextra);
	    extras.add(extrastext);
	    
	    extras.setVisible(true);
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 11;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(extras, c);
	    
	    
	    imagenes = new JPanel();
	    imagenes.setBackground(Color.decode("#EDA591"));
	    
	    imagen1 = new ImageIcon(getClass().getResource("/recursos/hotel1.png"));
	    imagen2 = new ImageIcon(getClass().getResource("/recursos/hotel2.jpg"));
	    imagen3 = new ImageIcon(getClass().getResource("/recursos/hotel3.png"));
	    
	    picture = new JLabel(imagen1);
		
	    
		image = new ImageIcon(getClass().getResource("/recursos/siguiente.png"));
		siguiente = new JButton(image);
		siguiente.setBorder(null);
		siguiente.setContentAreaFilled(false);
		siguiente.addActionListener(this);
		
		
		imagenes.add(picture);
		imagenes.add(siguiente);
		
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 11;
//		c.weightx = 1;
//		c.weighty = 1;
		this.add(imagenes, c);
		
		
		
		etiprec = new JLabel("Precio Minimo: ");
		etiprec.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 12;
		c.weightx = 1;
		c.weighty = 5;
		this.add(etiprec, c);
		
		
		
		prec = new JTextField();
		prec.addFocusListener(this);
//		prec.setEditable(false);
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 12;
		c.weightx = 7;
		c.weighty = 1;
		this.add(prec, c);
		
		
		
		botones = new JPanel();
		botones.setBackground(Color.decode("#EDA591"));
		
		image = new ImageIcon(getClass().getResource("/recursos/imprimir.png"));
		imprimir = new JButton(image);
		imprimir.setText("IMPRIMIR");
		imprimir.addActionListener(this);
		

		image = new ImageIcon(getClass().getResource("/recursos/guardar.png"));
		grabar = new JButton(image);
		grabar.setText("GRABAR");
		grabar.addActionListener(this);
		

		image = new ImageIcon(getClass().getResource("/recursos/guardar.png"));
		nuevo = new JButton(image);
		nuevo.setText("NUEVO");
		nuevo.addActionListener(this);
		
		botones.add(imprimir);
		botones.add(grabar);
		botones.add(nuevo);
		
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 13;
		c.weightx = 1;
		c.weighty = 5;
		this.add(botones, c);
		
		
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == imprimir) {
			
			P4.panel1.setLayout(layout);
			P4.panel2.setLayout(layout);
			
			text = new JTextArea();
			text.setForeground(Color.WHITE);
			text2 = new JTextArea();
			text2.setForeground(Color.WHITE);
			
			if(P2.nombre.getText().equals("") || P2.apellidos.getText().equals("") || P2.dni.getText().trim().equals("") || P2.tf.getText().trim().equals("")) {

				JOptionPane.showMessageDialog(null, "TE FALTAN CAMPOS !!!", "EEEEYYY!!!!", JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				
				if(ninos.isSelected()) {
					
					cadena = " DIRECCION: " + direccion.getText() + "\n PROVINCIA: " + provincia.getSelectedItem()
							+ "\n FECHA ALTA: " + fecalta.getText() + "\n FIN DISPONIBILIDAD: " + fefin +
							"\n Nº HUESPEDES: " + huespedes.getValue() + "\n Nº DORMITORIOS: " + dormitorios.getValue() +
							"\n NºBAÑOS: " + bannos.getValue() + "\n Nº CAMAS: " + camas.getValue() + "\n NIÑOS: SI" +
							"\n EDAD NIÑOS: " + edadNinos.getValue() + "\n EXTRA NIÑOS: " + extrastext.getText() + 
							"\n PRECIO MINIMO: " + prec.getText();
					
				}else {
					cadena = " DIRECCION: " + direccion.getText() + "\n PROVINCIA: " + provincia.getSelectedItem()
							+ "\n FECHA ALTA: " + fecalta.getText() + "\n FIN DISPONIBILIDAD: " + fefin +
							"\n Nº HUESPEDES: " + huespedes.getValue() + "\n Nº DORMITORIOS: " + dormitorios.getValue() +
							"\n NºBAÑOS: " + bannos.getValue() + "\n Nº CAMAS: " + camas.getValue() + "\n NIÑOS: NO" +
							"\n PRECIO MINIMO: " + prec.getText();
				}
				
				
				
				
				text.setText(cadena);
				text.setBackground(Color.decode("#A3908B"));
				
				c.fill = GridBagConstraints.BOTH;
				c.gridwidth = 3;
				//columna:
				c.gridx = 0;
				//fila:
				c.gridy = 0;
				c.weightx = 1;
				c.weighty = 1;
				P4.panel1.add(text, c);
				
				
				
				
				cadena = " NOMBRE: " + P2.nombre.getText() + "\n APELLIDOS: " + P2.apellidos.getText() + 
						"\n DNI: " + P2.dni.getText() + "\n TELEFONO: " + P2.tf.getText();

				text2.setText(cadena);
				text2.setBackground(Color.decode("#A3908B"));
				c.fill = GridBagConstraints.BOTH;
				c.gridwidth = 3;
				//columna:
				c.gridx = 0;
				//fila:
				c.gridy = 0;
				c.weightx = 1;
				c.weighty = 1;
				P4.panel2.add(text2, c);
				
			}
			
			
			
			
		}
		
		if(e.getSource() == grabar) {
			
			if(P2.nombre.getText().equals("") || P2.apellidos.getText().equals("") || P2.dni.getText().trim().equals("") || P2.tf.getText().trim().equals("")) {

				JOptionPane.showMessageDialog(null, "TE FALTAN CAMPOS !!!", "EEEEYYY!!!!", JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			
		}
		
		if(e.getSource() == nuevo) {

			P2.nombre.setText("");
			P2.apellidos.setText("");
			P2.dni.setText("");
			P2.tf.setText("");
			
			
			direccion.setText("");
			huespedes.setValue(0);
			dormitorios.setValue(0);
			bannos.setValue(0);
			camas.setValue(0);
			ninos.setSelected(false);
			
			P2.nombre.requestFocus();
			
			P4.panel1.removeAll();
			P4.panel2.removeAll();
			
		}
		
		
		if(e.getSource() == siguiente) {
			
			if(!img1 && !img2 && !img3) {
				img1=true;
				picture.setIcon(imagen1);
			}else if(img1 && !img2 && !img3) {
				img2 = true;
				picture.setIcon(imagen2);
			}else if(img1 && img2 && !img3) {
				img1 = false;
				img2 = false;
				picture.setIcon(imagen3);
			}
			
		}
		
		
		if(e.getSource() == ninos) {
			
			if(ninos.isSelected()) {
				
				//PARA EL JSPINNER
				edadNinos.setEnabled(true);

			    extrastext.setEditable(true);
				
			}else {
				
				edadNinos.setEnabled(false);

			    extrastext.setEditable(false);
				
			}

			
		}
		
	}

	/**
	 * Focus gained.
	 *
	 * @param e the e
	 */
	@Override
	public void focusGained(FocusEvent e) {
		
		
		if(e.getSource() == extrastext) {
		
			int num = (Integer)edadNinos.getValue();
			
			if(num <= 3) {
				
				extrastext.setText("cuna");
				
			}else {
				extrastext.setText("cama supletoria pequeña");
			}
		}
		
		
		if(e.getSource() == prec) {
			
			resultado=0;
			
			if(tipocama.isEnabled()) {
				if(tipocama.getSelectedItem().equals("simple")) {
					
					resultado=15;
					
				}else if(tipocama.getSelectedItem().equals("doble")) {
					
					resultado=20;
					
				}else if(tipocama.getSelectedItem().equals("sofa cama")) {
					
					resultado=15;
					
				}

			}
			
			
			if(ninos.isSelected()) {
				
				resultado+=12;
				
			}
			
			
			if((Integer)bannos.getValue()!=0) {
				
				int cantidad=(Integer)bannos.getValue();
				int total = 25*cantidad;
				resultado+=total;
				
			}
			
			
			prec.setText(""+resultado);
			
		}
		
	}

	/**
	 * Focus lost.
	 *
	 * @param e the e
	 */
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		
		if((Integer)camas.getValue()!=0) {
			tipocama.setEnabled(true);
			
		}else {
			tipocama.setEnabled(false);
		}
		
	}
	
	
	
}
