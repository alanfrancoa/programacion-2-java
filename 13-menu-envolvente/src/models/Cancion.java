package models;

public class Cancion {
	private String titulo;
	private int duracion;
	
	public Cancion(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
