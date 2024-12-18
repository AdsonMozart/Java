package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
	
		List<String> aprovados = Arrays.asList("Adson", "Arlan", "Gustavo", "Aniel");
		
		// Retornando os nomes da lista por um FOR
		System.out.println("----------Usando o FOR...----------");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		// Quebra de linha
		System.out.println();
		
		// Retornando os nomes da lista por um FOREACH
		System.out.println("----------Usando o FOREACH...----------");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		// Quebra de linha
		System.out.println();
		
		// Retornando os nomes da lista por um ITERATOR
		System.out.println("----------Usando o ITERATOR...----------");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Quebra de linha
		System.out.println();
		
		// Retornando os nomes da lista por um STREAM
		System.out.println("----------Usando o STREAM...----------");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //Laço interno!!!
		
	}
}
