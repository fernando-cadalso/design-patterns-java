package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(args[0]), Integer.parseInt(args[1]));
		String cliente = args[2];
		GeraPedido gerador = new GeraPedido(orcamento, cliente);
		gerador.executa();
		
	}

}
