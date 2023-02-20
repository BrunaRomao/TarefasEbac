package br.com.romao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.romao.dao.ClienteDAOMock;
import br.com.romao.dao.IclienteDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;
import br.com.romao.services.ClienteService;
import br.com.romao.services.IclienteService;

public class ClienteServiceTest {
	
	private Cliente cliente;
	
	private IclienteService clienteService;
	
	public ClienteServiceTest() {
		IclienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		

		cliente = new Cliente ();
		cliente.setCpf(12312312312L);
		cliente.setNome("Bruna");
		cliente.setCidade("Joinville");
		cliente.setEndereco("Endereco");
		cliente.setEstado("SC");
		cliente.setNumero(100);
		cliente.setTel(12345678L);
		
		
		
	}
	
	@Test
	public void pesquisarCliente() {
	
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
		
		
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
		
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Bruna Romao");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Bruna Romao", cliente.getNome()); 
	}
	
	
	

}
