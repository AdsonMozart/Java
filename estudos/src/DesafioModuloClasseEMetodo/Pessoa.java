package DesafioModuloClasseEMetodo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;		
	}
	
	double obterPeso() {
		return this.peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		} else {
			System.out.println("NULO!");
		}
	}
	
	String apresentar() {
		return "Olá, eu sou o "+ nome +" e tenho "+ peso +" Kgs.";
	}
}