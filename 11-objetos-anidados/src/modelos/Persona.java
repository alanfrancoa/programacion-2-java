package modelos;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private Sube sube;
	private Rinon rinon;
    private Scanner celular;
	
	public Persona(String nombre, int edad, Sube sube) {
		this.nombre = nombre;
		this.edad = edad;
		this.rinon = new Rinon(edad); // El riñon es una dependencia fuertemente ligada
		this.sube = sube; // La sube es una dependencia inyectada
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sube getSube() {
		return sube;
	}

	public void setSube(Sube sube) {
		this.sube = sube;
	}

	public Rinon getRinon() {
		return rinon;
	}

	public void setRinon(Rinon rinon) {
		this.rinon = rinon;
	}
    public void saludarAlAdmin() {
		System.out.println("Hola como te llamas?");
		String respuesta = this.celular.next();
		System.out.println("Me alegro que estes bien " + respuesta);
}
	
public Scanner getCelular() {
	return celular;
}

public void setCelular(Scanner celular) {
	this.celular = celular;
}

	
}