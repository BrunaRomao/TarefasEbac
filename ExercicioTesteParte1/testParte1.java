package ExercicioTesteParte1;

import org.junit.Assert;
import org.junit.Test;
;

public class testParte1 {

    @Test
    public void testeClassePessoa(){
        Pessoa pessoa = new Pessoa();




        Assert.assertEquals("Feminino",pessoa.validacao());
        Assert.assertEquals("Feminino",pessoa.validacao1());
        Assert.assertEquals("Feminino",pessoa.validacao2());

    }





}