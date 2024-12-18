package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Adson", -45);
		p1.setIdade(230); // alterar 
		p1.setIdade(30);
		p1.setIdade(-47);
		
		System.out.println(p1.getNome() + ", " + p1.getIdade()); // ler
	}
}
