package interfaz;

public class ejemplo {

	private String nombre;
	private String autor;
	private int duracionSegundos;



	public ejemplo(String nombre, String autor, int duracionSegundos) {
		this.autor = autor;
		this.nombre = nombre;
		this.duracionSegundos = duracionSegundos;

	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracionSegundos() {
		return duracionSegundos;
	}

	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}

//	private void toString() {
//		// TODO Auto-generated method stub
//
//	}

	public String obtenerDuracion(){
		int minutos = duracionSegundos / 60;
		int segundos = duracionSegundos % 60;
		return minutos + ":"+ segundos;
	}
}