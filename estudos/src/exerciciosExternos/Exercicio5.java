package exerciciosExternos;

import java.util.Scanner;

public class Exercicio5 {

//	 Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//	 antecessor e seu sucessor.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		
		System.out.printf("Analisando o número: %d, seu antecessor é: %d e seu sucessor é: %d", num, antecessor, sucessor);
		entrada.close();
	}
	
	
	
	
}
