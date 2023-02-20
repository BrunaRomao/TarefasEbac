package br.com.romao.dao;

import java.util.Collection;

import br.com.romao.domain.Cliente;

public class ClienteDAOMock implements IclienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		return true;
		
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		Cliente cliente =  new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Cliente consultar(Long valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
