package logica;

import java.util.ArrayList;

public class Genero {

	private 	String nombre	;
	private ArrayList<Autor> listaAutores;
	private String imagenGenero	;
	public Genero() {

	}
	public Genero(String nombre, ArrayList<Autor> listaAutores,
			String imagenGenero) {
		super();
		this.nombre = nombre;
		this.listaAutores = listaAutores;
		this.imagenGenero = imagenGenero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Autor> getListaAutores() {
		return listaAutores;
	}
	public void setListaAutores(ArrayList<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}
	public String getImagenGenero() {
		return imagenGenero;
	}
	public void setImagenGenero(String imagenGenero) {
		this.imagenGenero = imagenGenero;
	}




}
