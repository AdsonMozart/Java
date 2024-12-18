package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// com .andThem você vai executando uma função depois da outra
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);
		
		// com .compose você vai executando a função que vem antes, ou seja, da mesma forma só que ao contrário
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);

	}
}
