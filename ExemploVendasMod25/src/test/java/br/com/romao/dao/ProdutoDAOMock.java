package br.com.romao.dao;

import java.util.Collection;

import br.com.romao.domain.Produto;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOMock implements IProdutoDAO {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto consultar(String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
