package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteCalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 2);
		BigDecimal valorDoImposto = new CalculadoraDeDescontos().calcular(orcamento);
		System.out.println("Valor do desconto: " + valorDoImposto);
	}
}
