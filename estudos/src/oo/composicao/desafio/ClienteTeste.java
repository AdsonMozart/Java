package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
			
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88) , 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caneta", 10, 10);
		compra1.adicionarItem(new Produto("Impressora", 998.90) , 1);
		
		
		Cliente c1 = new Cliente("Adson");
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		System.out.println(c1.obterValorTotal());
		
		
		
		
		
//		
//		Cliente c1 = new Cliente("Gustavo");
//		Cliente c1 = new Cliente("Ailton");
//		Cliente c1 = new Cliente("Ítalo");
	}
}
