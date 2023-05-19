package br.com.romao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.romao.main.dao.ClienteDAO;
import br.com.romao.main.dao.IClienteDAO;
import br.com.romao.main.domain.Cliente;

public class ClienteTest {
	
	private IClienteDAO clienteDAO;
	
	@Test
	public void cadastrarTest() throws Exception {
		clienteDAO  = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Bruna Romao");
		

		Integer qtd = clienteDAO.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = clienteDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(),clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = clienteDAO.excluir(clienteBD);
		assertTrue(qtdDel == 1);
		
	}
	
	@Test
	public void buscarTest() throws Exception{
		clienteDAO = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Bruna Romao");
		Integer count = clienteDAO.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente clienteBD = clienteDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer countD = clienteDAO.excluir(clienteBD);
		assertTrue(countD == 1);
		
	}
	
	@Test
	public void excluirTest() throws Exception {
		
		clienteDAO  = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Bruna Romao");
		
		Integer count = clienteDAO.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente clienteBD = clienteDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		Integer count1 = clienteDAO.excluir(clienteBD);
		assertTrue(count1 == 1);
		
		
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		clienteDAO  = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Bruna Romao");
		Integer count = clienteDAO.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente clientes = new Cliente();
		clientes.setCodigo("20");
		clientes.setNome("Test");
		Integer count2 = clienteDAO.cadastrar(clientes);
		assertTrue(count2 == 1);
		
		List<Cliente> list = clienteDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2,list.size());
		
		int countDelete = 0;
		for(Cliente client:list) {
			clienteDAO.excluir(client);
			countDelete++;	
		}
		assertEquals(list.size(),countDelete);
		list = clienteDAO.buscarTodos();
		assertEquals(list.size(),0);
			
 }
	
	@Test
	public void atualizarTest() throws Exception {
		clienteDAO = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Bruna Romao");
		Integer count = clienteDAO.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente clienteBD = clienteDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(),clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		clienteBD.setCodigo("20");
		clienteBD.setNome("Guilherme");
		Integer countUp = clienteDAO.atualizar(clienteBD);
		assertTrue(countUp == 1);
		
		Cliente clienteBD2 = clienteDAO.buscar("10");
		assertNull(clienteBD2);
		
		Cliente clienteBD3 = clienteDAO.buscar("20");
		assertNotNull(clienteBD3);
		assertEquals(clienteBD.getId(),clienteBD3.getId());
		assertEquals(clienteBD.getNome(),clienteBD3.getNome());
		assertEquals(clienteBD.getCodigo(),clienteBD3.getCodigo());
		
		List<Cliente> list = clienteDAO.buscarTodos();
		
		for(Cliente client :list) {
			clienteDAO.excluir(client);
		}
	}
	

	
	
		
	
	
}
