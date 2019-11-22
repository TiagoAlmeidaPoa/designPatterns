package br.fundatec.lp3.lojacelulares.materialfactory;

import br.fundatec.lp3.lojacelulares.acessorio.Acessorio;
import br.fundatec.lp3.lojacelulares.acessorio.AcessorioFone;
import br.fundatec.lp3.lojacelulares.embalagem.Embalagem;
import br.fundatec.lp3.lojacelulares.embalagem.EmbalagemPapelao;
import br.fundatec.lp3.lojacelulares.tinta.Tinta;
import br.fundatec.lp3.lojacelulares.tinta.TintaSpray;

public class MaterialFactoryIguatemi implements MaterialFactory {

	public Acessorio prepararAcessorio() {
		return new AcessorioFone();
	}

	public Tinta prepararTinta() {
		return new TintaSpray();
	}

	public Embalagem prepararEmbalagem() {
		return new EmbalagemPapelao();
	}

}
