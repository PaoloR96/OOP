package Principale;

public class Principale {

	public static void main(String[] args) {
		//istanzio la classe Punto p1
		Punto p1 = new Punto();
		p1.x=5;
		p1.y=10;
		System.out.println("l'oggetto Punto1 presenta le seguenti coordinate-->("+p1.x+","+p1.y+")");
		//istanzio la classe Punto p2
		Punto p2 = new Punto();
		p2.x=15;
		p2.y=100;
		System.out.println("l'oggetto Punto2 presenta le seguenti coordinate-->("+p2.x+","+p2.y+")");
		
	}

}
