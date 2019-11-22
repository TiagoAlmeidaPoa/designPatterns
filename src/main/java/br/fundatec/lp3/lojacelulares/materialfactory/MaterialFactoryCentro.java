package br.fundatec.lp3.lojacelulares.materialfactory;

import br.fundatec.lp3.lojacelulares.acessorio.Acessorio;
import br.fundatec.lp3.lojacelulares.acessorio.AcessorioCarregadorPortatil;
import br.fundatec.lp3.lojacelulares.embalagem.Embalagem;
import br.fundatec.lp3.lojacelulares.embalagem.EmbalagemPlastica;
import br.fundatec.lp3.lojacelulares.tinta.Tinta;
import br.fundatec.lp3.lojacelulares.tinta.TintaJato;

public class MaterialFactoryCentro implements MaterialFactory {

	public Acessorio prepararAcessorio() {
		return new AcessorioCarregadorPortatil();
	}

	public Tinta prepararTinta() {
		return new TintaJato();
	}

	public Embalagem prepararEmbalagem() {
		return new EmbalagemPlastica();
	}

}
