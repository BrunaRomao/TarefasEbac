/**
 * 
 */
package br.com.romao.services;

import br.com.romao.dao.ClienteDAO;
import br.com.romao.dao.IclienteDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;
import br.com.romao.services.generics.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IclienteService {
	

	private IclienteDAO clienteDAO;
	
	
	public ClienteService(IclienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.salvar(cliente);
		
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.buscarPorCPF(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
		
		
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
		
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
