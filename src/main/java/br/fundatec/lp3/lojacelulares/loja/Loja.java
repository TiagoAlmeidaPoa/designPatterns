package br.fundatec.lp3.lojacelulares.loja;

import br.fundatec.lp3.lojacelulares.celulares.Celular;

public abstract class Loja {
	
	public Celular pedirCelular(String modelo) {
		
		Celular celular = montarCelular(modelo);
		
		celular.preparar();
		celular.colocarAcessorios();
		celular.pintar();
		celular.embalar();
		
		return celular;
		
	}

	protected abstract Celular montarCelular(String modelo);

}
