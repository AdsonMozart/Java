package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// .add se a fila for tamanho limitado, você adicionar um excedente ele retorna erro;
		fila.add("Luan");
		// .offer se a fila for tamanho limitado e você tentar adicionar um excedente ele retorna false;
		fila.offer("Adson");
		// .poll ele retorna o próximo da fila porém já removendo, se não houver mais ninguém retorna nulo;
		fila.poll();
		// .peek pega o próximo da fila, se a lista estiver vazia vai retornar nulo;
		System.out.println(fila.peek());
		// .element pega o próximo da fila, se a fila estiver vazia vai retornar erro;
		System.out.println(fila.element());
		// .size pega o tamanho da fila;
		System.out.println(fila.size());
		// .remove remove o próximo da fila, se a fila estiver vazia ele retorna um erro;
		System.out.println(fila.remove());
		// .clear remove todos os elementos da fila;
		fila.clear();
		// .isEmpty retorna se a fial está vazia ou não;
		System.out.println(fila.isEmpty());
	}
}
