package exerciciosExternos;

import java.util.Scanner;

public class Exercicio3 {

//	Informar um saldo e imprimir o saldo com reajuste de 1%.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um Saldo: ");
		double saldo = entrada.nextDouble();
		
		double saldoReajustado = reajusteSaldo(saldo);
		
		System.out.println(saldoReajustado);
		
		entrada.close();		
	}
		
	public static double reajusteSaldo(double saldo) {
		return saldo * 1.01;	
		
	}
}
