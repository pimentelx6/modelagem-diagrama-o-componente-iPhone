package navegador;

public class Chrome implements NavegadorInternet{
	public void exibirPagina(String url) {
		System.out.println("Exibir p�gina");
	}
	
	public void adicionarNovaAba(String url) {
		System.out.println("Nova Aba");
    }

	public void atualizarPagina() {
    	System.out.println("Atualizar P�gina");
    }

}
