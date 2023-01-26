package Service;

import Dao.ClienteDao;
import Dao.iClienteDao;

public class ClienteService {
    private iClienteDao clienteDao;

    public ClienteService(iClienteDao clienteDao){
        //clienteDao = new ClienteDao();
        this.clienteDao= clienteDao;

    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
