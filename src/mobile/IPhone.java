package mobile;

import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

//Classe que representa o iPhone, implementando as interfaces

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO VIA APARELHO TELEFÔNICO");	
	}

	@Override
	public void atender(String numero) {
		System.out.println("ATENDENDO VIA APARELHO TELEFÔNICO");
	}

	@Override
	public void iniciarCorreioVoz(String mensagem, String destinatario) {
		System.out.println("TRANSMITINDO ÁUDIO VIA CORREIO DE VOZ");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Página");
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova Aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música");
		
	}
	
}