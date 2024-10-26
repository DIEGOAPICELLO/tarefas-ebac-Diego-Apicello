package com.mod36.dao.gereric.jpa;

import com.mod36.domain.jpa.Persistente;
import com.mod36.exceptions.DAOException;
import com.mod36.exceptions.MaisDeUmRegistroException;
import com.mod36.exceptions.TableException;
import com.mod36.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
