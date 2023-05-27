///Il pattern Proxy viene utilizzato quando si vuol rappresenta
//la funzionalità di una classe tramite un’altra. 
//Questo tipo di design pattern rientra tra quelli Strutturali.
public class Main {

	public static void main(String[] args) {
		Immagine immagine = new ImmagineProxy("IMG_001.jpg");
		immagine.Mostra();

	}

}
