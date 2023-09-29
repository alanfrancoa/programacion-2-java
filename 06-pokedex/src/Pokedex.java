
public class Pokedex {

	private Pokemon[] pokemones;
	private int cantidad;

	public Pokedex() {
		this.pokemones = new Pokemon[151];
	}

	public int getCantidad() {
		return cantidad;
	}

	public boolean agregarPokemon(Pokemon pokemon) {
		int primerPosLibre = this.getCantidad();
		this.pokemones[primerPosLibre] = pokemon;
		this.incrementarCantidad();
		
		return true;
	}
	
	public Pokemon obtenerPorPosicion(int pos) {
		return this.pokemones[pos];
	}
	
	

	private void incrementarCantidad() {
		this.cantidad++;
		
	}

}
