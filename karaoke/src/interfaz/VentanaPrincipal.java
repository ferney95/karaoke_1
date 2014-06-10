package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;



public class VentanaPrincipal extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private PanelArtistas panelArtistas;
	private PanelCanciones  panelCanciones;
	private PanelGenero panelGenero;
	private PanelReproduccion panelReproduccion;

	
	
	public VentanaPrincipal(){
		
		
		setTitle("KARAOKE");
		setSize(200,610);
        setBackground(new java.awt.Color(0,0,0));
        setResizable( false );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(7, 0, 70));
		
		panelArtistas = new PanelArtistas();
		panelCanciones = new PanelCanciones();
		panelGenero = new PanelGenero();
		panelReproduccion = new PanelReproduccion();
		
		
		add(panelGenero);
		add(panelCanciones);
		add(panelArtistas);
		add(panelReproduccion);
		
	
	}

	
}
