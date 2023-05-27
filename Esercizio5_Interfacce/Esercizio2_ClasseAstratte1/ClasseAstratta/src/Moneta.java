import java.util.Random;
public class Moneta extends OggettoAzzardo{

	@Override
	public void LanciaOggetto() {
		int min = 1;
		int max = 2;
		Random random = new Random();
		int value = random.nextInt(max + min) + min;
		System.out.println(value);
		
	}

}
