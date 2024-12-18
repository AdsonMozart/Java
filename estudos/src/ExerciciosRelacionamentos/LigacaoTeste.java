package ExerciciosRelacionamentos;

public class LigacaoTeste {

	public static void main(String[] args) {
		
		Celular celular1 = new Celular("Motorola", "oi", 5000, 988887777);
		Celular celular2 = new Celular("Samsumg", "claro", 9000, 987654321);
		
		Usuario user1 = new Usuario("Adson", 7000);
		
		System.out.println(user1.comprarCelular(celular1));
		
		
		
		
	}
}
