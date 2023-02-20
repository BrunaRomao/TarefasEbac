package br.com.romao.services;

import java.util.Collection;

import br.com.romao.dao.IProdutoDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.domain.Produto;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;
import br.com.romao.services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

	@Override
	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return null ;
	}

	@Override
	public Produto consultar(String codigo) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
	
		return produto;
	}

	@Override
	public Boolean cadastrar(Produto produto) {
		if(produto.equals(produto)) { 
			return true;
		}else return false;
	}

	@Override
	public void excluir(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean salvar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
