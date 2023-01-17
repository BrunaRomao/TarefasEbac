package ExercicioTesteParte1;
import java.util.ArrayList;
import java.util.List;
;
public class Pessoa {



    private String nome;
    private String sexo;

    public  Pessoa(){

    }

    @Override
    public String toString() {
        return  nome + " , " + sexo;
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




    public static String validacao() {
        List<Pessoa> lista = new ArrayList<>() {{
            add(new Pessoa("Bruna", "Feminino"));
            add(new Pessoa("Joana", "Feminino"));
            add(new Pessoa("Maria", "Feminino"));
        }};
        String primeiraPosicao= lista.get(0).getSexo();

        return primeiraPosicao;

    }

    public static String validacao1() {
        List<Pessoa> lista = new ArrayList<>() {{
            add(new Pessoa("Bruna", "Feminino"));
            add(new Pessoa("Joana", "Feminino"));
            add(new Pessoa("Maria", "Feminino"));
        }};
        String segundaPosicao= lista.get(1).getSexo();
        return segundaPosicao;

    }

    public static String validacao2() {
        List<Pessoa> lista = new ArrayList<>() {{
            add(new Pessoa("Bruna", "Feminino"));
            add(new Pessoa("Joana", "Feminino"));
            add(new Pessoa("Maria", "Feminino"));
        }};
        String terceiraPosicao= lista.get(2).getSexo();
        return terceiraPosicao;

    }


}