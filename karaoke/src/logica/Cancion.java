package logica;

import java.util.ArrayList;

import persistencia.ArchivoPlano;
import persistencia.ArchivosBinarios;

public class Cancion {
	
	private  String nombre;
	private int duracion ;
	private ArrayList<ArchivoPlano> letra;
	private int numeroLineaActual	;
	private String imagen	;

	public Cancion(){
		
	}

	public Cancion(String nombre, int duracion,
			ArrayList<ArchivoPlano> letra, int numeroLineaActual,
			String imagen) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.letra = letra;
		this.numeroLineaActual = numeroLineaActual;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public ArrayList<ArchivoPlano> getLetra() {
		return letra;
	}

	public void setLetra(ArrayList<ArchivoPlano> letra) {
		this.letra = letra;
	}

	public int getNumeroLineaActual() {
		return numeroLineaActual;
	}

	public void setNumeroLineaActual(int numeroLineaActual) {
		this.numeroLineaActual = numeroLineaActual;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
