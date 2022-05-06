import java.util.List;
import java.util.stream.Stream;;

public class App {
	

	public static void main (String[] args){
		List<Pessoa> lista = new Pessoa().pessoas();
	
		lista.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino"))
		.forEach(p -> System.out.println(p.getNome()));
		
				
		
		
	}

}
