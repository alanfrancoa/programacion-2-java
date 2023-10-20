package models;

public class Notas {
	 private String materia;
	 private double primerNota;
	 private double segundaNota;
	 private double tercerNota;
	 
	public Notas(String materia, double primerNota, double segundaNota, double tercerNota) {
		this.materia = materia;
		this.primerNota = primerNota;
		this.segundaNota = segundaNota;
		this.tercerNota = tercerNota;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getPrimerNota() {
		return primerNota;
	}

	public void setPrimerNota(double primerNota) {
		this.primerNota = primerNota;
	}

	public double getSegundaNota() {
		return segundaNota;
	}

	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}

	public double getTercerNota() {
		return tercerNota;
	}

	public void setTercerNota(double tercerNota) {
		this.tercerNota = tercerNota;
	}
	
	public double getPromedio() {
		return (this.primerNota + this.segundaNota + this.tercerNota)/3;
	}
	 
}
