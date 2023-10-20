package menues;

import java.util.ArrayList;
import java.util.Scanner;

import models.Alumno;
import models.Notas;

public class MenuAlumnos {
	private Scanner sc;
	private ArrayList<Alumno> listaAlumnos;
	
	public MenuAlumnos(Scanner sc, ArrayList<Alumno> listaAlumnos) {
		super();
		this.sc = sc;
		this.listaAlumnos = listaAlumnos;
	}
	

	public void agregarAlumno() {
		System.out.println("Ingrese nombre del alumno:");
		String nombre = sc.next();
		System.out.println("Ingrese edad:");
		int edad = sc.nextInt();
		ArrayList<Notas> listaNotas = agregarNotas();
		
		Alumno alumno = new Alumno(nombre, edad, listaNotas);
		listaAlumnos.add(alumno);
	}
	
	public ArrayList<Notas> agregarNotas(){
		ArrayList<Notas> listaNotas =new ArrayList<Notas>();
		boolean cont = true;
		while(cont) {
			System.out.println("Ingrese asignatura: ");
			String asignatura = sc.next();
			System.out.println("Ingrese 1er nota: ");
			double nota1 = sc.nextDouble();
			System.out.println("Ingrese 2da nota: ");
			double nota2 = sc.nextDouble();
			System.out.println("Ingrese 3er nota: ");
			double nota3 = sc.nextDouble();
			Notas notas = new Notas(asignatura, nota1, nota2, nota3);
			listaNotas.add(notas);
			System.out.println("Desea continuar?  1-SI / 2-NO");
			int respuesta = sc.nextInt();
			if(respuesta == 2) {
				cont = false;
			}
		}
		return listaNotas;
	}
	
	public void mostrarAlumno(Alumno alumno) {
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Edad: "+ alumno.getEdad());
	}
	
	public void mostrarAlumnos() {
		if (listaAlumnos.size() == 0) {
			System.out.println("No hay alumnos ingresados, ingrese uno.");
		} else {
		for (Alumno alumno : listaAlumnos) {
			mostrarAlumno(alumno);
			System.out.println("----------------");
		}}
	}
	
	public void buscarAlumno() {
		int busqueda = -1;
		System.out.println("Ingrese nombre: ");
		String nombre = sc.next();
		for (Alumno alumno : listaAlumnos) {
			if (nombre.equals(alumno.getNombre())) {
				mostrarAlumno(alumno);
				alumno.mostrarNotas();
				busqueda++;
			}
		}
		if(busqueda == -1) {
			System.out.println("Nombre no encontrado");
		}
	}

	
	public void mostrarMejorPromedio() {
		 Alumno maximo = null;
		for (Alumno alumno : listaAlumnos) {
			if (maximo == null || alumno.promedioGeneral() > maximo.promedioGeneral()) {
				maximo = alumno;
			}
		}
		mostrarAlumno(maximo);
		System.out.println("Promedio: " + maximo.promedioGeneral());
	}
	
	public void mostrarPorEdad() {
		System.out.println("Ingrese edad:");
		int edad = sc.nextInt();
		int cant = 0;
		for (Alumno alumno : listaAlumnos) {
			 if(edad == alumno.getEdad()) {
				 mostrarAlumno(alumno);
				 cant ++;
			 }
		}
		if (cant == 0) {
			System.out.println("No hay alumnos con la edad ingresada.");
		}
	}
	
}