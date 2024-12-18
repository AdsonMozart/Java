package ExerciciosRelacionamentos;

import java.util.Scanner;

public class Usuario {

	// Principais variáveis
	String nome;
	double saldo;
	Celular celular;
	
	// Atributos auxiliares
	Usuario (String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	// #2 Ativar o chip caso ele tenha comprado o celular;
	void ativarChip(Celular celular) {
		celular.ativacaoChip = true;			
	}
	
	// #1 Comprar o celular se ele tiver saldo suficiente;
	String comprarCelular(Celular celular) {
		if(saldo >= celular.preco) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("\nDeseja ativar o chip? (sim/não)");
			String resposta = entrada.next().toLowerCase();
				if (resposta.equals("sim")) {
					ativarChip(celular);
					System.out.println("CHIP ATIVADO COM SUCESSO!");
				} else if (resposta.equals("não")) {
					System.out.println("CHIP AINDA NÃO ATIVADO, VOLTE SEMPRE!");
				} else {
					System.out.println();
				}
			saldo -= celular.preco;
			System.out.println("COMPRA REALIZADA! \n\n");					
			return "SALDO DISPONÍVEL PARA COMPRA!";
		} else {
			return "SALDO INSUFICIENTE";
		}
	}
	
	String consultarAtivacaoChip() {
		if(celular.ativacaoChip == true) {
			return "O CHIP JÁ FOI ATIVADO!";
		} else {
			return "O CHIP CONSTA PENDÊNCIA DE ATIVAÇÃO!";
		}
	}
	
//	void fazerChamada() {
//		if(celular.ativo) {
//			
//		}
//	}
}
