
public class GenericFactory extends AbstractFactory {

	@Override
	public Figura GetFigura(String Figura) {
		// TODO Auto-generated method stub
		return new Cerchio();
	}

}
