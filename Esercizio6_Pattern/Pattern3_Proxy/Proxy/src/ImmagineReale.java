
public class ImmagineReale implements Immagine {
	private String NomeFile;
	
	public ImmagineReale(String nomeFile) {
		this.NomeFile=nomeFile;
		CaricaImmagine(NomeFile);
		
		
	}
	
	void CaricaImmagine(String nomeFile) {
		System.out.println("[IMMAGINEREALE]: caricaImmagine(): " + nomeFile);
		
	}
	@Override
	public void Mostra() {
		System.out.println("[IMMAGINEREALE]: mostra(): " + NomeFile);
		
	}

}
