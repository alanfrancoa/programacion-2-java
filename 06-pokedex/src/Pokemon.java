
public class Pokemon {
	private int numero;
	private String nombre;
	private double peso;
	private char tipo;
	private int ataque;



	public Pokemon(int numero, char tipo, String nombre) {

		this.numero = numero;
		this.tipo = tipo;
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	
	public String getTipoCompleto() {
		String resultado = "Desconocido";
		if(this.getTipo() == 'P') {
			resultado = "Planta";
		}else if(this.getTipo() == 'A') {
			resultado = "Agua";
		}else if(this.getTipo() == 'F') {
			resultado = "Fuego";
		}
		
		
		return resultado;
			
	}

}
