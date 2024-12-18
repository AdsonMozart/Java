package fundamentos;

import java.util.Scanner;

public class Desafio_DiaDaSemana {

	public static void main(String[] args) {
		
//		Domingo = 1
//		Segunda = 2
//		Terça = 3
//		Quarta = 4
//		Quinta = 5
//		Sexta = 6
//		Sábado = 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String diaReferente = entrada.next();
		System.out.println(diaReferente);
		//String variavel = (x >2) ? ifhasfjafj : fasihfaubf
		
		if (diaReferente.equalsIgnoreCase("Domingo")) {
			System.out.print("1");
		} else if (diaReferente.equalsIgnoreCase("Segunda")) {
			System.out.print("2");
		} else if (diaReferente.equalsIgnoreCase("Terça")) {
			System.out.print("3");
		} else if (diaReferente.equalsIgnoreCase("Quarta")) {
			System.out.print("4");
		} else if (diaReferente.equalsIgnoreCase("Quinta")) {
			System.out.print("5");
		} else if (diaReferente.equalsIgnoreCase("Sexta")) {
			System.out.print("6");
		} else if (diaReferente.equalsIgnoreCase("Sábado")) {
			System.out.print("7");
		} else {
			System.out.println("Dia não reconhecido, por favor tente novamente!");
		}
		entrada.close();
	}
}
