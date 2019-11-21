package br.fundatec.lp3.lojacelulares.celulares;

public class IphoneCentro extends Celular{

	@Override
	public void preparar() {
		System.out.println("colocando capinha de silicone");
		System.out.println("pintando carcaça prateada");
		System.out.println("colocando na caixa");
		
	}

	@Override
	public void colocarAcessorios() {
		System.out.println("carregador portatil de brinde");
	}

	@Override
	public void pintar() {
		System.out.println("pintar com jato de tinta");
	}

	@Override
	public void embalar() {
		System.out.println("embalando em sacola plastica");
	}

	@Override
	public String getName() {
		return "iphone da loja do centro";
	}

}
