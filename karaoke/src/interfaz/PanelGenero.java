package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import logica.Genero;

public class PanelGenero extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private JButton seleccionar;
	private JComboBox<Genero> jcGenero;

	 public PanelGenero() {

		setLayout(new GridLayout(1, 2, 40, 10));
		setSize(500,510);
		setBackground(Color.RED);

		jcGenero = new JComboBox<Genero>();
		jcGenero.setSize(20, 78);
		jcGenero.setBackground(Color.WHITE);
		add(jcGenero);

		seleccionar = new JButton("seleccionar");
		seleccionar.setSize(20, 78);
		seleccionar.setBackground(Color.WHITE);
		add(seleccionar);
	}
}
