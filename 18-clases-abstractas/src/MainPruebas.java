import java.util.ArrayList;

import modelos.Circulo;
import modelos.FiguraGeometrica;
import modelos.Rectangulo;

public class MainPruebas {

	
	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo(1,1,1);
		rec.setBase(10);
		rec.setAltura(2);
		rec.setColor("Rojo");
		
		Circulo cir = new Circulo(1,"Azul",7);

		
//		FiguraGeometrica fig = new FiguraGeometrica();
//		
//		fig.setColor("Rojo");
		
		ArrayList<FiguraGeometrica> figuras = 
				new ArrayList<FiguraGeometrica>();
		

		
		figuras.add(cir);
		figuras.add(rec);
		//figuras.add(fig);
		
		for (FiguraGeometrica figu : figuras) {
			
			System.out.println(figu);
			char pri = figu.getPrimerLetraColor();
			System.out.println("Primer letra:" + pri);
			System.out.println("Area: " + figu.getArea());
			
		}
		
		
		
		
	}
}
