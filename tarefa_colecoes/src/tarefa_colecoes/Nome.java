package tarefa_colecoes;
import java.util.*;

public class Nome {
	public static void main(String args[]){
	nome();
	nomeSexo();
	
}

	private static void nome() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite nomes separados por vírgula");
		String nomes = scanner.nextLine();
		
		String[] nome = nomes.split(",");
        List lista = new ArrayList(Arrays.asList(nome));
		Collections.sort(lista);
		System.out.println(lista);
	}
	
	private static void nomeSexo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite nome e sexo separados por (-) sem espaço");
		String nome1 = scanner.nextLine();
		String nome2 = scanner.nextLine();
		String nome3 = scanner.nextLine();
		String nome4 = scanner.nextLine();
	
		String[] nomeU = nome1.split ("-");
		String[] nomeD = nome2.split ("-");
		String[] nomeT = nome3.split ("-");
		String[] nomeQ = nome4.split ("-");
		
		System.out.println("**Grupo Feminino**");
		if (nomeU[1].equalsIgnoreCase("F")){
			System.out.println(nomeU[0]);
		}
		if (nomeD[1].equalsIgnoreCase("F")){
			System.out.println(nomeD[0]);
		}
		
		if (nomeT[1].equalsIgnoreCase("F")){
			System.out.println(nomeT[0]);
		}
		if (nomeQ[1].equalsIgnoreCase("F")){
			System.out.println(nomeQ[0]);
		}
		
		{
	    System.out.println("**Grupo Masculino**");
		if (nomeU[1].equalsIgnoreCase("M")){
			System.out.println(nomeU[0]);
		}
		if (nomeD[1].equalsIgnoreCase("M")){
			System.out.println(nomeD[0]);
		}
		if (nomeT[1].equalsIgnoreCase("M")){
			System.out.println(nomeT[0]);
		}
		if (nomeQ[1].equalsIgnoreCase("M")){
			System.out.println(nomeQ[0]);
		}
		
			
		
		
	    }
	}
	
}

			

	
	

