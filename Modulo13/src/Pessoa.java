
public abstract class Pessoa {

    private String nome;
    private String sobrenome;
   	
    
    public void imprimirNome(){
    	System.out.println("Nome: " + nome + " " + sobrenome);
    }   

    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
    
		
}
