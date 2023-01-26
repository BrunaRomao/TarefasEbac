import Dao.ContratoDao;
import Dao.ContratoDaoMock;
import Dao.IContratoDao;
import Service.ContratoService;
import Service.IContratoServiceTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author bruna
 */

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoServiceTest service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso",retorno);
    }
    @Test (expected = UnsupportedOperationException.class)
    public void esperandoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoServiceTest serviceTest = new ContratoService(dao);
        String retorno = serviceTest.salvar();
        Assert.assertEquals("Sucesso",retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoServiceTest serviceTest = new ContratoService(contratoDao);
        String retorno = serviceTest.buscar();
        Assert.assertEquals("Busca realizada",retorno);

    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperandoErroNoBuscarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoServiceTest serviceTest = new ContratoService(dao);
        String retorno = serviceTest.salvar();
        Assert.assertEquals("Busca realizada", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoServiceTest serviceTest = new ContratoService(contratoDao);
        String retorno = serviceTest.excluir();
        Assert.assertEquals("Excluído com sucesso",retorno);

    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperandoErroNoExcluirComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoServiceTest serviceTest = new ContratoService(dao);
        String retorno = serviceTest.salvar();
        Assert.assertEquals("Excluído com sucesso", retorno);
    }

    @Test
    public void atualizarTest(){
        IContratoDao contratoDao = new ContratoDaoMock();
        IContratoServiceTest serviceTest = new ContratoService(contratoDao);
        String retorno = serviceTest.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void esperandoErroNoAtualizadoComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoServiceTest serviceTest = new ContratoService(dao);
        String retorno = serviceTest.salvar();
        Assert.assertEquals("Atualizado", retorno);
    }
}
