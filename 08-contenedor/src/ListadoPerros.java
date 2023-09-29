
public class ListadoPerros {
	private Perro[] vector;
	private int cantidad;

	public ListadoPerros(int tope) {
		this.cantidad = 0;
		this.vector = new Perro[tope];
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public boolean agregar(Perro perro) {
		boolean puedeAgregar = this.hayLugar();
		if (puedeAgregar) {
			int primerPosicionLibre = this.getCantidad();
			this.vector[primerPosicionLibre] = perro;
			this.incrementarCantidad();
		}
		
		return puedeAgregar;

	}

	public Perro obtener(int posicion) {
		return this.vector[posicion];
	}

	public boolean hayLugar() {
		return this.cantidad < this.vector.length;
	}

	private void incrementarCantidad() {
		this.cantidad++;

	}

}
