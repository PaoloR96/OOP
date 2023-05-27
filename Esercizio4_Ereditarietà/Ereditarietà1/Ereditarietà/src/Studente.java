// Costruire una sottoclasse di Persona,
//chiamata Studente, che contiene le variabili
//di istanza: matricola ed esami, che registra il
//numero di esami sostenuti, e devono essere
//entrambe di tipo intero.
//• La sottoclasse deve contenere un costruttore
//parametrico ed i metodi set e get

public class Studente extends Persona {
	protected int matricola;
	protected int esami;
	public Studente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}
	public double GetMatricola() {
		return matricola;
	}
	public void SetEsami(int esame) {
		this.esami=esame;
	}
	public double GetEsami() {
		return esami;
	}

}
