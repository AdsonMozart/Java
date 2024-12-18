package classe;

public class DesafioProdutoTeste {

	public static void main(String[] args) {
		
		DesafioProduto produto1 = new DesafioProduto("Geladeira", 5000);
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto1.adicionarMaisDesconto(0.25));

		
	}
}
