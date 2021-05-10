package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void Aprovar(Orcamento orcamento) {

		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void Reprovar(Orcamento orcamento) {

		orcamento.setSituacao(new Reprovado());
	}
}
