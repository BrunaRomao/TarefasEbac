package bruna.br;

public class FabricaSemContrato extends Fabrica {

	@Override
	Carro pegarCarro(String pedidoFeito) {
		if ("A".equals(pedidoFeito)){
			return new JeepCompass(100,"cheio", "Preto");
		}else{
		return null;
	}
		
  }
}
	
	
	

	
