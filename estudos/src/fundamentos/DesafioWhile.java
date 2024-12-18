package fundamentos;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double somaDasNotas = 0;
		int quantidadeDeNotas = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if (nota >= 0.0 && nota <= 10.0) {
				System.out.printf("******* A nota: %.1f foi adicionada com sucesso! *******\n\n", nota);
				quantidadeDeNotas++;
				somaDasNotas += nota;
				System.out.printf("Notas adicionadas: %d\n\n", quantidadeDeNotas);
			} else if (nota != -1){
				System.out.println("Nota inválida, tente novamente! ;)");
			}
		}
		
		//Calcular a média
		double media = somaDasNotas / quantidadeDeNotas;
		System.out.printf("Você saiu do programa! A sua média obtida foi:  %.1f", media);
		
		entrada.close();

	}
}
