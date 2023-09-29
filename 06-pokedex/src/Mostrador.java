
public class Mostrador {

	public void mostrarPokemon(Pokemon pokemonAMostrar) {
		System.out.println("Numero:" + pokemonAMostrar.getNumero());
		System.out.println("Nombre:" + pokemonAMostrar.getNombre());
		System.out.println("Tipo:" + pokemonAMostrar.getTipoCompleto());
		System.out.println("-------------");
	}

	public void mostrarOpciones() {
		System.out.println("Elija una opcion:");
		System.out.println("1 - Agregar");
		System.out.println("2 - Mostrar todos");
		System.out.println("0 - Salir");

	}
}
