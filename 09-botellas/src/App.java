import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Solo la voy a usar para llamar distintas funcionalidades del menu
		
		Scanner sc = new Scanner(System.in);
		MenuBotella menu = new MenuBotella();
		ContenedorBotellas botellas = new ContenedorBotellas(10);
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("Elija una opción");
			System.out.println("1 - AGREGAR UNA BOTELLA ");
			System.out.println("2 - MOSTRAR TODAS LAS BOTELLAS");
			System.out.println("3 - SALIR DEL PROGRAMA");
			int opcion;
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:{
					Botella nuevaBotella = menu.crearBotella(sc);
					boolean pudo = botellas.agregar(nuevaBotella);
					if(pudo) {
						System.out.println("Botella agregada con éxito");
					}else {
						System.out.println("No se pudo agregar");
					}
				} break;
				
				case 2:{
					menu.mostarTodasLasBotellas(botellas);
				} break;
			
				case 3:{
					menu.mostarPorMarca(sc, botellas);
				} break;
				
				case 4:{
					continuar = false;
				} break;

				default:{
					System.out.println("Ha ingresado una opción inválida, inténtelo de nuevo");
				}break;
			}
		}
		
		System.out.println("Has salido del programa");
		
		
		sc.close();

	}

}