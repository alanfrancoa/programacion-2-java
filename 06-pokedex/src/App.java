import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Mostrador mostrador = new Mostrador();
		Scanner sc = new Scanner(System.in);
		Pokedex pokedex = new Pokedex();
		
		boolean continuar = true;
		
		while(continuar) {
			mostrador.mostrarOpciones();
			int opcion = sc.nextInt();
			
			if(opcion==1) {

				System.out.println("Ingrese el numero");
				int numero = sc.nextInt();
				
				System.out.println("Ingrese nombre:");
				String nombre = sc.next();	
				
				System.out.println("Ingrese tipo:");
				String sTipo = sc.next();
				String sTipoMayuscula = sTipo.toUpperCase();
				char cTipo = sTipoMayuscula.charAt(0);
				
				Pokemon nuevoPoke = new Pokemon(numero, cTipo, nombre);

				pokedex.agregarPokemon(nuevoPoke);
				
			}else if(opcion == 2) {

				for(int i = 0; i < pokedex.getCantidad() ; i++) {
					Pokemon pokemonActual = pokedex.obtenerPorPosicion(i);
					mostrador.mostrarPokemon(pokemonActual);
				}
				
				
			}else if(opcion == 0) {
				continuar= false;
			}else {
				System.out.println("Opcion invalida");
			}
		}
		
		
        sc.close();

	}

}
