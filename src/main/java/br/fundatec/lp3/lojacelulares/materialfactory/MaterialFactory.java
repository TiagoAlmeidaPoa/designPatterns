package br.fundatec.lp3.lojacelulares.materialfactory;

import br.fundatec.lp3.lojacelulares.acessorio.Acessorio;
import br.fundatec.lp3.lojacelulares.embalagem.Embalagem;
import br.fundatec.lp3.lojacelulares.tinta.Tinta;

public interface MaterialFactory {

	public Acessorio prepararAcessorio();

	public Tinta prepararTinta();

	public Embalagem prepararEmbalagem();

}
