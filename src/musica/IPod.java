package musica;

public class IPod implements ReprodutorMusical{
	public void tocar() {
    	System.out.println("Tocando Música");
    }
    public void pausar() {
    	System.out.println("Pausar Música");
    }
    public void selecionarMusica() {
    	System.out.println("Selecionando Música");
    }
}
