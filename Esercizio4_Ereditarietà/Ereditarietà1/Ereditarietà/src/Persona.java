//Creare una classe di nome Persona con le variabili di istanza: nome, cognome di tipo stringa.
//La classe deve contenere un costruttore
//parametrico; i metodi get Nome e getCognome.
public class Persona {
	protected String Nome;
	protected String Cognome;
	public Persona(String nome, String cognome) {
				this.Cognome=cognome;
				this.Nome=nome;
	}
	public String GetNome() {
		return Nome;
	}
	public String GetCognome() {
		return Cognome;
	}
					
	

}
