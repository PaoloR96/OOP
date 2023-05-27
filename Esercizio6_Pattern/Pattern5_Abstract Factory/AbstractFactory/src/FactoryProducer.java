
public class FactoryProducer {
	
	 public static AbstractFactory getFactory(boolean isRettangoloOrQuadrato) {
	        if(isRettangoloOrQuadrato) {
	            return new FiguraFactory();
	        } else {
	            return new GenericFactory();
	        }
	    }

}
