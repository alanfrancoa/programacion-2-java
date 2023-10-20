package menues;

import java.util.ArrayList;
import java.util.Scanner;

import models.Album;
import models.Cancion;

public class MenuAlbumes {
	private Scanner sc;
	private ArrayList<Album> listaAlbumes;
	private boolean continuar;
	
	public MenuAlbumes(Scanner sc, ArrayList<Album> listaAlbumes, boolean continuar) {
		this.sc = sc;
		this.listaAlbumes = listaAlbumes;
		this.continuar = continuar;
	}
	
	public void iniciar() {
		while(continuar) {
			mostrarOpciones();
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:{
				cargarAlbum();
				break;
			}
			case 2:{
				mostrarAlbumes();
				break;
			}
			case 3:{
				buscarAlbum();
				break;
			}
			case 4:{
				albumConMasCanciones();
				break;
			}
			case 5:{
				mostrarCancionMasLarga();
				break;
			}
			case 0:{
				continuar = false;
				break;
			}
			default:{
				System.out.println("Opcion incorrecta, intente nuevamente");
				break;
			}
			}
		}
	}
	
	private void mostrarOpciones() {
		System.out.println("1- Cargar album");
		System.out.println("2- Mostrar albumes");
		System.out.println("3- Mostrar canciones de album");
		System.out.println("4- Mostrar album con mas canciones");
		System.out.println("5- Mostrar cancion mas extensa");
		System.out.println("0- Salir");
	}
	private void cargarAlbum() {
		System.out.println("Nombre del album: ");
		String album=sc.next();
		System.out.println("Nombre del artista: ");
		String artista=sc.next();
		ArrayList<Cancion> listaCanciones = cargarCanciones();
		Album nuevoAlbum = new Album(artista, album, listaCanciones);
		listaAlbumes.add(nuevoAlbum);
	}
	private void mostrarAlbumes() {
		if (listaAlbumes.size() == 0) {
			System.out.println("No hay canciones.");
		} else {
		for (Album album : listaAlbumes) {
			mostrarAlbum(album);
		}
		}
	}
	private void mostrarAlbum(Album album) {
		System.out.println("Titulo: " + album.getNombreAlbum());
		System.out.println("Artista: " + album.getArtista());
	}
	private void buscarAlbum() {
		System.out.println("Ingrese nombre del album: ");
		String nombre = sc.next();
		int buscado = -1;
		for (Album album : listaAlbumes) {
			if(nombre.equals(album.getNombreAlbum())){
				mostrarAlbum(album);
				album.mostrarCanciones(album);
				buscado++;
			}
		}
		if (buscado == -1) {
			System.out.println("Album no encontrado, intente nuevamente");
		}
	}
	private void albumConMasCanciones() {
		Album maximo = null;
		for (Album album : listaAlbumes) {
			if(maximo == null || maximo.cantCanciones() < album.cantCanciones()) {
				maximo = album;
			}
		}
		System.out.println("El album con mas canciones es:");
		mostrarAlbum(maximo);
		System.out.println("Tiene: "+ maximo.cantCanciones() +".");
	}
	private void mostrarCancion(Cancion cancion) {
		System.out.println(cancion.getNro() + "- " + cancion.getNombre() +" duracion: " + cancion.getDuracion() + "segundos ");
	}
	private ArrayList<Cancion> cargarCanciones(){
		ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();
		System.out.println("Cuantas canciones tiene el album?");
		int cantidad = sc.nextInt();
		for(int i = 0; i < cantidad; i++) {
			int nro = i+1;
			System.out.println("Nombre de cancion:");
			String nombre = sc.next();
			System.out.println("Duracion: (en segundos)");
			int duracion = sc.nextInt();
			Cancion cancion = new Cancion(nro, nombre, duracion);
			listaCanciones.add(cancion);
		}
		return listaCanciones;
	}
	private void mostrarCancionMasLarga() {
		Album maximo = null;
		for (Album album : listaAlbumes) {
			if (maximo == null || maximo.cancionMasLarga().getDuracion() < album.cancionMasLarga().getDuracion()) {
				maximo = album;
			}
		}
		System.out.println("El album con la cancion mas larga es: ");
		mostrarAlbum(maximo);
		System.out.println("La cancion mas larga es: ");
		mostrarCancion(maximo.cancionMasLarga());
		System.out.println("===============================");
	}
}