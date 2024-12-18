package oo.polimorfismo;

public class Pessoa {

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	
	// Método comer COMIDA
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	
	// getter
	public double getPeso() {
		return peso;
	}
	//setter
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
