package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GerarPedido {

	private Orcamento orcamento;
	private String cliente;
	private List<AcaoAposGerarPedido> acoes;

	public GerarPedido(Orcamento orcamento, String cliente, List<AcaoAposGerarPedido> acoes) {
		this.orcamento = orcamento;
		this.cliente = cliente;
		this.acoes = acoes;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void executa() {
		Pedido novoPedido = new Pedido(this.cliente, LocalDateTime.now(), this.orcamento);
		acoes.forEach(a -> a.executarAcao(novoPedido));
	}

}
