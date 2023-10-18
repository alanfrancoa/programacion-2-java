
import java.util.ArrayList;
import java.util.Scanner;

import menues.MenuEmpleados;
import models.Empleado;

public class App {

	public static void main(String[] args) {
		//Preparacion
		ArrayList<Empleado> listaEmpleados =new ArrayList<Empleado>();
		Scanner sc = new Scanner(System.in);
		
		MenuEmpleados mEmpleados = new MenuEmpleados(sc, listaEmpleados);
		
		boolean continuar = true;
		//Ejecucion
		while(continuar) {
			System.out.println("Elija una opcion:");
			System.out.println("1- Agregar empleado");
			System.out.println("2- Mostrar empleados");
			System.out.println("3- Mostrar empleado con mayor sueldo");
			System.out.println("4- Mostrar empleados segun edad");
			System.out.println("0-Salir");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				mEmpleados.cargarEmpleado();
				break;
			}
			case 2: {
				mEmpleados.mostrarEmpleados();
				break;
			}
			case 3:
				mEmpleados.maximoSalario();
				break;
			case 4:
				mEmpleados.mostrarPorEdad();
				break;
			case 0:
				continuar = false;
                break;
			default:
				System.out.println("Opcion Invalida");
				break;
			}
			
		}
	}

}