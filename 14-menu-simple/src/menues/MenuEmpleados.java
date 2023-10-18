package menues;
import java.util.ArrayList;
import java.util.Scanner;

import models.Empleado;
public class MenuEmpleados {
	
	private Scanner sc;
	private ArrayList<Empleado> listaEmpleados;
	
	public MenuEmpleados(Scanner sc, ArrayList<Empleado> listaEmpleados) {
		super();
		this.sc = sc;
		this.listaEmpleados = listaEmpleados;
	}
	
	public void cargarEmpleado() {
		System.out.println("Ingrese nombre del empleado");
		String nombre = sc.next();
		
		System.out.println("Ingrese la edad del empleado");
		int edad = sc.nextInt();
		System.out.println("Ingrese salario del empleado");
		double salario = sc.nextDouble();
		
		Empleado emple = new Empleado(nombre, salario, edad);
		
		listaEmpleados.add(emple);
	}
	
	public void mostrarEmpleados() {
		if(listaEmpleados.size()==0) {
			System.out.println("No hay empleados.");
		} else {
			for (Empleado empleado : listaEmpleados) {
				System.out.println(empleado);
				System.out.println("---------------------");
			}
		}
	}
	
	public void maximoSalario() {
		Empleado maximo = null;
		for (Empleado empleado : listaEmpleados) {
			if (maximo == null  || empleado.getSalario() > maximo.getSalario()) {
				maximo = empleado;
			}
		}
		System.out.println("El empleado con mayor salario es: ");
		System.out.println(maximo);	
	}
	public void mostrarPorEdad() {
		System.out.println("Ingrese edad: ");
		int edad = sc.nextInt();
		for (Empleado empleado : listaEmpleados) {
			if(edad == empleado.getEdad()) {
				System.out.println(empleado);
			}
		}
	}
	
}

