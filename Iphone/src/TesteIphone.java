
public class TesteIphone {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		
		iphone.AbrirPagina();
		iphone.AtualizarPagina();
		iphone.FecharPagina();
		System.out.println("");
		
		iphone.FazerTelefonema();
		iphone.DesligarTelefonema();
		iphone.OuvirCorreioVoz();
		System.out.println("");


		iphone.TocarMusica();
		iphone.PararMusica();
		iphone.SelecionarMusica();
	} 

	

}
