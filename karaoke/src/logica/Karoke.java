package logica;

import java.util.ArrayList;

public class Karoke {

	private  ArrayList<Genero>ListaGeneros	;
	private 	Cancion cancionActual;
	public Karoke() {

	}
	public Karoke(ArrayList<Genero> listaGeneros, Cancion cancionActual) {
		super();
		ListaGeneros = listaGeneros;
		this.cancionActual = cancionActual;
	}
	public ArrayList<Genero> getListaGeneros() {
		return ListaGeneros;
	}
	public void setListaGeneros(ArrayList<Genero> listaGeneros) {
		ListaGeneros = listaGeneros;
	}
	public Cancion getCancionActual() {
		return cancionActual;
	}
	public void setCancionActual(Cancion cancionActual) {
		this.cancionActual = cancionActual;
	}
	

}
