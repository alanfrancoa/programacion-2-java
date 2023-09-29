public class App {
    public static void main(String[] args) {
		Rectangulo rec1, rec2;
		rec1 = new Rectangulo();
		rec1.altura = 5;
		rec1.base = 2;
		rec2 = new Rectangulo();
		rec1.base = 100;
		
		rec2.altura = 5;
		rec2.base = 5;
		
		System.out.println("Rectangulo 1");
		System.out.print("Base :");
		System.out.println(rec1.base);
		System.out.print("Altura :");
		System.out.println(rec1.altura);
//		double perimetroDelRectangulo = rec1.base * 2 + rec1.altura * 2;	
		System.out.print("Perimetro :");
		System.out.println(rec1.perimetro());	
		System.out.print("Area :");
		System.out.println( rec1.area() );	
		System.out.println("------------------------");
		System.out.println("Rectangulo 2");
		System.out.print("Base :");
		System.out.println(rec2.base);
		System.out.print("Altura :");
		System.out.println(rec2.altura);
		System.out.print("Perimetro :");
		System.out.println(rec2.perimetro());	
		System.out.print("Area :");
		System.out.println( rec2.area() );	
	}
}
