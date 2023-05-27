public class ClasseEsterna {
		private String stringaEst = "esterna";
		//classe Innestata
		public class ClasseInterna {
			private String stringaInt = "interna";
			public void metodoIterno() {
				System.out.println(ClasseEsterna.this.stringaEst +" " + ClasseInterna.this.stringaInt);
			}
		}
}
