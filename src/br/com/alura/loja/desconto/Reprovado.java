package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void Finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
