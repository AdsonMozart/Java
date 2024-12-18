package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		
		// .put usado tanto para incluir quanto para alterar o valor de uma determinada chave
		usuarios.put(1, "Arlan");
		System.out.println(usuarios);
		usuarios.put(1, "Adson");
		System.out.println(usuarios);
		
		usuarios.put(2, "Gustavo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		// .size retorna o tamanho do dicionário(map);
		System.out.println(usuarios.size());
		// .isEmpty retorna se está vazio ou não;
		System.out.println(usuarios.isEmpty());
		// .keySet retorna todas as chaves;
		System.out.println(usuarios.keySet());
		// .values retorna todos os valores;
		System.out.println(usuarios.values());
		// .entreSet retorna todas as chaves e valores;
		System.out.println(usuarios.entrySet());
		
		// .containsKey retorna se no conjunto possui a chave indicada;
		System.out.println(usuarios.containsKey(4));
		// .containsValues retorna se no conjunto possui o valor indicada;
		System.out.println(usuarios.containsValue("Rafaela"));
		
		// .get retorna o valor da chave indicada;
		System.out.println(usuarios.get(4));
		
		for(int chave: usuarios.keySet()) {
			System.out.print(chave + " ");
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro + " ");
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}
}
