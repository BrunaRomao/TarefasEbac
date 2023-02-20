package br.com.romao.dao.generic;

import java.util.Collection;
import br.com.romao.dao.Persistente;
import br.com.romao.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

  
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    
    public void excluir(E valor);

   
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

  
    public T consultar(E valor);

    
    public Collection<T> buscarTodos();
}
