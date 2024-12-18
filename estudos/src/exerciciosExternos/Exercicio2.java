package exerciciosExternos;

public class Exercicio2 {

//	 Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
//	 números 4, 5 e 6. A soma das duas médias. A média das médias.

	 public static void main(String[] args) {
		
		 double media1 = (8.9 + 7)/2;
		 System.out.printf("%.1f\n",media1);
		 double media2 = (4 + 5 + 6)/3;
		 System.out.printf("%.1f\n",media2);
		 double somaDasMedias = media1 + media2;
		 System.out.printf("%.1f\n",somaDasMedias);
		 double mediaDasMedias = (media1 + media2)/2;
		 System.out.printf("%.1f\n",mediaDasMedias);
	}
}
