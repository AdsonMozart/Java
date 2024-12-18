package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String NOME;
	final List<Compra> compras = new ArrayList<Compra>();
	
	
	Cliente(String nome) {
		this.NOME = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Compra compra: compras) {
			valorTotal += compra.obterValorTotal();
		}
		return valorTotal;
	}
	
	// Criar um método calculando o quanto de dinheiro esse cliente gastou na loja
	// obterValorTotal()

}

