package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelReproduccion extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel jlCancionActual;

	private JTextField jtCancionActual;

	private JButton jbSeleccionarCancion;
	private JButton jbReproducir;

	public PanelReproduccion() {

		setSize(100,110);
		setBackground(Color.GREEN);
		setLayout(new GridLayout(2, 2, 20, 5));
		jlCancionActual = new JLabel(" cancion actual");
		jlCancionActual.setBackground(Color.WHITE);
		add(jlCancionActual);

		jtCancionActual = new JTextField("                               ");
		jtCancionActual.setEditable(true);
		jtCancionActual.setSize(100,50);
		jtCancionActual.setBackground(Color.white);
		add(jtCancionActual);

		jbSeleccionarCancion = new JButton("seleccionar cancion");
		jbSeleccionarCancion.setSize(20, 78);
		jbSeleccionarCancion.setBackground(Color.WHITE);
		add(jbSeleccionarCancion);

		jbReproducir = new JButton("	Reproducir");
		jbReproducir.setSize(20, 78);
		jbReproducir.setBackground(Color.WHITE);
		add(jbReproducir);


	}

}
