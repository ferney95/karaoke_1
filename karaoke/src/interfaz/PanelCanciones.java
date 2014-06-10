package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import logica.Cancion;

public class PanelCanciones extends JPanel{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton seleccionar;
	private JComboBox<Cancion> jcCanciones;

	public PanelCanciones() {


		setSize(100,110);
		setBackground(Color.ORANGE);
		setLayout(new GridLayout(1, 2, 60, 10));

		jcCanciones = new JComboBox<Cancion>();
		jcCanciones.setSize(20, 78);
		jcCanciones.setBackground(Color.WHITE);
		add(jcCanciones);

		seleccionar = new JButton("seleccionar cancion");
		seleccionar.setBackground(Color.BLUE);
		seleccionar.setSize(20, 78);
		add(seleccionar);

	
	}
}
