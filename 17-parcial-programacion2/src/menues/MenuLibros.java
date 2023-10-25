package menues;

import java.util.ArrayList;
import java.util.Scanner;

import models.Libro;

public class MenuLibros {
	private Scanner sc;
	private ArrayList<Libro> listadoLibros;
	private boolean continuar;
	
	public MenuLibros(Scanner sc, ArrayList<Libro> listadoLibros, boolean continuar) {
		this.sc = sc;
		this.listadoLibros = listadoLibros;
		this.continuar = continuar;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public ArrayList<Libro> getListadoLibros() {
		return listadoLibros;
	}

	public void setListadoLibros(ArrayList<Libro> listadoLibros) {
		this.listadoLibros = listadoLibros;
	}

	public boolean isContinuar() {
		return continuar;
	}

	public void setContinuar(boolean continuar) {
		this.continuar = continuar;
	}
	
	public void iniciar() {
		this.continuar = true;
		while(continuar) {
			mostrarOpciones();
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:{
				agregarLibro();
				break;
			}
			case 2:{
				mostrarLibros();
				break;
			}
			case 3:{
				libroMasGrande();
				break;
			}
			case 4:{
				buscarPorTitulo();
				break;
			}
			case 5:{
				buscarPorAnio();
				break;
			}
			case 0:{
				continuar = false;
				break;
			}
			default:{
				System.out.println("Opcion incorrecta, intente nuevamente.");
				break;
			}
			}
			
		}
	}
	
	private void mostrarOpciones() {
		System.out.println("-----MENU-----");
		System.out.println("1- Agregar libro");
		System.out.println("2- Mostrar todos los libros");
		System.out.println("3- Mostrar libro con mas paginas");
		System.out.println("4- Buscar libro");
		System.out.println("5- Mostrar por anio");
		System.out.println("0- Salir");
	}
	
	private void agregarLibro() {
		System.out.println("----- Agregar libro ----- ");
		System.out.println("Ingrese titulo: ");
		String titulo = sc.next();
		System.out.println("Ingrese anio de publicacion: ");
		int anio = sc.nextInt();
		System.out.println("Ingrese cantidad de paginas: ");
		int cantPaginas = sc.nextInt();
		Libro libro = new Libro(titulo, anio, cantPaginas);
		listadoLibros.add(libro);
		
	}
	
	private void mostrarLibros() {
		if(listadoLibros.size() == 0) {
			System.out.println("No hay libros ingresados.");
		} else {
			for (Libro libro : listadoLibros) {
				mostrarLibro(libro);
			}
		}
	}
	
	private void mostrarLibro (Libro libro) {
		System.out.println("----------------");
		System.out.println("Titulo: " + libro.getNombre());
		System.out.println("Anio de publicacion: " + libro.getAnioPublicacion());
		System.out.println("Cantidad de paginas: " + libro.getPaginas());
		System.out.println("----------------");
	}

	private void libroMasGrande() {
		Libro maximo = null;
		for (Libro libro : listadoLibros) {
			if(maximo == null || maximo.getPaginas() < libro.getPaginas()) {
				maximo = libro;
			}
		}
		System.out.println("El libro mas grande es:");
		mostrarLibro(maximo);
	}

	private void buscarPorTitulo() {
		int busqueda = -1;
		System.out.println("Ingrese nombre de libro a buscar:");
		String titulo = sc.next();
		for (Libro libro : listadoLibros) {
			if (libro.getNombre().equalsIgnoreCase(titulo)) {
				busqueda++;
				mostrarLibro(libro);
			}
		}
		if (busqueda == -1) {
			System.out.println("Libro no encontrado.");
		}
	}

	private void buscarPorAnio() {
		int busqueda = -1;
		System.out.println("Ingrese anio de publicacion: ");
		int anioPubli = sc.nextInt();
		for (Libro libro : listadoLibros) {
			if (anioPubli == libro.getAnioPublicacion()) {
				mostrarLibro(libro);
				busqueda++;
			}
		}
		if (busqueda == -1) {
			System.out.println("No he encontrado libros del anio " + anioPubli);
		}
	}
}
