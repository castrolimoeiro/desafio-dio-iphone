
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void AbrirPagina() {
		System.out.println("Abrindo página de internet");
	}

	@Override
	public void AtualizarPagina() {
		System.out.println("Atualizando pagina de internet");
	}

	@Override
	public void FecharPagina() {
		System.out.println("Fechando pagina de internet");
	}

	@Override
	public void FazerTelefonema() {
		System.out.println("Fazendo telefonema");
	}

	@Override
	public void DesligarTelefonema() {
		System.out.println("Desligando telefonema");
	}

	@Override
	public void OuvirCorreioVoz() {
		System.out.println("Ouvindo correio de voz");
	}

	@Override
	public void TocarMusica() {
		System.out.println("Tocando Musica");
	}

	@Override
	public void PararMusica() {
		System.out.println("Parando música");
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando música");

	}

}
