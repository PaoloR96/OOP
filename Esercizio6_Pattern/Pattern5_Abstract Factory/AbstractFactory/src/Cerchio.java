
public class Cerchio implements Figura {
	private final static int raggio = 2;
	private final static double piGreco = 3.14;
	private static double area = 0;
	@Override
	public void Disegna() {
		System.out.println("[CERCHIO] : disegna()");
	}
	@Override
	public void CalcolaArea() {
		 System.out.println("[CERCHIO] : calcolaArea()::start");
	        area = (raggio*raggio)*piGreco;
	        System.out.println("[CERCHIO] : calcolaArea()::end");
	}
	@Override
	public void GetArea() {
		System.out.println("[CERCHIO: area = " + area + " ]");
		
	}

}
