public class App {
    public static void main(String[] args) {
	
		Rectangulo rec = new Rectangulo();
		rec.setNombre("Jorgito");
		System.out.println(rec.getNombre());
		System.out.println(rec.getBase());
		System.out.println(rec.getAltura());
		rec.setAltura(7.5);
		System.out.println(rec.getAltura());
		System.out.println("El ultimo de la tarjeta es: " + rec.ultimoNroTarjeta());
		
	}
}
