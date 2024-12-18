package fundamentos;

import java.util.Scanner;

public class DesafioUmEstruturasDeControle {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			if(numero >= 0 && numero <= 10) {
				System.out.printf("O número digitado: %d, é PAR e está entre 0 e 10!", numero);
			} else {
				System.out.printf("O número digitado: %d, é PAR porém não está entre 0 a 10!", numero);
			}
		} else {
			System.out.printf("O número digitado: %d, NÃO é PAR!", numero);
		}
		entrada.close();
	}
}
