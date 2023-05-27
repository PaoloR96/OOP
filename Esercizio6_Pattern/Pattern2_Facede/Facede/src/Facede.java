public class Facede  {
		private Figura Cerchio;
		private Figura Rettangolo;
		public Facede() {
			Cerchio = new Cerchio();
			Rettangolo= new Rettangolo();
		}
		public void DisegnaCerchio() {
			System.out.println("[FACADE]: disegnaCerchio()");
			Cerchio.Disegna();
		}
		public void DisegnaRettangolo() {
			System.out.println("[FACADE]: disegnaRettangolo()");
			Rettangolo.Disegna();
		}
}
