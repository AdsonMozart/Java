package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		// Primeira maneira de percorrer e exibir todos os itens da lista
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		// Segunda maneira de percorrer e exibir todos os itens da lista
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		// Terceira maneira de percorrer e exibir todos os itens da lista
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		// Outra maneira de percorrer e exibir todos os itens da lista
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		// Uma outra maneira de percorrer e exibir todos os itens da lista
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("OI! Meu nome é " + nome);
	}
}
