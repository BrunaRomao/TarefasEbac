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
		System.out.println(getClass().getSimpleName()+ " j� est� limpo e a cor escolhida (" + cor.toLowerCase()+ ") est� brilhando.");
	}
	
	public void checarMotor(){
		System.out.println(getClass().getSimpleName()+ " j� checado pelo mec�nico, tudo est� OK.");
		
	}
	
	public void abastecer(){
		System.out.println( getClass().getSimpleName() + " est� com tanque " + combustivel.toLowerCase()+".");
	}
	
	public void ligarMotor(){
		System.out.println("O tanque est�  " + combustivel + ",  motor est� ligado e pronto com pot�ncia " + potencia+".");
		
	}
	

}
