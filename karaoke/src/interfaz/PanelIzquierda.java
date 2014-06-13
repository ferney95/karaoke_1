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
		
		setSize(500,510);
		setBackground(Color.RED);
		
		jcGenero = new JComboBox<Genero>();
		jcGenero.setSize(20, 78);
		jcGenero.setBackground(Color.WHITE);
		add(jcGenero);
		
		jcAutor = new JComboBox<Autor>();
		jcAutor.setSize(20, 78);
		jcAutor.setBackground(Color.WHITE);
		add(jcAutor);
		
		lbMostrarCanciones = new JLabel();
		
		add(lbMostrarCanciones);
		
		jbBuscar = new JButton("Buscar");
		add(jbBuscar);
	}

}
