package modelos;

public abstract class FiguraGeometrica {

	public int numero;
	protected String color;

	public FiguraGeometrica(int numero, String color) {
		this.numero = numero;
		this.color = color;
	}

	public final char getPrimerLetraColor() {
		return this.color.charAt(0);
	}

	public int getNumero() {
		return numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();

}
