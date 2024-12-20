package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		System.out.println("Usando composição...");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(print);
	}
}
