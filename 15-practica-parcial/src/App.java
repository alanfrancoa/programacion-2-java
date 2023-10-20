import java.util.ArrayList;
import java.util.Scanner;

import menues.MenuAlumnos;
import models.Alumno;

public class App {

	public static void main(String[] args) {
		//Preparacion
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		MenuAlumnos mAlumnos = new MenuAlumnos(sc, listaAlumnos);
		boolean continuar = true;
		
		//Ejecucion
		while(continuar) {
			System.out.println("1-Cargar alumno");
			System.out.println("2-Mostrar alumnos");
			System.out.println("3-Mostrar notas de alumno");
			System.out.println("4-Mostrar por edad");
			System.out.println("5-Mostrar mejor promedio");
			System.out.println("0-Salir");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Agregar alumno");
				mAlumnos.agregarAlumno();
				break;
			}
			case 2: {
				System.out.println("Listado de alumnos y edad");
				mAlumnos.mostrarAlumnos();
				break;
			}
			case 3: {
				System.out.println("Mostrar notas de alumno");
				mAlumnos.buscarAlumno();
				break;
			}
			case 4: {
				System.out.println("Mostrar alumnos por edad");
				mAlumnos.mostrarPorEdad();
				break;
			}
			case 5: {
				System.out.println("Alumno con mejor promedio");
				mAlumnos.mostrarMejorPromedio();
				break;
			}
			case 0: {
				continuar = false;
				break;
			}
			default:
				System.out.println("Opcion incorrecta, intente nuevamente");
			}
		}
		
		sc.close();
	}

}