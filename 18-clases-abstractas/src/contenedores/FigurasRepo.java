package contenedores;

import java.util.ArrayList;

import modelos.FiguraGeometrica;

public class FigurasRepo {

	private ArrayList<FiguraGeometrica> litaFiguras;

	public FigurasRepo() {
		this.litaFiguras = new ArrayList<FiguraGeometrica>();
	}
	
	
	public boolean agregarFigura( FiguraGeometrica figu ) {
		boolean seAgrego = false;
		
		if(!this.existeFiguraPorNumero(figu.numero)) {
			this.litaFiguras.add(figu);
			seAgrego = true;
		}
		
		return seAgrego;
	}

	public FiguraGeometrica buscarPorNumero(int numeroBuscado) {
		FiguraGeometrica figuraBuscada = null;

		for (FiguraGeometrica figura : this.litaFiguras) {
			if (figura.numero == numeroBuscado) {
				figuraBuscada = figura;
				break;
			}
		}

		return figuraBuscada;
	}
	
	
	public boolean existeFiguraPorNumero(int numero) {
		return this.buscarPorNumero(numero) != null;
	}
	
	public ArrayList<FiguraGeometrica> traerTodas(){
		return new ArrayList<FiguraGeometrica>(this.litaFiguras);
	}
	
	

}
