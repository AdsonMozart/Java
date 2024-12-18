package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioUtilitarios {

	StringBuilder inverso;
	
	
	public final static Function<Integer, String> binarizando = exemplo -> Integer.toBinaryString(exemplo);
	public final static UnaryOperator<StringBuilder> invertendo = exemplo -> exemplo.reverse();
	public final static Function<String, Integer> retornandoTipo = exemplo -> Integer.parseInt(exemplo); 
	
			
			
	
}
