
public class Rectangulo {
	//------Atributos------
	public double base;
	public double altura;
	public String color;
	//------Metodos--------
	public double area(){
		//---Como no necesita parametros desde afuera doble ().
		return base * altura;
	}
	public double perimetro() {
		return 2 * (base + altura);
	}
}
