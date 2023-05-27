
public class Main {

	public static void main(String [] args) {
		//istanzio la classe esterna
		ClasseEsterna Ce = new ClasseEsterna();
		//istanzio la classe interna
		ClasseEsterna.ClasseInterna Ci= Ce.new ClasseInterna();
		Ci.metodoIterno();
		
	
	
	}
		}