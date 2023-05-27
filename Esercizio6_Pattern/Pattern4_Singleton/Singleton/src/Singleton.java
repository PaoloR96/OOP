
public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {
		
		
	}
	public static Singleton getIstance() {
		stampa();
		return instance;
		
	}
	private static void stampa() {
		System.out.println("[SINGLETON]: OK!");
		
	}

}
