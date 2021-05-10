package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	/*
	 * Definido como protected para que as classes
	 * derivadas possam acessar o atributo.
	 */
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if (deveCalcular(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveCalcular(Orcamento orcamento);
}
