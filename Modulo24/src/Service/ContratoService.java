package Service;

import Dao.IContratoDao;

public class ContratoService implements IContratoServiceTest {

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    public ContratoService() {

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluído com sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca realizada";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }
}
