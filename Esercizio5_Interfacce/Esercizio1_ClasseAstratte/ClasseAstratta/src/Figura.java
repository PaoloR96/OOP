//Realizza un programma che sia in grado di valutare il volume di oggetti tridimensionali 
//come cilindri e parallelepipedi basandosi sul valore della loro area e dell'altezza. 
//Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta .
public abstract class Figura {
	protected double h;
	//dichiaro i metodi
	public abstract double CalcolaArea();
	//definisco i metodi
	public double VolumeFigura() {
		return h*CalcolaArea();
	}
	public void StampaArea() {
		System.out.print(CalcolaArea());
	}
	public void StampaVolume() {
		System.out.print(VolumeFigura());
	}
}
