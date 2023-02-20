package br.com.romao.services;

import br.com.romao.dao.generic.IGenericDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;
import br.com.romao.services.generics.IGenericService;

public interface IclienteService extends IGenericService<Cliente,Long> {

	Boolean salvar(Cliente cliente)throws TipoChaveNaoEncontradaException;
	
	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente)throws TipoChaveNaoEncontradaException;

	Boolean cadastrar(Cliente cliente)throws TipoChaveNaoEncontradaException;




	
}
