package telefone;

public class SmartPhone implements AparelhoTelefonico{
	@Override
	public void ligar(String numero) {
		System.out.println("Fazer Liga��o");
	}
	@Override
    public void atender(String numero) {
    	System.out.println("Atender a Liga��o");
    }
	@Override
	public void iniciarCorreioVoz(String mensagem, String destinatario) {
    	System.out.println("Enviar Mensagem de Voz");
    }
}
