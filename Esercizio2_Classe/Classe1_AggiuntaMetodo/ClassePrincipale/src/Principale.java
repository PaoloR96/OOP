
public class Principale {

	public static void main(String[] args) {
		//istanzio Oggetto Fiat100
		Auto Fiat100 = new Auto();
		Fiat100.Cilindrata=1200;
		System.out.println(" Caratteristiche e Funzionalità Auto Fiat100:");
		System.out.println("Cilindrata:"+Fiat100.Cilindrata);
		Fiat100.StartAuto();
		Fiat100.StopAuto();
		System.out.println();
		//istanzio Oggetto Mini
		Auto Mini = new Auto();
		Mini.Cilindrata=1800;
		System.out.println(" Caratteristiche e Funzionalità Auto Mini:");
		System.out.println("Cilindrata:"+Mini.Cilindrata);
		Mini.StartAuto();
		Mini.StopAuto();
	}

}
