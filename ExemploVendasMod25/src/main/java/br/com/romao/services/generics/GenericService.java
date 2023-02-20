package br.com.romao.services.generics;



import java.io.Serializable;
import java.util.Collection;

import br.com.romao.dao.IProdutoDAO;
import br.com.romao.dao.Persistente;
import br.com.romao.dao.generic.IGenericDAO;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;


public abstract class GenericService<T extends Persistente, E extends Serializable> implements IGenericService<T, E> {
		
		protected IGenericDAO<T,E> dao;
	
		public GenericService(IGenericDAO<T,E> dao) {
			this.dao = dao;
		}

		
		public Boolean salvar(T entity) throws TipoChaveNaoEncontradaException {
			return this.dao.cadastrar(entity);
		}

		
		public void excluir(E valor) {
			this.dao.excluir(valor);
		}

		
		public void alterar(T entity) throws TipoChaveNaoEncontradaException {
			this.dao.alterar(entity);
		}

		
		public T consultar(E valor) {
			return this.dao.consultar(valor);
		}

		
		public Collection<T> buscarTodos() {
			return this.dao.buscarTodos();
		}


		
	
	

}
