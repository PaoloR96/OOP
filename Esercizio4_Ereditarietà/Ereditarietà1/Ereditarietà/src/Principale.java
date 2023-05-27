
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona("Paolo", "Russo");
		System.out.print(p1.GetCognome());
		Studente s1= new Studente("Paolo", "Russo");
		s1.SetEsami(5);
		System.out.println();
		System.out.print("Stampa Studente:");
		System.out.println();
		System.out.print(s1.GetCognome()+ " "+ s1.GetNome());
		System.out.println();
		

	}

}
