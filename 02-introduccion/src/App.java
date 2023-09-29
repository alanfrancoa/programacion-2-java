public class App {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 11;
		char letra = 'X';
		double conComa = 3.15;

		System.out.printf("%d \n", numero);
		System.out.printf("%C \n", letra);
		System.out.printf("%f \n", conComa);
		System.out.println(conComa); // Deja un salto de linea despues de imprimir
		System.out.println("Probando");
		if (numero == 3) {
			System.out.println("El número ingresado es 3");
		} else {
			System.out.println("El numero no es 3");
		}
		numero++; // Contador numero=numero+1;
		System.out.println(numero);
		numero += 2; // Sumador numero=numero+2;
		System.out.println(numero);

		int acumulador = 0;
		acumulador += numero;
		System.out.println(acumulador);

		int cont = 0;
		while (cont < 5) {
			cont++;
			System.out.print("Contador es:");
			System.out.println(cont);
		}

		for (int i = 0; i < 3; i++) { // Creando dentro del for solo existe en el for SCOOPE
			int tripleDeI = i * 3;
			System.out.println(tripleDeI);
			System.out.print("Iteracion nro: ");
			System.out.println(i);
		}
		int numerin = 9;
		int numeron = 2;
		boolean esPositivo = (numerin > 0);
		boolean esPar = (numerin % 2 == 0);
		System.out.println(esPositivo);
		if (esPositivo && !esPar) {
			System.out.println("El numero es positivo e impar");
		} else {
			System.out.println("El numero es impar");
		}
		System.out.println("Numerin vale: " + (numerin + numeron) + ".");
		System.out.println("Numerin vale: " + numerin + numeron + ".");
		// char letra1 = 'H'; //Comillas simples en Char
		// char letra2 = 'O';
		// char letra3 = 'L';
		// char letra4 = 'A';
		String palabra = "Hola"; // Como es un dato complejo va en MAYUSCULA y comillas dobles "",sino no anda
		System.out.println(palabra);

		// int[] vecty; //primero se crea la variable
		// vecty = new int[4]; //recien creado el vector se define el tamaño
		int[] vecty = new int[4];
		vecty[0] = 0;
		vecty[1] = 3;
		vecty[2] = 7;
		vecty[3] = 4;
		System.out.println("Mi vector mide: " + vecty.length);
		int longitud = vecty.length;
		for (int i = 0; i < longitud; i++) {
			int numeroDeTurno = vecty[i];
			System.out.println(i + " : "+numeroDeTurno);
		}
	}
}
