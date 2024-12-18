package fundamentos;

public class Inferencia {
	
	//Em Java você não consegue alterar o tipo da variável uma vez que ela for declarada
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "...";
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		
		// Só é possível declarar uma variável e depois iniciar se você já declarar o tipo dessa variável
		
		double d; // Variável foi somente declarada
		d = 123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi utilizada
		
		double e;
		e = 123.45;
		System.out.println(e);
	}

}
