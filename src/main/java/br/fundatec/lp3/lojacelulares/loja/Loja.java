package br.fundatec.lp3.lojacelulares.loja;

import br.fundatec.lp3.lojacelulares.celulares.Celular;
import br.fundatec.lp3.lojacelulares.celulares.Modelo;

public abstract class Loja {
	
	public Celular pedirCelular(Modelo modelo) {
		
		Celular celular = montarCelular(modelo);
		
		celular.preparar();
		celular.colocarAcessorios();
		celular.pintar();
		celular.embalar();
		
		return celular;
		
	}
	
	public String getName() {
		return "IPHONE";
	}

	protected abstract Celular montarCelular(Modelo modelo);

}
