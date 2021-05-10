package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto(Desconto proximo) {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return true;
	}

}
