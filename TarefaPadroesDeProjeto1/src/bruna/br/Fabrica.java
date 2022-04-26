package bruna.br;

public abstract class Fabrica {
	
		public Carro criacao (String pedidoFeito){
			Carro carro = pegarCarro(pedidoFeito);
			carro = prepararCarro(carro);
			return carro;
		
		}

		public Carro prepararCarro(Carro carro){
			carro.limpeza();
			carro.checarMotor();
			carro.abastecer();
			return carro;	
		}
		
		abstract Carro pegarCarro(String pedidoFeito);

}
	