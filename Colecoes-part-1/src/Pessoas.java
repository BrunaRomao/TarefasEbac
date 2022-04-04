public class Pessoas {
	String nome;
	String sexo;
boolean grupoF(String sexo){
	if(sexo.equalsIgnoreCase("Feminino"))return true;
	else return false;
}
boolean grupoM(String sexo){
	if(sexo.equalsIgnoreCase("Masculino")) return true;
	else return false;
}
}
   