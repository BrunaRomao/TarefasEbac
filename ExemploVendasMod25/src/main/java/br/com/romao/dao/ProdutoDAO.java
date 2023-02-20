package br.com.romao.dao;

import java.util.Collection;

import br.com.romao.dao.generic.GenericDAO;
import br.com.romao.domain.Produto;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

	@Override
	public Class<Produto> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {
		// TODO Auto-generated method stub
		
	} 

	

}
