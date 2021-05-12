package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {

	private Orcamento orcamento;
	private String cliente;

	public GeraPedido(Orcamento orcamento, String cliente) {
		this.orcamento = orcamento;
		this.cliente = cliente;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void executa() {
		
		Pedido novoPedido = new Pedido(this.cliente, LocalDateTime.now(), this.orcamento);
		
		System.out.println("Salva os dados num SGBD.");
		System.out.println("Envia um e-mail para cliente.");
		System.out.println("Qualquer outra ação ou comando que atenda a regra do negócio.");
	}

}
