import java.util.ArrayList;
import java.util.List;


public class Generics {
	
	public static void main (String args []){	
		List<ICarros> carros = new ArrayList<>();
		carros.add(new JeepCompass ());
		carros.add(new JeepRenegade());
		carros.add(new JeepCommander());

		imprimir(carros);
		
	}
		
	public static void imprimir(List<?> carro) {
		        for (Object car : carro) {
		     System.out.println("Imprimi carro: " + car);
		
     }

  }
	
}

