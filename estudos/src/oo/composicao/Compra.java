package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Item item: itens) {
			valorTotal += item.quantidade * item.preco;
		}
		return valorTotal;
	}
	
//	String exibirNomes() {
//		String primeiroNome = "";
//		for(Item nome: itens) {
//			return Item item.nome;
//		}
//	}
}
