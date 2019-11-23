package br.fundatec.lp3.lojacelulares.celulares;

import br.fundatec.lp3.lojacelulares.acessorio.Acessorio;
import br.fundatec.lp3.lojacelulares.embalagem.Embalagem;
import br.fundatec.lp3.lojacelulares.materialfactory.MaterialFactory;
import br.fundatec.lp3.lojacelulares.tinta.Tinta;

public class Iphone extends Celular{
	
	private MaterialFactory materialFactory;
	private Acessorio acessorio;
	private Tinta tinta;
	private Embalagem embalagem;
	
	public Iphone(MaterialFactory materialFactory) {
		this.materialFactory = materialFactory;
	}

	@Override
	public void preparar() {
		acessorio = materialFactory.prepararAcessorio();
		tinta = materialFactory.prepararTinta();
		embalagem = materialFactory.prepararEmbalagem();
		
		System.out.println("Preparando Iphone");
		System.out.println("Adicionando " + acessorio.descricao());
		System.out.println("Adicionando " + tinta.descricao());
		System.out.println("Adicionando " + embalagem.descricao());
	}

	@Override
	public void colocarAcessorios() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void embalar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nome() {
		// TODO Auto-generated method stub
		
	}

}
