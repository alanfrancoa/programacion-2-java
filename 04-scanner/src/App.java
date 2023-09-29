import java.util.Scanner; //importar clase

public class App {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in); //creamos el objeto sc para usar el scanner, uno solo.
	 
	 Rectangulo jorge = new Rectangulo();
	 System.out.println("Ingrese edad: ");
	 int edad = sc.nextInt(); //Obtiene siguiente entero ingresado por usuario.
	 System.out.println("Su edad es "+ edad);
	 
	 System.out.print("Ingrese base: ");
	 jorge.base = sc.nextDouble();
	 System.out.println("-------------------");
	 System.out.print("Ingrese altura: ");
	 jorge.altura = sc.nextDouble();
	 System.out.println("-------------------");
	 System.out.print("El area es: ");
	 System.out.println(jorge.area());
	 System.out.println("-------------------");
	 System.out.print("El perimetro es: ");
	 System.out.println(jorge.perimetro());
	 
	 sc.close();// se recomienda cerrar el scanner al final, no es obligatorio
	}
}
