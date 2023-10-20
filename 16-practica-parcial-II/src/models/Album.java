package models;

import java.util.ArrayList;

public class Album {
	private String artista;
	private String nombreAlbum;
	private ArrayList<Cancion> listaCanciones;
	
	public Album(String artista, String nombreAlbum, ArrayList<Cancion> listaCanciones) {
		super();
		this.artista = artista;
		this.nombreAlbum = nombreAlbum;
		this.listaCanciones = listaCanciones;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}
	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}
		
	public void mostrarCanciones(Album album) {
		for (Cancion cancion : listaCanciones) {
			System.out.println(cancion.getNro() + "- " + cancion.getNombre() +" [duracion: " + cancion.getDuracion() + "segundos] ");
		} 
	}
	public int cantCanciones() {
		return (listaCanciones.size());
	}
	
	public Cancion cancionMasLarga() {
		Cancion maximo = null;
		for (Cancion cancion : listaCanciones) {
			if (maximo == null || maximo.getDuracion()<cancion.getDuracion()) {
				maximo = cancion;
			}
		}
		return maximo;
	}
}