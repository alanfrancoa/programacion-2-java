public class App {

	public static void main(String[] args) {

		ListadoPerros lista = new ListadoPerros(1);

		Perro perro1 = new Perro("Sultan", "Callejero", 4);
		boolean pudo = lista.agregar(perro1);
		if (pudo) {
			System.out.println("Se agrego bien");
		} else {
			System.out.println("No se agregò");
		}

		Perro perro2 = new Perro("Chicho", "Boxerr", 5);
		pudo = lista.agregar(perro1);
		if (pudo) {
			System.out.println("Se agrego bien");
		} else {
			System.out.println("No se agregò");
		}
		

		Perro perro3 = new Perro("Firu", "Labrador", 8);
		pudo = lista.agregar(perro2);
		if (pudo) {
			System.out.println("Se agrego bien");
		} else {
			System.out.println("No se agregò");
		}
		

		Perro perro4 = new Perro("Pippo", "Shiba inu", 2);
		pudo = lista.agregar(perro4);
		if (pudo) {
			System.out.println("Se agrego bien");
		} else {
			System.out.println("No se agregò");
		}

		for (int i = 0; i < lista.getCantidad(); i++) {
			Perro perroDeTurno = lista.obtener(i);
			System.out.println(perroDeTurno.getNombre());
		}

	}

}
