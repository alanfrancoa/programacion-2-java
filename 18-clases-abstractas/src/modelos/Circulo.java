package modelos;

public class Circulo extends FiguraGeometrica {

	private double radio;

	
	
	public Circulo(int numero, String color, double radio) {
		super(numero,color);
		this.radio = radio;
	}
	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getDiametro() {
		return this.radio * 2;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	public char getPrimerLetraColor() {
//		return 'x';
//	}

}
