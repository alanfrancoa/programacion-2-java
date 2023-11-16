package modelos;

public class Cuadrado extends Rectangulo {

	public Cuadrado(int numero, double lado) {
		super(numero, lado, lado);
	}
	
	public void setAltura(double altura) {
		super.setAltura(altura);
		super.setBase(altura);
	}
	
	public void setBase(double base) {
		super.setAltura(base);
		super.setBase(base);
	}
	
}
