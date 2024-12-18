package exerciciosExternos;

import java.util.Scanner;

public class Exercicio4 {

//	 Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//	 calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//	 (1SM=R$788,00)

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner (System.in);
		 System.out.println("Digite o valor do seu salário: ");
		 double salario = entrada.nextDouble();	 
		 
		 final double SALARIOMINIMO = 1412;
		 
		 double qtdSalariosMin = (salario/SALARIOMINIMO);
		 
		 System.out.printf("%.1f", qtdSalariosMin);
		 entrada.close();
	}
		 
}