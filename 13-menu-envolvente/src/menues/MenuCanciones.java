package menues;

import java.util.ArrayList;
import java.util.Scanner;
import models.Cancion;

public class MenuCanciones {
	private boolean activo = true;
	private Scanner _sc;
	private ArrayList<Cancion> listaCanciones;
	
	public MenuCanciones( Scanner _sc, ArrayList<Cancion> listaCanciones) {
		this._sc = _sc;
		this.listaCanciones = listaCanciones;
	}
	
	private void finalizar() {
		this.activo = false;
	}
	//generico
	public void iniciar() {
		System.out.println("Se inicio el menu");
		while(this.activo) {
			int op = elegirOpcion();
			realizarOpcion(op);
			}
		}
	
	private int elegirOpcion() {
		this.mostrarOpciones();
		int opcion = _sc.nextInt();
		return opcion;
	}
	
	private void mostrarOpciones() {
		System.out.println("Elija opcion");
		System.out.println("1 - Cargar");
		System.out.println("2 - Mostrar");
		System.out.println("3 - Buscar por nombre");
		System.out.println("4 - Mostrar cancion mas larga");
		System.out.println("5 - Mostrar canciones de mas de dos minutos");
		
		System.out.println("0-Salir");
	}
	
	private void realizarOpcion(int opcion) {
		switch (opcion) {
		case 1: {
			this.cargarCancion();
			break;
		}
		case 2: {
			this.mostrarCanciones();
			break;
		}
		case 3:
			this.buscarPorNombre();
			break;
		case 4:{
			this.buscarCancionMasLarga();
			break;
		}
		case 5:{
			this.mostrarMasDeDosMinutos();
			break;
		}
		case 0: {
			this.finalizar();
			break;
		}
		default:{
			System.out.println("Opcion incorrecta");
			break;
		}
		}
	}
	private void MostrarCancion(Cancion cancion) {
		System.out.println(cancion.getTitulo());
		System.out.println("Duracion: " + cancion.getDuracion());
		
	}
	private void cargarCancion() {
		System.out.println("Ingrese el titulo: ");
		String titulo = _sc.next();
		System.out.println("Ingrese duracion:");
		int duracion = _sc.nextInt();
		
		Cancion nuevaCancion = new Cancion (titulo, duracion);
		this.listaCanciones.add(nuevaCancion);
		
	}
	
	private void mostrarCanciones() {
		if (this.listaCanciones.isEmpty()) {
			System.out.println("No hay canciones.");
		} else {
			for (Cancion cancion : this.listaCanciones) {
				this.MostrarCancion(cancion);
			}
		}
	}
	private void buscarPorNombre() {
		System.out.println("Ingrese nombre a buscar: ");
		String nombreBuscado = this._sc.next();
		Cancion cancionBuscada = null;
		
		for(Cancion cancion : listaCanciones) {
			if (cancion.getTitulo().equalsIgnoreCase(nombreBuscado)) {
				cancionBuscada = cancion;
				break;
			}
		}
		if (cancionBuscada != null) {
			this.MostrarCancion(cancionBuscada);
		} else {
			System.out.println("No existe la cancion "+ nombreBuscado);
		}
	}
	private void buscarCancionMasLarga() {
		Cancion maxCancion = null;
		for (Cancion cancion : listaCanciones) {
			if(maxCancion == null || cancion.getDuracion() > maxCancion.getDuracion()) {
				maxCancion = cancion;
			}}
		if (maxCancion != null) {
			this.MostrarCancion(maxCancion);
		} else {
			System.out.println("Lista vacia");

		}
	}
	private void mostrarMasDeDosMinutos() {
		for (Cancion cancion: listaCanciones) {
			if(cancion.getDuracion() > 120) {
				this.MostrarCancion(cancion);
			}
		}
	}
}    

