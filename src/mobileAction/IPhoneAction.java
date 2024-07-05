package mobileAction;

import mobile.IPhone;
import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class IPhoneAction {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet navegadorInternet = iphone;
		ReprodutorMusical reprodutorMusical = iphone;
		
        aparelhoTelefonico.ligar("12345678"); // Substitua "123456789" pelo número desejado
        navegadorInternet.adicionarNovaAba("www.uol.com.br");
        reprodutorMusical.tocar();
	}
}
