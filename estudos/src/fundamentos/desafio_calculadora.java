package fundamentos;

import java.util.Scanner;

public class desafio_calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		Double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número inteiro: ");
		Double num2 = entrada.nextDouble();
		
		System.out.println("Digite agora o símbolo da operação que deseja realizar: ");
		String operador = entrada.next();		
		
		//Lógica
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		entrada.close();
		
		
	}

}
