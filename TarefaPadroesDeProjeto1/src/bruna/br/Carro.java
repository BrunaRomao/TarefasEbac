package bruna.br;

public abstract	 class Carro {
	
	private int potencia;
	private String combustivel;
	private String cor;
	
	public Carro (int potencia, String combustivel, String cor){
		this.potencia = potencia;
		this.combustivel = combustivel;
		this.cor = cor;
		
	}
	
	public void limpeza(){
		System.out.println(getClass().getSimpleName()+ " já está limpo e a cor escolhida (" + cor.toLowerCase()+ ") está brilhando.");
	}
	
	public void checarMotor(){
		System.out.println(getClass().getSimpleName()+ " já checado pelo mecânico, tudo está OK.");
		
	}
	
	public void abastecer(){
		System.out.println( getClass().getSimpleName() + " está com tanque " + combustivel.toLowerCase()+".");
	}
	
	public void ligarMotor(){
		System.out.println("O tanque está  " + combustivel + ",  motor está ligado e pronto com potência " + potencia+".");
		
	}
	

}
