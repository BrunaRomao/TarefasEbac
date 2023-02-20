package br.com.romao.dao;

import br.com.romao.dao.generic.GenericDAO;
import br.com.romao.domain.Venda;
import br.com.romao.domain.Venda.Status;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;


public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Venda> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarDados(Venda entity, Venda entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

}
