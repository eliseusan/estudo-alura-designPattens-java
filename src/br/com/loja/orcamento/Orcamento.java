package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor ;
	private int quantidaDeItens;
	
	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidaDeItens = quantidadeDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidaDeItens() {
		return quantidaDeItens;
	}
}
