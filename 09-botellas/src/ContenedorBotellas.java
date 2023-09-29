public class ContenedorBotellas {
	// Esta clase simplemente es para controlar los datos de nuestro Objeto y nuestro vector
	
	// Atributos
	private int cantidad;
	private Botella[] botellas;
	
	// Constructor 
	public ContenedorBotellas(int tope) {
		this.cantidad = 0;
		this.botellas = new Botella[tope];
	}
	
	// Tope del vector botellas
	public int getTope() {
		int tope = this.botellas.length;
		return tope ;
	}
	
	// Cantidad de elementos
	public int getCantidad() {
		return cantidad;
	}

	// Me dice si hay lugar en el vector
	public boolean hayLugar() {
		
		boolean hayLugar= this.getCantidad() < this.getTope();
		
		return hayLugar;
	}
	
	// Agregar una botella
	public boolean agregar(Botella botella) {
		
		boolean pudoAgregar = this.hayLugar();
		
		if(pudoAgregar) {
			int primerPosLibre = this.getCantidad();
			this.botellas[primerPosLibre] = botella;
			this.incrementarCantidad();				
		}
		
		return pudoAgregar;
	}

	// Increcmentar la cantidad de elementos
	private void incrementarCantidad() {
		this.cantidad++;
	}
	
	// Obtener una botella por posición
	public Botella obterPorPos(int pos) {
		Botella botellaBuscada = botellas[pos];
		return botellaBuscada;
	}
	
	// Obtener una botella por marca
	public Botella obtenerPorMarca(String marca) {
		
		Botella botellaBuscada = null;
		
		for(int i = 0; i < this.getCantidad(); i++) {
			Botella botellaActual = this.obterPorPos(i);
			
			if(botellaActual.getMarca().equals(marca)) {
				botellaBuscada = botellaActual;
				break;
			} 
		}
		
		return botellaBuscada;
	}
	
	
	
	
}