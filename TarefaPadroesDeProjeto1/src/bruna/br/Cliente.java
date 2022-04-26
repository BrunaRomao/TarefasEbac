package bruna.br;

public class Cliente {
	
	private String pedidoDeCompra;
	private boolean comContrato;
	
	public Cliente(String pedidoDeCompra, boolean comContrato){
		this.pedidoDeCompra = pedidoDeCompra;
		this.comContrato = comContrato;
	}
	
	public String getPedidoDeCompra(){
		return pedidoDeCompra;
	}
	
	public boolean comContrato(){
		return comContrato;
	}

}
