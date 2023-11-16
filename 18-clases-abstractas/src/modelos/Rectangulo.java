package modelos;

public class Rectangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Rectangulo(int numero, double base, double altura) {

		super(numero, "Rojo");
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return this.base * this.altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

}
