package br.fundatec.lp3.lojacelulares;

import br.fundatec.lp3.lojacelulares.celulares.Modelo;
import br.fundatec.lp3.lojacelulares.loja.Loja;
import br.fundatec.lp3.lojacelulares.loja.LojaCentro;
import br.fundatec.lp3.lojacelulares.loja.LojaIguatemi;

public class App {
	public static void main(String[] args) {

		Loja lojaCentro = new LojaCentro();
		lojaCentro.pedirCelular(Modelo.IPHONE);

		System.out.println();

		Loja lojaIguatemi = new LojaIguatemi();
		lojaIguatemi.pedirCelular(Modelo.IPHONE);

	}
}
