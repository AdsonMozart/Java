package exerciciosExternos;

import java.util.Scanner;

public class Exercicio6 {
	
//	Escreva um programa que, com base em uma temperatura em graus celsius, a converta 
//	e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
//		F = C * 1.8 + 32;
//		K = C + 273.15;
//		Re = C * 0.8; 
//		Ra = C * 1.8 + 32 + 459.67;
			
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			System.out.println("Digite a temperatura em graus Cº: ");
			double celsius = entrada.nextDouble();
			
			double farenheit = celsius * 1.8 + 32;
			double kelvin = celsius + 273.15;
			double rankine = celsius * 1.8 + 32 + 459.67;
			double reaumur = celsius * 0.8;
			
			System.out.println(farenheit);
			System.out.println(kelvin);
			System.out.println(rankine);
			System.out.println(reaumur);
		}

}
