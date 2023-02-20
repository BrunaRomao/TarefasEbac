package br.com.romao.services;

import br.com.romao.services.generics.IGenericService;
import br.com.romao.domain.*;


public interface IProdutoService extends IGenericService<Produto,String> {

	Produto consultar(String codigo);

	Boolean cadastrar(Produto produto);

	void excluir(String codigo);

	void alterar(Produto produto);

}
