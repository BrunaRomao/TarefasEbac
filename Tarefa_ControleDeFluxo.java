import java.util.Scanner;

public class Tarefa_ControleDeFluxo {
	 public static void main(String args []) {
	        Scanner s = new Scanner(System.in);
	        double nota1, nota2, nota3, nota4, media;
	       System.out.println("Digite o nome do aluno");
	       String nome = s.next();
	       
	        System.out.println("Digite a primeira nota");
	        nota1 = s.nextDouble();
	        
	        System.out.println("Digite a segunda nota");
	        nota2 = s.nextDouble();
	        
	        System.out.println("Digite a terceira nota");
	        nota3 = s.nextDouble();
	        
	        System.out.println("Digite a quarta nota");
	        nota4 = s.nextDouble();
	        
	        media = (nota1+nota2+nota3+nota4)/4;
	        
	        if(media>=7){
				System.out.println("Aluno " + nome + " está aprovado.");
	        }
			if (media<5){
				System.out.println("Aluno " + nome + " está reprovado.");
			}
			if (media>=5 && media<7){
				System.out.println("Aluno " + nome + " está em recuperação.");
			}
	
	
	
	 }

}
