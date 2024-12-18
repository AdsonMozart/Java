package exerciciosExternos;

import java.util.Scanner;

public class Exercicio1 {

//	Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
//	mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
//	(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o dia de seu nascimento: ");
		int dias = entrada.nextInt();
		System.out.println("Digite o mês de seu nascimento ");
		int meses = entrada.nextInt();
		System.out.println("Digite o ano de seu nascimento ");
		int anos = entrada.nextInt();
		
		int totalDias = ((anos - 2024) * 365) + ((meses - 11) * 12) + ((dias - 14) * 30);
		
		System.out.println(totalDias);
		entrada.close();
		
	}
}
