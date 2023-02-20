package br.com.romao.dao;

import br.com.romao.dao.generic.IGenericDAO;
import br.com.romao.domain.Venda;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
	
	
}
