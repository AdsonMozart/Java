package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc circ1 = new AreaCirc();
		circ1.raio = 2;
		
		var circ2 = new AreaCirc();
		circ2.raio = 15;
		
		var circ3 = new AreaCirc();
		circ3.raio = 298;
		
		var circ4 = new AreaCirc();
		circ4.raio = 99;
		
		System.out.printf("A area total da primeira circunferencia é de: %.2f centímetros\n",circ1.obterAreaCirc());
		System.out.printf("A area total da segunda circunferencia é de: %.2f centímetros\n",circ2.obterAreaCirc());
		System.out.printf("A area total da terceira circunferencia é de: %.2f centímetros\n",circ3.obterAreaCirc());
		System.out.printf("A area total da quarta circunferencia é de: %.2f centímetros\n",circ4.obterAreaCirc());
	
	}
}
