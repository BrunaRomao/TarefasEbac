import Dao.ClienteDao;
import Dao.ClienteDaoMock;
import Dao.iClienteDao;
import Service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTeste {


    @Test
    public void salvarTest(){
        iClienteDao mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String retorno = clienteService.salvar();

        Assert.assertEquals("Sucesso",retorno);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void erroEsperado(){
        iClienteDao mockDao = new ClienteDao();
        ClienteService clienteService = new ClienteService(mockDao);
        String retorno = clienteService.salvar();

        Assert.assertEquals("Sucesso",retorno);
    }


}
