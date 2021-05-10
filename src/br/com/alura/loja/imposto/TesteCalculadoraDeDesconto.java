package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteCalculadoraDeDesconto {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		BigDecimal valorDoDesconto1 = new CalculadoraDeDescontos().calcular(orcamento1);
		BigDecimal valorDoDesconto2 = new CalculadoraDeDescontos().calcular(orcamento2);
		System.out.println("Valor do desconto 1: " + valorDoDesconto1);
		System.out.println("Valor do desconto 2: " + valorDoDesconto2);
	}
}
