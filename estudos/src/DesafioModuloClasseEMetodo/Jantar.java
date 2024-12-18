package DesafioModuloClasseEMetodo;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Feijão", 0.150);
		Comida c2 = new Comida("Arroz", 0.300);
		
		Pessoa p = new Pessoa("Adson", 62.8);
		
		System.out.println(p.apresentar());
		System.out.println(p.obterPeso());
		p.comer(c1);
		System.out.println(p.obterPeso());
		p.comer(c2);
		System.out.println(p.obterPeso());
		
		
	}
}
