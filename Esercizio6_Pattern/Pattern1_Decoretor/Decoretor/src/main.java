////Il pattern Decorator consente all’utente di aggiungere nuove funzionalità ad un oggetto 
//esistente senza alterarne la struttura. Questo tipo di design pattern rientra nei pattern Strutturali,
//poiché funge da involucro per la classe esistente.
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura circle = new Cerchio();
		Figura redCircle = new FiguraRossaDecorator(new Cerchio());
		System.out.println("Cerchio Normale");
		circle.disegna();
		System.out.println("Cerchio Rosso");
		redCircle.disegna();
		
		

	}

}