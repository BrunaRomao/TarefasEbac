
public class Programa {
	
	public static void main (String args[]){
		
		
		PessoaJuridica pessoaJ = new PessoaJuridica();
		pessoaJ.setNome("Guilherme");
		pessoaJ.setSobrenome("Hirai");
		pessoaJ.setCadastro("00012345");
		pessoaJ.imprimirNome();
		imprimir(pessoaJ);
		PessoaFisica pessoaF = new PessoaFisica ();
		pessoaF.setNome("Bruna");
		pessoaF.setSobrenome("Romão");
		pessoaF.setCadastro("123456");
		pessoaF.imprimirNome();
		imprimir(pessoaF);
		 
	}

	public static void imprimir (Pessoa pessoa){
	if (pessoa instanceof PessoaJuridica){
		PessoaJuridica pes = (PessoaJuridica) pessoa;
		System.out.println("CNPJ " + pes.getCadastro());
	}
	
	if (pessoa instanceof PessoaFisica){
		PessoaFisica pes = (PessoaFisica) pessoa;
		System.out.println("CPF " + pes.getCadastro());
	}
	

	

		
	}
}
