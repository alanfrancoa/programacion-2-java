package models;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private int edad;
	ArrayList<Notas> listaNotas = new ArrayList<Notas>();
	

	public Alumno(String nombre, int edad, ArrayList<Notas> listaNotas) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaNotas = listaNotas;
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
	public void mostrarNotas() {
		for (Notas notas : listaNotas) {
			System.out.println("Materia: " + notas.getMateria());
			System.out.println("Primer nota: " + notas.getPrimerNota());
			System.out.println("Segunda nota: " + notas.getSegundaNota());
			System.out.println("Tercer nota: " + notas.getTercerNota());
			System.out.println("Promedio: " + notas.getPromedio());
			System.out.println("=================");
		}
	}
	
	public double promedioGeneral() {
		double general = 0;
		for (Notas notas : listaNotas) {
			general+=notas.getPromedio();
		}
		return (general / listaNotas.size());
	}
}
