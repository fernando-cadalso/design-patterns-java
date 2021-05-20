package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.IPI;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteCalcularImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), 3);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal valorImpostos = calculadora.calcular(orcamento, new IPI(new ISS(new ICMS(null))));
		System.out.println(valorImpostos);
	}

}
