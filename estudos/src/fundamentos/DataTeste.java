package fundamentos;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2021;
		
		var d2 = new Data();
		d2.dia = 3;
		d2.mes = 2;
		d2.ano = 2002;
		
		var d3 = new Data(01, 01, 1970);
				
		String 	dataFormatada1 = d1.obterDataManualmente();
		String 	dataFormatada3 = d3.obterDataManualmente();
		
		System.out.println(d1.obterDataManualmente());
		System.out.println(d2.obterDataManualmente());
		
		System.out.println(dataFormatada3);
	}
}
