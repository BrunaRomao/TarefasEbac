import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Scan {

			public static void main(String args[]){
				Scanner s = new Scanner(System.in);
				   
				Pessoas pessoa1 = new Pessoas();
				Pessoas pessoa2 = new Pessoas();
				Pessoas pessoa3 = new Pessoas();
				Pessoas pessoa4 = new Pessoas();
				
				System.out.println("Digite seu nome e seu sexo");
				pessoa1.nome = s.next();
				pessoa1.sexo = s.next();
				pessoa2.nome = s.next();
				pessoa2.sexo = s.next();
				pessoa3.nome = s.next();
				pessoa3.sexo = s.next();
				pessoa4.nome = s.next();
				pessoa4.sexo = s.next();
				
				
				List lista = new LinkedList();
				lista.add(pessoa1.nome);
				lista.add(pessoa1.sexo);
				lista.add(pessoa2.nome);
				lista.add(pessoa2.sexo);
				lista.add(pessoa3.nome);
				lista.add(pessoa3.sexo);
				lista.add(pessoa4.nome);
				lista.add(pessoa4.sexo);
				
				System.out.println("***Lista dos nomes e sexos***");
				System.out.println(lista);
				
				System.out.println("**Grupo Feminino**");
				if(pessoa1.grupoF(pessoa1.sexo))System.out.println(pessoa1.nome);
				if(pessoa2.grupoF(pessoa2.sexo))System.out.println(pessoa2.nome);
				if(pessoa2.grupoF(pessoa3.sexo))System.out.println(pessoa3.nome);
				if(pessoa2.grupoF(pessoa4.sexo))System.out.println(pessoa4.nome);
				
				System.out.println("**Grupo Masculino**");
				if(pessoa1.grupoM(pessoa1.sexo))System.out.println(pessoa1.nome);
				if(pessoa2.grupoM(pessoa2.sexo))System.out.println(pessoa2.nome);
				if(pessoa2.grupoM(pessoa3.sexo))System.out.println(pessoa3.nome);
				if(pessoa2.grupoM(pessoa4.sexo))System.out.println(pessoa4.nome);
			
			}			
		}
		
