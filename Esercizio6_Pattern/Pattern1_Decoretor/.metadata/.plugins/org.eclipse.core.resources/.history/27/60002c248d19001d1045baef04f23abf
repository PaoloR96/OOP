public class FiguraRossaDecorator extends FiguraDecorator {

    public FiguraRossaDecorator(Figura figuraDecorata) {
        super(figuraDecorata);
    }

    @Override
    public void disegna() {
        figuraDecorata.disegna();
        aggiungiBordiRossi(figuraDecorata);
    }

    private void aggiungiBordiRossi(Figura figuraDecorata){
        System.out.println("[FIGURAROSSADECORATOR]: Bordo Colore: Rosso");
    }
}