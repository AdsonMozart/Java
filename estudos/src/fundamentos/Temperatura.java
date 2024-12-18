package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		//Conceito da fórmula é: (*F - 32) * 5/9 = Cº
		final double FATOR = 5.0/9.0;
		double farenheit = 150;
		final double CONVERSAO = farenheit - 32;
		double resultado = CONVERSAO * FATOR;
		
		System.out.println("O resultado é: " + resultado + "Cº!");
	}

}
