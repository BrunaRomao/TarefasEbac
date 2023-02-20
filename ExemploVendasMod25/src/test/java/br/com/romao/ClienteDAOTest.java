package br.com.romao;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.romao.dao.ClienteDAO;
import br.com.romao.dao.ClienteDAOMock;
import br.com.romao.dao.IclienteDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	
	private IclienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Bruna");
		cliente.setCidade("Joinville");
		cliente.setEndereco("End");
		cliente.setEstado("SC");
		cliente.setNumero(1240);
		cliente.setTel(479898989789L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(101101010110L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
	
	
	
	
	

}
