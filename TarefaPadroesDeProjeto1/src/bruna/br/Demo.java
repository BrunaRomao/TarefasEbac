package bruna.br;

public class Demo {
	
	public static void main (String[]args){
		
		Cliente cliente = new Cliente("A",false);
		Fabrica fabrica = getFabrica(cliente);
		Carro carro = fabrica.criacao(cliente.getPedidoDeCompra());
		carro.ligarMotor();
		
	}

	private static Fabrica getFabrica(Cliente cliente){
		if(cliente.comContrato()){
			return new FabricaComContrato();
		}else{
			return new FabricaSemContrato();
			
		}
		
	}
}


	