package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto novoImposto;
	
	public Imposto(Imposto imposto) {
		this.novoImposto = imposto;
	}

	protected abstract BigDecimal calcularImposto(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = calcularImposto(orcamento);
		BigDecimal valorNovoImposto = BigDecimal.ZERO;
		if (novoImposto != null) {
			valorNovoImposto = novoImposto.calcularImposto(orcamento);
		}
		
		return valorImposto.add(valorNovoImposto);
				
	}
}
