package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// .add se a pilha for tamanho limitado, você adicionar um excedente ele retorna true ou false;
		livros.add("O Pequeno Principe");
		// .push se a pilha for tamanho limitado, você adicionar um excedente ele retorna erro;
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		
		// .peek pega o último adicionado da pilha, se a pilha estiver vazia vai retornar nulo;
		System.out.println(livros.peek());
		// .element pega o último adicionado da pilha, se a pilha estiver vazia vai retornar erro;
		System.out.println(livros.element());
		// .poll ele retorna o último adicionado da pilha porém já removendo, se não houver mais ninguém retorna nulo;
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
	}

}
