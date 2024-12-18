package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você deseja informar?");
		int quantidadeDeNotas = entrada.nextInt();
		double[] notasDigitadas = new double[quantidadeDeNotas];
		
		for(int i = 0; i < notasDigitadas.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			notasDigitadas[i] = entrada.nextDouble();
			
		}
		System.out.println(Arrays.toString(notasDigitadas));
		
		double total = 0;
		for(double nota: notasDigitadas) {
			total += nota;
		}
		
		System.out.printf("A média do aluno é de: %.1f", total/quantidadeDeNotas);
		entrada.close();
	}
}
