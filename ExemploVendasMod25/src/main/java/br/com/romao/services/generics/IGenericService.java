package br.com.romao.services.generics;

import java.io.Serializable;
import java.util.Collection;

import br.com.romao.dao.Persistente;
import br.com.romao.domain.Cliente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable> {
	
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

 
    public void excluir(E valor);

  
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

   
    public T consultar(E valor);

   
    public Collection<T> buscarTodos();


    public Boolean salvar(T entity) throws TipoChaveNaoEncontradaException;

}
