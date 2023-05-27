
public class Rettangolo implements Figura {
	private final int base=2;
	private final int altezza=5;
	private static int area=0;
	//inizializzo construttore
	
	@Override
	public void Disegna() {
		System.out.println("[RETTANGOLO] : disegna()");
		
	}
	@Override
	public void CalcolaArea() {
		 System.out.println("[RETTANGOLO] : calcolaArea()::start");
	        this.area = this.base * this.altezza;
	        System.out.println("[RETTANGOLO] : calcolaArea()::end");
		
	}
	@Override
	public void GetArea() {
		System.out.println("[RETTANGOLO: area = " + this.area + " ]");
		
	}

}
