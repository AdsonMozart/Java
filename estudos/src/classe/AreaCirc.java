package classe;

public class AreaCirc {

	final static double PI = 3.14;
	double raio;
	
	double obterAreaCirc() {
		double area = PI * (raio * raio);
		return area;
	}
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	AreaCirc() {
		
	}
}
