package br.com.mod35.dao.generic;

import br.com.mod35.dao.Persistente;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.MaisDeUmRegistroException;
import br.com.mod35.exceptions.TableException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException, TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}