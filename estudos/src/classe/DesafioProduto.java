package classe;

public class DesafioProduto {

	String nome;
	double preco;
	static final double DESCONTO = 0.25;
	double descontoDuplo;
	
	double precoComDesconto() {
		return preco * (1 -DESCONTO);
	}
	
	double adicionarMaisDesconto(double descontoSecundario) {
		return preco * (DESCONTO + (1 - descontoSecundario));
	}
	
	DesafioProduto(String nomeInicial, double precoInicial, double descontoSecundario) {
		nome = nomeInicial;
		preco = precoInicial;
		descontoDuplo = descontoSecundario;
	}
	
	DesafioProduto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}	
}
