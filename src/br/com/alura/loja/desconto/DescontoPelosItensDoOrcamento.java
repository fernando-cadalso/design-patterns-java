package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoPelosItensDoOrcamento extends Desconto {

	public DescontoPelosItensDoOrcamento(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		/*
		 * Uma regra de negócio foi adicionada para orçamentos com mais de 5 itens
		 * receberem desconto de 10%.
		 */
		return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getQuantidadeDeItens() > 5;
	}
}
