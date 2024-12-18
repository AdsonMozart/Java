package fundamentos;

import java.util.Scanner;

public class DesafioTresEstruturasDeControle {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		float notaUm = entrada.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float notaDois = entrada.nextFloat();
		
		float media = (notaUm + notaDois) / 2;
		
		if (media >= 7 && media <= 10) {
			System.out.printf("Aprovado! Média: %.1f", media);
			} else if (media >= 4 && media <= 7) {
				System.out.printf("Recuperação! Média: %.1f", media);
				} else if (media >= 0 && media <= 4) {
					System.out.printf("Reprovado! Média: %.1f", media);
					}
		else {
			System.out.println("Media inválida!");
		}
				
			

		entrada.close();

	}
}
