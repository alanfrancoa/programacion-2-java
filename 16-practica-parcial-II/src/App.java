import java.util.ArrayList;
import java.util.Scanner;

import menues.MenuAlbumes;
import models.Album;

public class App {

	public static void main(String[] args) {
		//preparar
		Scanner sc = new Scanner(System.in);
		ArrayList<Album> listaAlbumes = new ArrayList<Album>();
		boolean continuar = true;
		MenuAlbumes mAlbumes = new MenuAlbumes(sc, listaAlbumes, continuar);
		
		//Ejecutar
		mAlbumes.iniciar();
	
		System.out.println("Fin de programa");
		sc.close();

	}

}
