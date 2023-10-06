import modelos.Persona;
import modelos.Sube;
public class App {
    public static void main(String[] args) {
		
		Sube sube1 = new Sube(4875);
		
		Persona pepe = new Persona("Pepe", 20, sube1);
		Persona emi = new Persona("Emilia", 27, sube1);
		
		emi.getSube().setSaldo(-500);
		
		double saldo = pepe.getSube().getSaldo();
		
		System.out.println(saldo);

	}
}
