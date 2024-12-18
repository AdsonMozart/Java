package fundamentos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataManualmente() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
