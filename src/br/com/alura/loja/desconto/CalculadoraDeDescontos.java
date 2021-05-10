package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		/*
		 * Aplica o padrão Chain of Responsability
		 */
		Desconto cadeiaDeDescontos = new DescontoPelosItensDoOrcamento(new DescontoPeloValorDoOrcamento(new SemDesconto(null)));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}

}
