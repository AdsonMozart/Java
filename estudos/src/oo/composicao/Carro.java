package oo.composicao;

public class Carro {

	Motor motor;
	
	Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
		System.out.println("Cathuuca!");
	}
	
	void desligar() {
		motor.ligado = false;
		System.out.println("Turn OOoof!");
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
