package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	public void Aprovar(Orcamento orcamento) {
		throw new DomainException("Impossível aprovar orçamento!");
	}
	public void Reprovar(Orcamento orcamento) {
		throw new DomainException("Impossível reprovar orçamento!");
	}
	public void Finalizar(Orcamento orcamento) {
		throw new DomainException("Impossível finalizar orçamento!");
	}

}
