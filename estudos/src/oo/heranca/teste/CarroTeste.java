package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.frear();
		ferrari.frear();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println(ferrari.velocidadeAtual + "\n");
		
		Fusca fusca = new Fusca(300);
		System.out.println(fusca.velocidadeAtual);
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		System.out.println(fusca.velocidadeAtual);
		fusca.frear();
		fusca.frear();
		fusca.frear();
		System.out.println(fusca.velocidadeAtual);
		fusca.frear();
		fusca.frear();
		System.out.println(fusca.velocidadeAtual);
		
	}
}
