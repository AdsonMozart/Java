package fundamentos;

import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro qualquer: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 ==0) {
			System.out.println("O número inserido é um número PAR!");
		} else {
			System.out.println("O número inserido é um número ÍMPAR!");
		}
		
		entrada.close();
	}

}
