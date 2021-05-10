package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoPeloValorDoOrcamento extends Desconto {

	public DescontoPeloValorDoOrcamento(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		/*
		 * Nova regra do negócio adicionada para orçamentos com valores maiores que
		 * 500,00 recebem 5% de desconto.
		 */
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
