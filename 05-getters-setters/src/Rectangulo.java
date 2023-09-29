public class Rectangulo {
	private String nombre;
	private double base;
	private double altura;
	private int nroTarjeta;
	
	/*Metodos*/
	public double getBase(){
		return this.base;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int ultimoNroTarjeta(){
		return this.nroTarjeta % 10;
	}
	
	public void setAltura(double nuevaAltura) {
		this.altura = nuevaAltura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}