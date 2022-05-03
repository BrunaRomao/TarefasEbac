import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Anotacao {
	public String nomeTabela(@Tabela("Tabela Annotation")String nome){
		return null;
	}
  
  
  public static void main (String args[]){
	  Anotacao anotacao = new Anotacao();
	  try{
		  Method metodo = anotacao.getClass().getMethod("nomeTabela",String.class); 
		  Annotation[][] ann = metodo.getParameterAnnotations();
		  for (int i = 0; i < ann.length;i++){
			  Annotation[] an = ann[i];
			  for (int j = 0; j< an.length; j++){
				  if(an[j] instanceof Tabela) {
						String name = ((Tabela)an[j]).value();
						System.out.println(name);
			  }
			  
		  }
		  
	 }  
		  
	  } catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	  
	 
	  
	

