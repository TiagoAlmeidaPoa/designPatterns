package br.fundatec.lp3.lojacelulares.loja;

import br.fundatec.lp3.lojacelulares.celulares.Celular;
import br.fundatec.lp3.lojacelulares.celulares.Iphone;
import br.fundatec.lp3.lojacelulares.celulares.Modelo;
import br.fundatec.lp3.lojacelulares.materialfactory.MaterialFactory;
import br.fundatec.lp3.lojacelulares.materialfactory.MaterialFactoryCentro;

public class LojaCentro extends Loja {

	MaterialFactory materialFactory;

	public LojaCentro() {
		materialFactory = new MaterialFactoryCentro();
	}

	@Override
	protected Celular montarCelular(Modelo modelo) {

		switch (modelo) {
		case IPHONE:
			return new Iphone(materialFactory);
		}

		return null;
	}
	
	@Override
	public String getName() {
		return "IPHONE DO CENTRO";
	}

}
