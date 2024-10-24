package br.com.mod35.dao.generic;

import br.com.mod35.dao.Persistente;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.MaisDeUmRegistroException;
import br.com.mod35.exceptions.TableException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(E valor) throws DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
