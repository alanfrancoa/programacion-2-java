public class Botella {
	// Esta clase se encarga de crear y leer objetos de tipo Botella 
	
	// Atributos de la clase
	private String marca;
	private double capacidad;
	private double contenido;
	
	
	// Clase constructora
	public Botella(String marca, double capacidad, double contenido) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.contenido = contenido;
	}

	// Getters y Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
		
}