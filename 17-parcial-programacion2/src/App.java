import java.util.ArrayList;
import java.util.Scanner;

import menues.MenuLibros;
import models.Libro;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		boolean continuar = true;
		MenuLibros mLibros = new MenuLibros(sc, listaLibros, continuar);
		
		//ejecutar
		mLibros.iniciar();
				
		System.out.println("Fin de programa");
		sc.close();
		
	}

}