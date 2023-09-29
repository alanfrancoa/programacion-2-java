import java.util.Scanner;

public class MenuBotella {
	
	// Aca voy a hacer todas las interacciones con el usuario
	// Voy a hacer las funcionalidades para que el usuario pueda cargar y leer 
	
	
	// Método para crear una botella
	public Botella crearBotella(Scanner sc) {
		
		String marca;
		double capacidad, contenido;
		
		System.out.println("Cual es la marca?");
		marca = sc.next();
		
		System.out.println("Cual es su capacidad máxima?");
		capacidad = sc.nextDouble();
		
		System.out.println("Cuánto contenido debe tener?");
		contenido = sc.nextDouble();
		
		Botella nuevaBotella = new Botella(marca, capacidad, contenido);
		
		return nuevaBotella;
	}
	
	public void mostrarBotella(Botella botella) {
		System.out.println("-----------------------------");
		System.out.println("Marca: " + botella.getMarca());
		System.out.println("Capacidad: " + botella.getCapacidad());
		System.out.println("Contenido: " + botella.getContenido());
		System.out.println("-----------------------------");
		
	}
	
	public void mostarTodasLasBotellas(ContenedorBotellas contenedor) {
		for (int i = 0; i < contenedor.getCantidad(); i++) {
			Botella botellaDeTurno = contenedor.obterPorPos(i);
			
			this.mostrarBotella(botellaDeTurno);
			
		}
	}
	
	// Mostar una botella por marca
	public void mostarPorMarca(Scanner sc, ContenedorBotellas contendor) {
		
		System.out.println("Cuál es la marca buscada?");
		String marcaBuscada = sc.next();
		
		Botella botellaBuscada = contendor.obtenerPorMarca(marcaBuscada);
		
		this.mostrarBotella(botellaBuscada);
	}
	
}