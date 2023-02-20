package br.com.romao;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.romao.services.ProdutoService;
import br.com.romao.dao.IProdutoDAO;
import br.com.romao.dao.ProdutoDAOMock;
import br.com.romao.domain.Produto;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;
import br.com.romao.services.IProdutoService;

public class ProdutoServiceTest {
	
private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDAOMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Bruna Romao");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Bruna Romao", produto.getNome());
	}

}
