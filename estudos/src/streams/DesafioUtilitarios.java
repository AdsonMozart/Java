package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioUtilitarios {

	StringBuilder inverso;

	public final static UnaryOperator<String> invertendo = exemplo -> new StringBuilder(exemplo).reverse().toString();
	public final static Function<String, Integer> retornandoTipo = exemplo -> Integer.parseInt(exemplo, 2);
	
			
			
	
}
