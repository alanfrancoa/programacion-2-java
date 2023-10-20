package models;

public class Cancion {
	private int nro;
	private String nombre;
	private int duracion;
	

	public Cancion(int nro, String nombre, int duracion) {
		this.nro = nro;
		this.nombre = nombre;
		this.duracion = duracion;
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
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	
}