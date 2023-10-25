package models;

public class Libro {
	private String nombre;
	private int anioPublicacion;
	private int paginas;
	
	
	public Libro(String nombre, int anioPublicacion, int paginas) {
		this.nombre = nombre;
		this.anioPublicacion = anioPublicacion;
		this.paginas = paginas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnioPublicacion() {
		return anioPublicacion;
	}


	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}


	public int getPaginas() {
		return paginas;
	}


	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}
