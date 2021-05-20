package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class IPI extends Imposto{

	public IPI(Imposto imposto) {
		super(imposto);
	}

	public BigDecimal calcularImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.15"));
	}
}
