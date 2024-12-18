package ExerciciosRelacionamentos;

public class Celular {
	
	String nome;
	String operadoraChip;
	double preco;
	long numero;
	boolean ativacaoChip = false;
	Usuario usuario;
	
	Celular() {
		
	}
	
	Celular(String nome, String operadoraChip, double preco, long numero) {
		this.nome = nome;
		this.operadoraChip = operadoraChip;
		this.preco = preco;
		this.numero = numero;
	}
	
	Celular(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
