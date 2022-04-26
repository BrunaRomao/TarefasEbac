package bruna.br;

public class FabricaComContrato extends Fabrica{

	@Override
	Carro pegarCarro(String pedidoFeito) {
		if("A".equals(pedidoFeito)){
			return new Onix(100,"cheio","branco");
		}else{
		return null;
	}
		
  }	
}
