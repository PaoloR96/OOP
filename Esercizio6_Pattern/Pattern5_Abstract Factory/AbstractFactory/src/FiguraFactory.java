
public class FiguraFactory extends AbstractFactory {

	@Override
	public Figura GetFigura(String Figura) {
		if("RETTANGOLO".equalsIgnoreCase(Figura)) {
			return new Rettangolo();
		}
		if("CERCHIO".equalsIgnoreCase(Figura)) {
			return new Cerchio();
		}
		
		return null;
	}

}
