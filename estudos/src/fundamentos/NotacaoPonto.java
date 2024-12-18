package fundamentos;

public class NotacaoPonto {

		public static void main(String[] args) {
			
			double a = 2.3;
			String s = "Boa tarde X";
			s = s.replace("X", "Senhora");
			s = s.toUpperCase();
			s = s.concat("!!!");
			
			
			System.out.println(s);
			System.out.println(a);
			
		}
}
