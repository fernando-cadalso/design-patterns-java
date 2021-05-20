package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.Finalizado;
import br.com.alura.loja.desconto.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int qtdeItens) {
		this.valor = valor;
		this.quantidadeDeItens = qtdeItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.Aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.Reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.Finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}

}
