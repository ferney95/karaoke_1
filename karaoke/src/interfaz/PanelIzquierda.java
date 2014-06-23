package interfaz;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import logica.Autor;
import logica.Genero;

public class PanelIzquierda extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JComboBox<Genero> jcGenero;
	private JComboBox<Autor> jcAutor;
	private JLabel lbMostrarCanciones;
	private JButton jbBuscar;
	
	public PanelIzquierda() {
		
		setSize(600,100);
		
		
		jcGenero = new JComboBox<Genero>();
		jcGenero.setSize(30, 100);
		jcGenero.setBackground(Color.WHITE);
		add(jcGenero);
		
		jcAutor = new JComboBox<Autor>();
		jcAutor.setSize(30, 100);
		jcAutor.setBackground(Color.WHITE);
		add(jcAutor);
		
		lbMostrarCanciones = new JLabel();
		lbMostrarCanciones.setSize(500,100);
		lbMostrarCanciones.setBackground(Color.RED);
		add(lbMostrarCanciones);
		
		jbBuscar = new JButton("Buscar");
		jbBuscar.setSize(40,100);
		add(jbBuscar);
	}

}
