package lambdas;

@FunctionalInterface
public interface Calculo {

	//O que importa é ter SOMENTE 1 método abstract sem definição (bloco de código) para que possa substiuir na aplicação por LAMBDA
	public abstract double executar(double a, double b);
	
	//Podem existir diversos métodos default
	default String legal() {
		return "legal";
	}
	
	//Podem existir diversos métodos static
	static String muitoLegal() {
		return "Muito legal";
	}
	
}
