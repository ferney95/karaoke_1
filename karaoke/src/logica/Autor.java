package logica;

import java.util.ArrayList;

public class Autor {

	private String nombre	;
	private  ArrayList<Cancion>listaCanciones	;
	private ArrayList<String> letra;
	private String logo	;
	
	 public Autor() {
	
	}

	public Autor(String nombre, ArrayList<Cancion> listaCanciones,ArrayList<String> letra, String logo) {
		super();
		this.nombre = nombre;
		this.listaCanciones = listaCanciones;
		this.logo = logo;
		this.letra= letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public ArrayList<String> getLetra() {
		return letra;
	}

	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	 
	 

}
