
public class Addizione extends VideoRisultato  implements Operazione {
	protected int risultato=0;
	@Override
	public void Operazione(int a, int b) {
		// TODO Auto-generated method stub
		this.risultato=a+b;
	}
	@Override
	public void StampaRisultato() {
		System.out.print("Il risultato della somma e':"+this.risultato);
		
	}
	
}
