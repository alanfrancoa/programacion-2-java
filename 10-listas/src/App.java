import java.util.ArrayList;
public class App {
    
	public static void main(String[] args) {

	System.out.println("Otro main");
	ArrayList<String> lista = new ArrayList<String>();
	String[] vector = new String[5];
		
	//agregar
	vector[0] = "Gabriel";
	lista.add("Gabriel");
		
	vector[1] = "Noelia";
	lista.add("Noelia");
		
	vector[2] = "Enzo";
	lista.add("Enzo");
		
	//obtener
	String v1 = vector[1];
	String v2 = lista.get(1);
		
	//obtener cant de elementos
	int tamanioVector = vector.length;
	int tamanioLista = lista.size();
	System.out.println(tamanioVector);
	System.out.println(tamanioLista);
		
	//Recorrer
	for(int i=0; i < lista.size(); i++) {
		String nombre = lista.get(i);
		System.out.println(nombre);
	}
		
	//for each
	System.out.println("For each");
	for(String palabra : vector) {
		System.out.println(palabra);
	}
		
	for(String palabra : lista) {
		System.out.println(palabra);
	}

}
}