package br.com.romao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.romao.main.dao.IProdutoDAO;
import br.com.romao.main.dao.ProdutoDAO;
import br.com.romao.main.domain.Produto;

public class ProdutoTest {
		
		private IProdutoDAO produtoDAO;
		
		@Test
		public void cadastrarTest() throws Exception {
			produtoDAO  = new ProdutoDAO();
			Produto produto = new Produto();
			produto.setCodigoProduto("10");
			produto.setNomeProduto("Camiseta");
			

			Integer qtd = produtoDAO.cadastrar(produto);
			assertTrue(qtd == 1);
			
			Produto produtoBD = produtoDAO.buscar("10");
			assertNotNull(produtoBD);
			assertEquals(produto.getCodigoProduto(),produtoBD.getCodigoProduto());
			assertEquals(produto.getNomeProduto(),produtoBD.getNomeProduto());
			
			
			Integer qtdDel = produtoDAO.excluir(produtoBD);
			assertTrue(qtdDel == 1);
			
		}
		
		@Test
		public void buscarTest() throws Exception{
			produtoDAO = new ProdutoDAO();
			
			Produto produto = new Produto();
			produto.setCodigoProduto("10");
			produto.setNomeProduto("Camiseta");
			Integer count = produtoDAO.cadastrar(produto);
			assertTrue(count == 1);
			
			Produto produtoBD = produtoDAO.buscar("10");
			assertNotNull(produtoBD);
			assertEquals(produto.getCodigoProduto(),produtoBD.getCodigoProduto());
			assertEquals(produto.getNomeProduto(),produtoBD.getNomeProduto());
			
			
			Integer countD = produtoDAO.excluir(produtoBD);
			assertTrue(countD == 1);
			
		}
		
		@Test
		public void excluirTest() throws Exception {
			
			produtoDAO  = new ProdutoDAO();
			Produto produto = new Produto();
			produto.setCodigoProduto("10");
			produto.setNomeProduto("Camiseta");
			
			Integer count = produtoDAO.cadastrar(produto);
			assertTrue(count == 1);
			
			Produto produtoBD = produtoDAO.buscar("10");
			assertNotNull(produtoBD);
			assertEquals(produto.getCodigoProduto(), produtoBD.getCodigoProduto());
			assertEquals(produto.getNomeProduto(), produtoBD.getNomeProduto());
			
			Integer count1 = produtoDAO.excluir(produtoBD);
			assertTrue(count1 == 1);
			
			
		}
		
		@Test
		public void buscarTodosTest() throws Exception {
			produtoDAO  = new ProdutoDAO();
			
			Produto produto = new Produto();
			produto.setCodigoProduto("10");
			produto.setNomeProduto("Camiseta");
			Integer count = produtoDAO.cadastrar(produto);
			assertTrue(count == 1);
			
			Produto produtos = new Produto();
			produtos.setCodigoProduto("20");
			produtos.setNomeProduto("Test");
			Integer count2 = produtoDAO.cadastrar(produtos);
			assertTrue(count2 == 1);
			
			List<Produto> list = produtoDAO.buscarTodos();
			assertNotNull(list);
			assertEquals(2,list.size());
			
			int countDelete = 0;
			for(Produto client:list) {
				produtoDAO.excluir(client);
				countDelete++;	
			}
			assertEquals(list.size(),countDelete);
			list = produtoDAO.buscarTodos();
			assertEquals(list.size(),0);
				
	 }
		
		@Test
		public void atualizarTest() throws Exception {
			produtoDAO = new ProdutoDAO();
			Produto produto = new Produto();
			produto.setCodigoProduto("10");
			produto.setNomeProduto("Camiseta");
			Integer count = produtoDAO.cadastrar(produto);
			assertTrue(count == 1);
			
			Produto produtoBD = produtoDAO.buscar("10");
			assertNotNull(produtoBD);
			assertEquals(produto.getCodigoProduto(),produtoBD.getCodigoProduto());
			assertEquals(produto.getNomeProduto(), produtoBD.getNomeProduto());
		
			produtoBD.setCodigoProduto("20");
			produtoBD.setNomeProduto("Calça");
			Integer countUp = produtoDAO.atualizar(produtoBD);
			assertTrue(countUp == 1);
			
			Produto produtoBD2 = produtoDAO.buscar("10");
			assertNull(produtoBD2);
			
			Produto produtoBD3 = produtoDAO.buscar("20");
			assertNotNull(produtoBD3);
			assertEquals(produtoBD.getId(),produtoBD3.getId());
			assertEquals(produtoBD.getNomeProduto(),produtoBD3.getNomeProduto());
			assertEquals(produtoBD.getCodigoProduto(),produtoBD3.getCodigoProduto());
	
			List<Produto> list = produtoDAO.buscarTodos();
			
			for(Produto client :list) {
				produtoDAO.excluir(client);
			}
		}
		

		
		
			
		
		
	}


