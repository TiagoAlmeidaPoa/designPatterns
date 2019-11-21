package br.fundatec.lp3.lojacelulares.celulares;

public class IphoneIguatemi extends Celular{

	@Override
	public void preparar() {
		System.out.println("colocando capinha de borracha");
		System.out.println("pintando carcaça dourada");
		System.out.println("colocando na caixa");
	}

	@Override
	public void colocarAcessorios() {
		System.out.println("fone sem fio de brinde");
	}

	@Override
	public void pintar() {
		System.out.println("pintar com spray");
	}

	@Override
	public void embalar() {
		System.out.println("embalando em sacola de papelao");
	}

	@Override
	public String getName() {
		return "iphone da loja do iguatemi";
	}

}
