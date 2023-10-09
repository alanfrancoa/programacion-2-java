import java.util.ArrayList;
import java.util.Scanner;

import menues.MenuCanciones;
import models.Cancion;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();
		
		MenuCanciones cMenu = new MenuCanciones(sc, listaCanciones);
		
		cMenu.iniciar();
		System.out.println("Fin programa");

	}

}