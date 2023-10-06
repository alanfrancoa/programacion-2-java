package modelos;

public class Sube {
	
	private int id;
	private double saldo;
	
	
	public Sube(int id) {
		this.id = id;
		this.saldo = 30;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}