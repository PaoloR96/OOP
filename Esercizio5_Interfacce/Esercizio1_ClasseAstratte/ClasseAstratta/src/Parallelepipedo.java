
public class Parallelepipedo extends Figura {
	private int lato;
	private double altezza;
	//definisco costruttore di default
	Parallelepipedo(){
		this.lato=0;
	}
	//definisco costruttore parametrico
	Parallelepipedo(int l,int h) {
		this.lato=l;
		this.altezza=h;
	}
	@Override
	public double CalcolaArea() {
		// TODO Auto-generated method stub
		return this.lato*this.lato;
	}

}
