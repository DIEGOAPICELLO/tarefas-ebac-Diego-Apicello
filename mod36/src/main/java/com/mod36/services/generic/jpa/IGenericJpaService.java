package com.mod36.services.generic.jpa;

import com.mod36.domain.jpa.Persistente;
import com.mod36.exceptions.DAOException;
import com.mod36.exceptions.MaisDeUmRegistroException;
import com.mod36.exceptions.TableException;
import com.mod36.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaService <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
