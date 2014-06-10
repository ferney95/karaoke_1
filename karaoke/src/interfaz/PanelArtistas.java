package interfaz;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;

import logica.Autor;

public class PanelArtistas  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton seleccionar;
	private JComboBox<Autor> jcomAutor;

	public PanelArtistas() {


		setSize(100,110);
		setBackground(Color.YELLOW);
		setLayout(new GridLayout(1, 2, 40, 10));
		jcomAutor = new JComboBox<Autor>();
		jcomAutor.setSize(20, 78);
		jcomAutor.setBackground(Color.WHITE);
		
		add(jcomAutor);

		seleccionar = new JButton("seleccionar artista");
		seleccionar.setSize(20, 78);
		seleccionar.setBackground(Color.CYAN);
		add(seleccionar);





	}

}
