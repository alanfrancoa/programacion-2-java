
public class Perro {
	private String nombre;
	private String raza;
	private int edad;
	
	public Perro (String nombre, String raza, int edad) {
		System.out.println("Se ha creado perro " + nombre);
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
