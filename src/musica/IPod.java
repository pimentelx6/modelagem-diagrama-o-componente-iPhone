package musica;

public class IPod implements ReprodutorMusical{
	public void tocar() {
    	System.out.println("Tocando M�sica");
    }
    public void pausar() {
    	System.out.println("Pausar M�sica");
    }
    public void selecionarMusica() {
    	System.out.println("Selecionando M�sica");
    }
}
