package models;

public class Empleado {
	private String nombre;
	private double salario;
	private int edad;
	
	public Empleado(String nombre, double salario, int edad) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		String salida = this.nombre + " \n";
		salida += "Salario: $"+this.salario+"\n";
		salida += "Edad: "+this.edad+"\n";
		return salida;
	}
	
}