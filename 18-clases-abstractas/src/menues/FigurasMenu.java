package menues;

import java.util.ArrayList;
import java.util.Scanner;

import contenedores.FigurasRepo;
import modelos.Circulo;
import modelos.FiguraGeometrica;
import modelos.Rectangulo;

public class FigurasMenu {

	private Scanner sc;
	private FigurasRepo contenedor;
	private boolean continuar;

	public FigurasMenu(Scanner sc, FigurasRepo contenedor) {
		super();
		this.sc = sc;
		this.contenedor = contenedor;
	}

	public void iniciar() {
		this.continuar = true;
		while (this.continuar) {
			String opcion = this.obtenerOpcion();
			this.realizarAccion(opcion);
		}
	}

	private String obtenerOpcion() {
		this.mostrarOpciones();
		String opcion = sc.next();

		return opcion;
	}

	private void mostrarOpciones() {
		System.out.println("Elija");
		System.out.println("1. agregar");
		System.out.println("2. mostras");
	}

	private void realizarAccion(String opcion) {
		switch (opcion) {
		case "1":
			this.opAgregar();
			break;
		case "2":
			this.opMostrar();
			break;

		default:
			break;
		}

	}

	private void opMostrar() {

		ArrayList<FiguraGeometrica> figuras = contenedor.traerTodas();

		for (FiguraGeometrica figu : figuras) {
			System.out.println(figu);
			char pri = figu.getPrimerLetraColor();
			System.out.println("Primer letra:" + pri);
			System.out.println("Area: " + figu.getArea());

		}

	}

	private void opAgregar() {

		System.out.println("Que desea agregar? ");
		System.out.println("1. Rectangulo");
		System.out.println("2. Circulo");

		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			this.agregarRectangulo();
			break;
		case 2:
			this.agregarCirculo();
			break;

		default:
			break;
		}

	}

	private void agregarCirculo() {

		System.out.println("Numero:");
		int numero = sc.nextInt();

		System.out.println("Color:");
		String color = sc.next();

		System.out.println("Radio");
		double radio = sc.nextDouble();

		Circulo nuevoCirculo = new Circulo(numero, color, radio);

		boolean a = this.contenedor.agregarFigura(nuevoCirculo);

		if (a) {
			System.out.println("Se agregò piiiola");
		} else {
			System.out.println("No se agrego :(");
		}
	}

	private void agregarRectangulo() {

		System.out.println("Numero:");
		int numero = sc.nextInt();

		System.out.println("base");
		double base = sc.nextDouble();

		System.out.println("altura");
		double altura = sc.nextDouble();

		Rectangulo nuevoRectangulo = new Rectangulo(numero, base, altura);

		boolean a = this.contenedor.agregarFigura(nuevoRectangulo);
		if (a) {
			System.out.println("Se agregò piiiola");
		} else {
			System.out.println("No se agrego :(");
		}
	}

}
