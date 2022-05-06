import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Collections;

public class Pessoa {
	
	private String nome;
	private String sexo;
	
	public  Pessoa(){
		
	}
	
	 public Pessoa(Pessoa pessoa) {
	        this(pessoa.getNome(), pessoa.getSexo());
	    }
	

	public Pessoa(String nome, String sexo){
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	
	  public List<Pessoa> pessoas(){
		Pessoa p1 = new Pessoa("Bruna","Feminino");
		Pessoa p2 = new Pessoa ("Guilherme","Masculino");
		Pessoa p3 = new Pessoa ("Cristiane","Feminino");
		Pessoa p4 = new Pessoa ("João","Masculino");
		return List.of(p1,p2,p3,p4);
	
		
	}
	

}
