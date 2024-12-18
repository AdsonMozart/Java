package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari() {
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	

	

	
//	@Override
//	void acelerar() {
//		super.acelerar();
//	}

}
