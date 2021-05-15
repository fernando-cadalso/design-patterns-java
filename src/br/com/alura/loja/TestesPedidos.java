package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoSGBD;

public class TestesPedidos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("500.00"), Integer.parseInt("3"));
		String cliente = "Cliente";
		GerarPedido gerador = new GerarPedido(orcamento, cliente, 
				Arrays.asList(new SalvarPedidoNoSGBD(), 
						new EnviarEmailPedido()));
		gerador.executa();
	}
}
