//Creare un'applicazione Java che istanzi tre
//oggetti di tipo Stagista li memorizzi in un
//array e visualizzare lo stagista più giovane
//(sulla base dell’anno di nascita maggiore).
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona("Russo","Paolo","RSSPLA96A31E932R","Capodrise");
		String c=p1.getCognome();
		String n=p1.getNome();
		String an=p1.AnnoNascita();
		int anno=Integer.parseInt(an);
		System.out.println("cognome della persona:"+c);
		System.out.println("il nome della persona:"+n);
		System.out.println("l'anno di nascita della persona:"+anno);
		System.out.println();
		System.out.println("STAMPA STAGISTA"+" ");
		Stagista s1= new Stagista("Russo","Paolo","RSSPLA96A31E932R","Capodrise",12,20);
		Stagista s2= new Stagista("Pica","Raffaele","PCARFF95B25E932R","Marcianise",20,20);
		Stagista s3= new Stagista("Acconcia","Francesco","CCNFRN99D22E932R","Milano",30,20);
		Stagista vett[]= {s1,s2,s3};
		int min=0,pos=0;
		for(int i=0;i< vett.length;i++) {
			an=vett[i].AnnoNascita();
			anno=Integer.parseInt(an);
			if(anno>min) {
				min=anno;
				pos=i;
			}
			
		}
		System.out.println("Lo stagista piu' giovane è:"+" "+vett[pos].Cognome +" " +vett[pos].Nome + "con data di nascita"+min);
		
		

	}

}
