/**
 * 
 */
package br.com.romao.dao;

import java.util.Collection;

import br.com.romao.dao.generic.GenericDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;


/**
 * @author bruna
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IclienteDAO {



	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEndereco(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
 }







