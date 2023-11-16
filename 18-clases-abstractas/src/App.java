import java.util.Scanner;

import contenedores.FigurasRepo;
import menues.FigurasMenu;

public class App {
	public static void main(String[] args) {
		FigurasRepo repo = new FigurasRepo();
		Scanner sc = new Scanner(System.in);
		
		FigurasMenu fMenu = new FigurasMenu(sc, repo);
		
		fMenu.iniciar();
	}
}
