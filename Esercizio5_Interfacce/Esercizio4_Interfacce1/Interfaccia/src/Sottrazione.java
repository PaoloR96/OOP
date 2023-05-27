public class Sottrazione extends VideoRisultato implements Operazione {
	protected int risultato=0;
	@Override
	public void Operazione(int a, int b) {
		// TODO Auto-generated method stub
		risultato=a-b;
		
	}

	@Override
	public void StampaRisultato() {
		// TODO Auto-generated method stub
		System.out.print("Il risultato della sottrazione e':"+this.risultato);
		
	}

}
